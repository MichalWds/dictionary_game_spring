package dictionary_game.controller;


import dictionary_game.model.User;
import dictionary_game.repositories.UserRepository;
import dictionary_game.services.GameScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Scope(value = "session")
@Controller
public class MainController {


    @Autowired
    UserRepository userRepository;

    @Autowired
    User user;


    @PostMapping("/home")
    public String create(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";

        } else {
            userRepository.save(user);
            GameScore.username = user.getName();
            GameScore.score = user.getNumberOfPoints();
            String username = user.getName();

            return "redirect:/r1";
        }
    }


    @GetMapping("/")
    public String Start(ModelMap modelMap) {

        modelMap.put("start", user.getNumberOfPoints());
        user.setNumberOfPoints(0);

        return "home";
    }

    @GetMapping("/score")
    public String showPoints(ModelMap modelMap) {

        User userData = userRepository.findByName(GameScore.username);
        userData.setNumberOfPoints(user.getNumberOfPoints());
        System.out.println("POINTS:" + user.getNumberOfPoints());
        userRepository.save(userData);

        modelMap.put("score", user.getNumberOfPoints());

        return "score";
    }

    @GetMapping(path = "/all")        //JSON
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }


}
