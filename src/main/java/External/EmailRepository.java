package External;

import Domain.User;

public interface EmailRepository {
    void sendEmail(User user);
}
