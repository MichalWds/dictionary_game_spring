package dictionary_game.model;


import dictionary_game.Library;
import dictionary_game.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleData implements CommandLineRunner {

    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public void run(String... args) throws Exception {           //tablica stringow
        WordList wordList = new WordList();                     //tworzymy adnotacje klasy WordList
        wordList.getDictionary().forEach((k, v) -> {           //dla kazdego wordlist klucz k v daj libraryrepositowy.save
            libraryRepository.save(new Library(v, k));         //zasejwuj z nowej klasy v-k
        });                                                    //nastepnie zrobic form by wyswietlalo w html

        System.out.println(libraryRepository.findByPolishWord("spawanie").get(0).getEnglishWord());
        System.out.println(libraryRepository.findByEnglishWord("grinding").get(0).getPolishWord());

    }
}
