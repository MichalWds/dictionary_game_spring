package dictionary_game.controller;

import dictionary_game.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service  //zapytac co to
public class DictionaryService {

    private String name;
    private Random random = new Random();
    private static String previousWord;
    int count;
    private int index;
    private String EWord;
    private String PWord;

    @Autowired
    private LibraryRepository libraryRepository;



    public void work() {

        count = (int) libraryRepository.count();
        index = random.nextInt((int) count);

    }

    public String getEnglishW() {
        count = (int) libraryRepository.count();
        index = random.nextInt((int) count);
        return EWord = libraryRepository.findById(index+1).get().getEnglishWord();

    }

    public String getPolishW(){

        return  PWord = libraryRepository.findById(index+1).get().getPolishWord();
    }

    public String getName() {
        return this.name;

    }



    public String getMessage(String name) {

        while (name!=null)
        {
            if (!name.equals(PWord) || name==""){
                return "zle -1pkt";
            } else {
            return "dobrze! +1pkt";
            }

    }return "";

}}



