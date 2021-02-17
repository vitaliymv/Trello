package server.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.demo.domain.Card;
import server.demo.repository.CardRepository;
import server.demo.services.CardService;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public void create(Card card) {
        cardRepository.save(card);
    }

    @Override
    public List<Card> findAll() {
        return cardRepository.findAll();
    }
}
