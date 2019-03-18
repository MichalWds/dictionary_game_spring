package dictionary_game.services;

import dictionary_game.LibraryRepository;
import dictionary_game.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin.liveconnect.ReplaceMethod;

import java.util.Random;

@Service
public class DictionaryRoundOneService {

    private Random random = new Random();
    int count;
    private int index;
    private String EWord;
    private String PWord;

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private User user;

    public void work() {

        count = (int) libraryRepository.count();
        index = random.nextInt((int) count);

    }

    public String getFirstEnglishW() {
        count = (int) libraryRepository.count();
        index = random.nextInt((int) count);
        return EWord = libraryRepository.findById(index + 1).get().getEnglishWord();

    }

    public String getPolishW() {

        return PWord = libraryRepository.findById(index + 1).get().getPolishWord();
    }



    public String getMessage(String name) {

        while (name != null) {

            if (!name.equals(PWord) || name == "") {
                user.substractPoints();
                return "Źle! -1pkt! " + " Twoja liczba punktów to : " + user.getNumberOfPoints();
            } else {
                user.addPoint();
                return "Dobrze! +1pkt! " + " Liczba Twoich punktów to : " + user.getNumberOfPoints();
            }
        }
        return "";
    }
}
//        } if (user.getNumberOfPoints()==10){
//                return "Brawo! Czas przejść do drugiej rundy!";
//            }
//            return getMessage2(name2);






