package dictionary_game.controller;

import dictionary_game.LibraryRepository;
import dictionary_game.model.WordList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Controller
public class DictionaryController {


    @Autowired
    private LibraryRepository libraryRepository;
    private Random random = new Random();
    public DictionaryController() {
    }


    private WordList wordlist = new WordList() {
    };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


// @ResponseBody  daje nam mozliwosc wyswietlenia w stringu ( czyli to co wpsizemy w returnie


    @GetMapping("/")//RequestParam poboeranie wyyrazu z html, a required ze nie wywali strony jelsi nic nie wpisze
    public String getPolish(@RequestParam(required = false) String englishWord, ModelMap modelMap) {
        long count = libraryRepository.count();     //wbudowana opcja do policzenia  ilosci znakow
        int index = random.nextInt((int) count);       //random z listy  // RZUTOWANIE
        modelMap.put("polskie",libraryRepository.findById(index).get().toString());     //get bierze i zamienia na stringa zeby nie bylo optional[]


//  modelMap.put("polskie", libraryRepository.findById(random.nextInt()));
//  modelMap.put("polskie",libraryRepository.findById(3));
        return "form";
    }


//    @GetMapping("/dupa")
//    public String getDupa() {
//        return "dupa";
//    }



}
