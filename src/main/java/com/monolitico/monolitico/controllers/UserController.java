package com.monolitico.monolitico.controllers;

import com.monolitico.monolitico.models.User;
import com.monolitico.monolitico.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/genesis/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("")
    public User createUser(@RequestBody User user){

        return userService.createUser(user);

    }

}
