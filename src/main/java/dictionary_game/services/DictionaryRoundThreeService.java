package dictionary_game.services;

import dictionary_game.LibraryRepository;
import dictionary_game.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DictionaryRoundThreeService {

    private Random random = new Random();

    private int count;
    private int index;
    private String EWord;
    private String PWord;
   // private String HashWord;

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
        char randomChar = HashWord.charAt(random.nextInt(HashWord.length()));
        HashWord = HashWord.replaceFirst(String.valueOf(randomChar),"*");
        return HashWord;


    }


    public String getMessage(String name3) {

        while (name3 != null) {

            if (!name3.equals(EWord) || name3 == "") {
                user.substractPoints();
                return "Źle! -1pkt! ";
            } else {
                user.addPoint();
                return "Dobrze! +1pkt! ";
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



