package server.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import server.demo.domain.Card;
import server.demo.services.CardService;

@Controller
public class UserController {

    private CardService cardService;

    public UserController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("/createCard")
    public void create(@ModelAttribute Card card) {
        cardService.create(card);
    }
}
