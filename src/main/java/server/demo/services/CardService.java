package server.demo.services;

import server.demo.domain.Card;

import java.util.List;

public interface CardService {

    void create(Card card);

    List<Card> findAll();
}
