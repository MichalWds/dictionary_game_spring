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
            int ascii = 42;
            Character randomAscii = (char) ascii;
        String HashWord=EWord;
        for (int i = 0; i < round; i += 2) {
            char randomChar = HashWord.charAt(random.nextInt(HashWord.length()-1));
            HashWord = HashWord.replaceFirst(String.valueOf(randomChar), randomAscii.toString() );
            if(randomChar==randomAscii || randomChar==0) continue;
            System.out.println(randomAscii);
        }
            return HashWord;


    }


    public String getMessage(String name3) {



        while (name3 != null) {

            if (!name3.equals(EWord) || name3 == "") {
                GameScore.score -= user.substractPoints();
                GameScore.getScore();
                round--;

                return "Niestety źle! -1pkt! ";
            } else {
                GameScore.score += user.addPoint();
                GameScore.getScore();

                round++;
                return "Tak trzymać! +1pkt! ";

            }
        }
        return "";
    }
}









//    public String HashEnglishWord(){
//
//        HashWord = getFirstEnglishW();
//
//        char randomChar = HashWord.charAt(random.nextInt(HashWord.length()));
//        HashWord = HashWord.replaceFirst(String.valueOf(randomChar),"*");
//        return HashWord;
//    }



//    public String getHashEnglishWord(String name3) {
//
//        HashWord = libraryRepository.findById(work() + 1).get().getEnglishWord();
//
//        while (fails <= 3) {
//            for (int i = 0; i < counter; i += 3) {
//                char randomChar = HashWord.charAt(random.nextInt(HashWord.length()));
//                HashWord = HashWord.replaceFirst(String.valueOf(randomChar), "*");
//                if (randomChar == '*')
//                    continue;
//                ;
//            }
//            if (HashWord.equalsIgnoreCase(name3)) {
//                System.out.println(("podales wlasciwe slowo"));
//                counter++;
//
//
//            } else {
//                fails++;
//                counter -= 3;
//                System.out.println("Nie zgadles");
//            }
//        }
//        System.out.println("koniec gry");
//        return HashWord;
//
//    }
//}
//
//
//



