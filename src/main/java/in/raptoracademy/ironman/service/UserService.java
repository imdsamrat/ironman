package in.raptoracademy.ironman.service;

import in.raptoracademy.ironman.repository.UserRepository;
import in.raptoracademy.ironman.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserService {

    @Autowired
    UserRepository userRepository;


    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
