package vachik.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vachik.carsale.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Поиск пользователя по username
    Optional<User> findByUsername(String username);
}
