package server.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import server.demo.domain.UserData;
import server.demo.services.CardService;
import server.demo.services.UserService;


@Controller
public class MainController {

    private UserService userService;
    public MainController(CardService cardService, UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/get")
    @ResponseBody
    public Object currentUserName(Authentication authentication) {
        return authentication.getPrincipal();
    }


}
