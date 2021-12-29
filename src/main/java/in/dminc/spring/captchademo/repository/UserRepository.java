package in.dminc.spring.captchademo.repository;

import in.dminc.spring.captchademo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
