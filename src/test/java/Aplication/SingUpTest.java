package Aplication;


import Domain.User;
import External.EmailRepository;
import External.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class SingUpTest {
    @Mock
    UserRepository mockUserRepository;
    @Mock
    EmailRepository mockEmailRepository;
    @InjectMocks
    SingUp singUp;
    @Test
    void save_the_user_when_it_not_is_registered_in_repository(){
        User user = new User("Rocio","rocio@yahoo.es",60);
        singUp.saveUser(user);
        Mockito.verify(mockUserRepository).getUserByEmail(user);
        Mockito.verify(mockUserRepository).saveUser(user);
        Mockito.verify(mockEmailRepository).sendEmail(user);




    }


}