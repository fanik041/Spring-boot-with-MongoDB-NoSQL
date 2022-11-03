package com.example.GMH_Backend_1.service;

import com.example.GMH_Backend_1.model.User;
import com.example.GMH_Backend_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User getUser(){
        return userRepository.getUser();
    }

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserByID(int userID) {
        return userRepository.getUserByID(userID);
    }

    public User updateUser(int userID, User user) {
        return userRepository.updateUser(userID, user);
    }

    public User deleteUser(int userID) {
        return userRepository.deleteUser(userID);
    }
}
