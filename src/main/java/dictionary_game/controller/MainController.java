package dictionary_game.controller;


import dictionary_game.model.User;
import dictionary_game.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Scope(value = "session")
@Controller
public class MainController {


    @Autowired
    UserRepository userRepository;

    @Autowired
    User user;

    @GetMapping("/score")
    public String showPoints(ModelMap modelMap){

        modelMap.put("score", user.getNumberOfPoints());

        return "score";
    }


    @GetMapping("/home")
    public String Start(ModelMap modelMap){

        modelMap.put("start",user.getNumberOfPoints());
        user.setNumberOfPoints(0);

        return "home";
    }

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String name){

        User n = new User();
        n.setName(name);

        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();      //znajduje wszystkich userow w bazie danych   // czyli robic selecta
    }


    @GetMapping("people/{id}/delete")
        public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        User user = userRepository.findById(id).get();
        userRepository.deleteById(id);


        redirectAttributes.addFlashAttribute("message", "usunieto zawodnika " + user.getName() + " z bazy danych");
        return "redirect:/home";
    }



}
