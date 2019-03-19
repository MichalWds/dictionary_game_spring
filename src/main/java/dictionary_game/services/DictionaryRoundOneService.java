package dictionary_game.services;

import dictionary_game.LibraryRepository;
import dictionary_game.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DictionaryRoundOneService {

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

    public String getFirstEnglishW() {

        return EWord = libraryRepository.findById(work() + 1).get().getEnglishWord();

    }

    public String getPolishW() {

        return PWord = libraryRepository.findById(index + 1).get().getPolishWord();
    }

    public String getMessage(String name) {

        while (name != null) {

            if (!name.equals(PWord) || name == "") {
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







