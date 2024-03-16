package com.monolitico.monolitico.services;

import com.monolitico.monolitico.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class UserServiceImp  implements UserService{

    @Override
    public User createUser(User user) {
        return User.builder()
                .fullName("Tatiana Paola Zambrano Vasquez")
                .id(1L)
                .brittDay(LocalDate.parse("2024-03-15"))
                .email("tapa@gmail.com")
                .build();
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User editUser(Long id, User user) {
        return null;
    }

    @Override
    public Boolean deleteUser(Long id) {
        return null;
    }
}
