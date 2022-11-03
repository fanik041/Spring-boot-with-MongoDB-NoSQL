package com.example.GMH_Backend_1.resource;

import com.example.GMH_Backend_1.model.User;
import com.example.GMH_Backend_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userID}")
    public User getUserByID(@PathVariable("userID") int userID){
        return userService.getUserByID(userID);
    }

    @PutMapping("/user/{userID}")
    public User updateUser(@PathVariable(value = "userID") int userID, @RequestBody User user){
        return userService.updateUser(userID, user);
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestParam(name = "userID") int userID){
        return userService.deleteUser(userID);
    }
}
