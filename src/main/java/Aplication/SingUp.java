package Aplication;

import Domain.User;
import External.EmailRepository;
import External.UserRepository;

import java.util.List;

public class SingUp {
    UserRepository userRepository;
    EmailRepository emailRepository;

    public SingUp(UserRepository userRepository, EmailRepository emailRepository) {
        this.userRepository = userRepository;
        this.emailRepository = emailRepository;
    }

    public void saveUser(User user){

    }

}
