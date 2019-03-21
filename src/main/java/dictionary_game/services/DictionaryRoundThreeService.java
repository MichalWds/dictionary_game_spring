package dictionary_game.services;

import dictionary_game.repositories.LibraryRepository;
import dictionary_game.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DictionaryRoundThreeService {

    private Random random = new Random();
    private int round =0;
    private int count;
    private int index;
    private String EWord;
    private String PWord;


    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private User user;

    public int work() {

        count = (int) libraryRepository.count();
        index = random.nextInt((int) count);
        return index;
    }

    public String getFirstEnglishW() {

        return EWord = libraryRepository.findById(work() + 1).get().getEnglishWord();

    }

    public String getPolishW() {

        return PWord = libraryRepository.findById(index + 1).get().getPolishWord();
    }


    public String getHashEnglish(){

        String HashWord=EWord;
        for (int i = 0; i < round; i += 2) {
            char randomChar = HashWord.charAt(random.nextInt(HashWord.length()-1));
            HashWord = HashWord.replaceFirst(String.valueOf(randomChar), "#" );
            if(randomChar=='#' || randomChar==0) continue;

        }
            return HashWord;


    }


    public String getMessage(String name3) {



        while (name3 != null) {

            if (!name3.equals(EWord) || name3 == "") {
               user.substractPoints();
                round--;

                return "Niestety źle! -1pkt! ";
            } else {
              user.addPoint();

                round++;
                return "Tak trzymać! +1pkt! ";

            }
        }
        return "";
    }
}


