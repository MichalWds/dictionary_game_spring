package dictionary_game.services;

import dictionary_game.LibraryRepository;
import dictionary_game.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin.liveconnect.ReplaceMethod;

import java.util.Random;

@Service
public class DictionaryRoundTwoService {

    private String name2;
    private Random random = new Random();
    private static String previousWord;
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

    public String getEnglishW() {

        return EWord = libraryRepository.findById(index+1).get().getEnglishWord();

    }

    public String getFirstPolishW(){
        count = (int) libraryRepository.count();
        index = random.nextInt((int) count);
        return  PWord = libraryRepository.findById(index+1).get().getPolishWord();
    }



    public String getMessage2(String name2) {
        while (name2!=null){

            if(!name2.equals(EWord) || name2 == ""){
                user.substractPoints();
                return "Błąd! -1pkt! " ;
            }else {
                user.addPoint();
                return "Świetnie! +1pkt! " ;
            }

        }return "";
    }

}



