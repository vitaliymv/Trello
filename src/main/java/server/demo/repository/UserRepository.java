package server.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.demo.domain.UserData;

public interface UserRepository extends JpaRepository<UserData, Long> {
    UserData findByUserName(String userName);
}
