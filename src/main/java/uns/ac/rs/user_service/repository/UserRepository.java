package uns.ac.rs.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import uns.ac.rs.user_service.model.User;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>, QuerydslPredicateExecutor<User> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmailAddress(String emailAddress);
}
