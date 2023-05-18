package Aplication;


import Domain.User;
import External.EmailRepository;
import External.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;
import static org.mockito.Mockito.*;

class SingUpTest {

    UserRepository mockUserRepository = mock(UserRepository.class);
    EmailRepository mockEmailRepository = mock(EmailRepository.class);
    SingUp singUp = new SingUp(mockUserRepository, mockEmailRepository);
    @Test
    void save_the_user_when_it_not_is_registered_in_repository(){
        User user = new User("Rocio","rocio@yahoo.es",60);
        when(mockUserRepository.getUserByEmail(user)).thenReturn(List.of());
        singUp.saveUser(user);
        verify(mockUserRepository).saveUser(user);
        verify(mockEmailRepository).sendEmail(user);
    }


}