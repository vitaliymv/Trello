package server.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import server.demo.domain.UserData;
import server.demo.services.CardService;
import server.demo.services.UserService;

import java.util.List;

@Controller
public class MainController {

    private UserService userService;
    public MainController(CardService cardService, UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/dashboard")
    public UserData mainPage() {
        return (UserData) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
