package com.monolitico.monolitico.services;

import com.monolitico.monolitico.enums.ErrorMessage;
import com.monolitico.monolitico.exceptions.NotFoundException;
import com.monolitico.monolitico.models.User;
import com.monolitico.monolitico.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.monolitico.monolitico.enums.ErrorMessage.USER_NOT_FOUNT;

@Service
public class UserServiceImp  implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User user) {
        Optional<User> userFindByemail= userRepository.findByEmail(user.getEmail());
        if(userFindByemail.isPresent()) {
            throw new NotFoundException(ErrorMessage.USER_EMAIL_EXISTS.getMessage());
        }
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user=userRepository.findById(id);
        if(user.isEmpty()) {
            throw new NotFoundException(ErrorMessage.USER_NOT_FOUNT.getMessage());
        }
        return user.get();
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User editUser(Long id, User user) {
        Optional<User> userBd=userRepository.findById(id);
        if(userBd.isEmpty()) {
            throw new NotFoundException(ErrorMessage.USER_NOT_FOUNT.getMessage());
        }
        Optional<User> userFindByemail= userRepository.findByEmail(user.getEmail());
        if(userFindByemail.isPresent()) {
            throw new NotFoundException(ErrorMessage.USER_EMAIL_EXISTS.getMessage());
        }
        userBd.get().setFullName(user.getFullName());
        userBd.get().setBrittDay(user.getBrittDay());
        userBd.get().setEmail(user.getEmail());
        return userBd.get();
    }

    @Override
    public Boolean deleteUser(Long id){

        Optional<User> userBd=userRepository.findById(id);
        if(userBd.isEmpty()) {
            throw new NotFoundException(ErrorMessage.USER_NOT_FOUNT.getMessage());
        }
        userRepository.deleteById(id);
        return true;
    }
}
