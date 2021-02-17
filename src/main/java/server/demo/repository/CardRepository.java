package server.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.demo.domain.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
}
