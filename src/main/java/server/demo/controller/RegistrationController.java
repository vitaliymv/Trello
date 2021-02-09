package server.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import server.demo.domain.UserData;
import server.demo.services.UserService;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new UserData());
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute UserData user) {
        if (userService.saveUser(user)) {
            return "login";
        }
        return "registration";
    }
}