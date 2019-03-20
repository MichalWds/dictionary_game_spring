package dictionary_game.controller;

import dictionary_game.LibraryRepository;

import dictionary_game.model.User;
import dictionary_game.services.DictionaryRoundOneService;
import dictionary_game.services.DictionaryRoundThreeService;
import dictionary_game.services.DictionaryRoundTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;


@Scope(value = "session")  //dzieki temu, kazdy uzytkownik bdedzie mial swoj kontroller, TestKontroller
@Controller
public class DictionaryController {

    private Random random = new Random();

    @Autowired
    private User user = new User();

    private String communicat = "Twoja liczba punktów to : ";


    @Autowired
    DictionaryRoundOneService dictionaryRoundOneService;

    @Autowired
    DictionaryRoundTwoService dictionaryRoundTwoService;

    @Autowired
    DictionaryRoundThreeService dictionaryRoundThreeService;

    @Autowired
    private LibraryRepository libraryRepository;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @GetMapping("/")
    public String homePage(@RequestParam(required = false) String name, ModelMap modelMap) {


        modelMap.put("answer", dictionaryRoundOneService.getMessage(name) + communicat + user.getNumberOfPoints());
        modelMap.put("englishW", dictionaryRoundOneService.getFirstEnglishW());
        modelMap.put("polishW", dictionaryRoundOneService.getPolishW());
        modelMap.put("point", user.getNumberOfPoints());

        return "roundone";
    }

    @GetMapping("/roundone")
    public String showEnglish(@RequestParam(required = false) String name, ModelMap modelMap) {

        modelMap.put("answer", dictionaryRoundOneService.getMessage(name)); //kolejnosc istotna!
        modelMap.put("englishW", dictionaryRoundOneService.getFirstEnglishW());
        modelMap.put("polishW", dictionaryRoundOneService.getPolishW());
        return "redirect:/roundone";
    }

    @GetMapping("/help")
    public String help(ModelMap modelMap) {
        modelMap.put("help", dictionaryRoundOneService.getPolishW());
        return "help";
    }


    @GetMapping("/r")
    public String homePage2(@RequestParam(required = false) String name2, ModelMap modelMap) {

        modelMap.put("answer2", dictionaryRoundTwoService.getMessage2(name2) + communicat + user.getNumberOfPoints());
        modelMap.put("polishW", dictionaryRoundTwoService.getFirstPolishW());
        modelMap.put("englishW", dictionaryRoundTwoService.getEnglishW());
        modelMap.put("point2", user.getNumberOfPoints());
        return "roundtwo";

    }


    @GetMapping("/roundtwo")
    public String showPolish(@RequestParam(required = false) String name2, ModelMap modelMap) {

        modelMap.put("answer2", dictionaryRoundTwoService.getMessage2(name2));
        modelMap.put("polishW", dictionaryRoundTwoService.getFirstPolishW());
        modelMap.put("englishW", dictionaryRoundTwoService.getEnglishW());

        return "redirect:/roundtwo";
    }

    @GetMapping("/help2")
    public String help2(ModelMap modelMap) {
        modelMap.put("help2", dictionaryRoundTwoService.getEnglishW());
        return "help2";
    }



    @GetMapping("/r3")
    public String homePage3(@RequestParam(required = false) String name3, ModelMap modelMap) {


        modelMap.put("answer3", dictionaryRoundThreeService.getMessage(name3) + communicat + user.getNumberOfPoints());
        modelMap.put("englishW", dictionaryRoundThreeService.getFirstEnglishW());
        modelMap.put("hashWord",dictionaryRoundThreeService.getHashEnglish());
        modelMap.put("polishW", dictionaryRoundThreeService.getPolishW());
        modelMap.put("point3", user.getNumberOfPoints());

        return "roundthree";
    }

    @GetMapping("/roundthree")
    public String showHash(@RequestParam(required = false) String name3, ModelMap modelMap) {

        modelMap.put("answer", dictionaryRoundThreeService.getMessage(name3)); //kolejnosc istotna!
        modelMap.put("englishW", dictionaryRoundThreeService.getFirstEnglishW());
        modelMap.put("polishW", dictionaryRoundThreeService.getPolishW());
        return "redirect:/roundthree";
    }


    @GetMapping("/score")
    public String showPoints(ModelMap modelMap){

        modelMap.put("score", user.getNumberOfPoints());

        return "score";
    }


    @GetMapping("/home")
    public String Start(ModelMap modelMap){
        return "home";
    }

}
