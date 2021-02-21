package server.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.demo.domain.Card;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findCardsByUserDataId(Long id);
}
