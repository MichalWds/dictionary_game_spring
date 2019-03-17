package dictionary_game.controller;

import dictionary_game.Library;
import dictionary_game.LibraryRepository;
//import dictionary_game.model.LibraryForEnglish;
import dictionary_game.model.User;
import dictionary_game.model.WordList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    private static String previousWord;

    @Autowired
    DictionaryService dictionaryService;

    @Autowired
    private LibraryRepository libraryRepository;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @GetMapping("/game")
    public String showEnglish(@RequestParam(required = false) String name, ModelMap modelMap) {

    name= previousWord;

        modelMap.put("englishW", dictionaryService.getEnglishW());

//        name = dictionaryService.getPolishW();

        modelMap.put("polishW", dictionaryService.getPolishW());
        modelMap.put("answer", dictionaryService.getMessage());


        return "game";
    }

    @GetMapping("/help")
    public String help(ModelMap modelMap){

        modelMap.put("help",dictionaryService.getPolishW());
        return "help";
    }









}
