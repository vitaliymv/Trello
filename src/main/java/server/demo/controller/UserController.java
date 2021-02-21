package server.demo.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import server.demo.domain.Card;
import server.demo.domain.UserData;
import server.demo.services.CardService;

import java.util.List;

@RestController
public class UserController {

    private CardService cardService;

    public UserController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("/createCard")
    public RedirectView create(@ModelAttribute Card card, Authentication authentication) {
        card.setUserData((UserData) authentication.getPrincipal());
        cardService.create(card);
        return new RedirectView("dashboard");
    }

    @GetMapping("/user/cards")
    public JSONArray mainPage() {
        UserData user = (UserData) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Card> cards = cardService.findByUser(user.getId());
        JSONArray jsonArray = new JSONArray();
        for (Card card : cards) {
            jsonArray.put(card.getName());
        }
        return jsonArray;
    }
}
