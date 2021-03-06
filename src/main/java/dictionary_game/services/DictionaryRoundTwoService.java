package dictionary_game.services;

import dictionary_game.repositories.LibraryRepository;
import dictionary_game.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DictionaryRoundTwoService {

    private Random random = new Random();
    private int count;
    private int index;
    private String EWord;
    private String PWord;

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private User user;


    public int work() {

        count = (int) libraryRepository.count();
        index = random.nextInt((int) count);
        return index;
    }


    public String getEnglishW() {

        return EWord = libraryRepository.findById(index + 1).get().getEnglishWord();
    }

    public String getFirstPolishW() {

        return PWord = libraryRepository.findById(work() + 1).get().getPolishWord();
    }


    public String getMessage2(String name2) {
        while (name2 != null) {

            if (!name2.equals(EWord) || name2 == "") {
                user.substractPoints();

                return "Błąd! -1pkt! ";
            } else {
                user.addPoint();

                return "Świetnie! +1pkt! ";
            }

        }
        return "";
    }

}



