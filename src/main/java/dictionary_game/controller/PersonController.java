package dictionary_game.controller;


import dictionary_game.model.User;
import dictionary_game.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PersonController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    User user;


    @GetMapping("players/{id}/delete")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        User user = userRepository.findById(id).get();
        userRepository.deleteById(id);

        redirectAttributes.addFlashAttribute("message", "usunieto zawodnika " + user.getName() + " z bazy danych");
        return "redirect:/players";
    }


    @GetMapping("/players")
    public String findAll(ModelMap modelMap) {
        modelMap.put("user", userRepository.findAllSortById());
        return "players";
    }


//todo dodac add i ogarnac form.


    @GetMapping("/add")
    public String show(ModelMap modelMap) {
        modelMap.put("user", new User());

        return "form";
    }





}