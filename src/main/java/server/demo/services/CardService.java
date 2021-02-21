package server.demo.services;

import server.demo.domain.Card;

import java.util.List;
import java.util.Optional;

public interface CardService {

    void create(Card card);

    List<Card> findAll();

    List<Card> findByUser(Long id);
}
