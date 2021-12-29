package in.dminc.spring.captchademo.service;

import in.dminc.spring.captchademo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void createUser(User user);
    List<User> getAllUsers();
    Optional<User> getUser(Integer userId);
}
