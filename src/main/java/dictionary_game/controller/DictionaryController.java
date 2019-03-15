package dictionary_game.controller;

import dictionary_game.Library;
import dictionary_game.LibraryRepository;
import dictionary_game.model.LibraryForEnglish;
import dictionary_game.model.User;
import dictionary_game.model.WordList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.text.DecimalFormat;
import java.util.Random;


@Scope(value = "session")  //dzieki temu, kazdy uzytkownik bdedzie mial swoj kontroller, TestKontroller
@Controller
public class DictionaryController {

    private Random random = new Random();
    private User user = new User();
    private LibraryForEnglish libraryForEnglish;
    private static String previousWord;   //zmienna statyczna, tak aby nie byla przypisana do zadnej metody lokalnej, bysmy mogl isie odniesc

    @Autowired
    private LibraryRepository libraryRepository;






    private WordList wordlist = new WordList() {
    };

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


// @ResponseBody  daje nam mozliwosc wyswietlenia w stringu ( czyli to co wpsizemy w returnie


    @GetMapping("/game")                    //@PathVariable jesli chce aby w linku podawalo mi zmienna english w url
    //RequestParam poboeranie wyyrazu z html, a required ze nie wywali strony jelsi nic nie wpisze
    public String showEnglish(@RequestParam(required = false) String name, ModelMap modelMap) {
        long count = libraryRepository.count();                       //wbudowana opcja do policzenia  ilosci znakow
        int index = random.nextInt((int) count);
        //get bierze i zamienia na stringa zeby nie bylo optional[]  //random z listy  // RZUTOWANIE
        String EWord = libraryRepository.findById(index).get().getEnglishWord();
        String PWord = libraryRepository.findById(index).get().getPolishWord();
        modelMap.put("englishW", EWord);

        modelMap.put("polishW", PWord);
        if (name != null) {

            if (previousWord.equals(name)) {
                System.out.println("dobrze");
            } else {
                System.out.println("zle");

            }

        }
        previousWord = PWord;
        //zmienna nadana wyzej by nie podmienialo wylosowanego slowa




        return "game";
    }

    @GetMapping("/result")

    public String show(ModelMap map) {



        return "result";

    }
//    @PostMapping("/games")
//    public String getPolishFromTH()


}
