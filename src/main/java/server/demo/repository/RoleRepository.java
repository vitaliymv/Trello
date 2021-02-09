package server.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.demo.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
