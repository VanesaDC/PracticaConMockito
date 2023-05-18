package External;

import Domain.User;

import java.util.List;

public interface UserRepository {
    List<User> getUserByEmail(User user);
    void saveUser(User user);

}
