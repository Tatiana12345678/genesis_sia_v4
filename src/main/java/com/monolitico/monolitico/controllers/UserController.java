package com.monolitico.monolitico.controllers;

import com.monolitico.monolitico.models.User;
import com.monolitico.monolitico.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/genesis/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);

    }
    @GetMapping
    public List<User> userList(){
        return  userService.getAllUsers();
    }
    @PutMapping({"id"})
    public User UpdateUser(@PathVariable Long id,@RequestBody User user ){
       return userService.editUser(id, user);
    }
    @DeleteMapping({"id"})
    public Boolean deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
    @GetMapping({"id"})
    public User getUserById(@PathVariable Long id){
       return userService.getUserById(id);
    }

}
