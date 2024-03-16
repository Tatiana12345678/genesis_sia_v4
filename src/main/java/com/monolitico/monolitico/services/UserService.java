package com.monolitico.monolitico.services;

import com.monolitico.monolitico.models.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User editUser(Long id,User user);
    Boolean deleteUser(Long id);
}
