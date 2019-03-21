package dictionary_game.controller;


import dictionary_game.model.User;
import dictionary_game.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;



@Scope(value = "session")
@Controller
public class MainController {


    @Autowired
    UserRepository userRepository;

    @Autowired
    User user;



    @GetMapping("/home")
    public String Start(ModelMap modelMap){

        modelMap.put("start",user.getNumberOfPoints());
        user.setNumberOfPoints(0);

        return "home";
    }


    @GetMapping("/score")
    public String showPoints(ModelMap modelMap){

        modelMap.put("score", user.getNumberOfPoints());

        return "score";
    }


    @GetMapping(path = "/all")        //JSON
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }







}
