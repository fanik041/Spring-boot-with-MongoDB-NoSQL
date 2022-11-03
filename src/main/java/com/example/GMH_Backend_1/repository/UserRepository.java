package com.example.GMH_Backend_1.repository;

import com.example.GMH_Backend_1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList<>();

    public User getUser(){
        User obj = new User("fahim", "canada",  25, "https://www.linkedin.com/in/fahim-shahriare/");
        return obj;
    }

    public User saveUser(User user) {
        user.setUserID(userList.size()+1);
        userList.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUserByID(int userID) {
        for(User user:userList){
            if(user.getUserID()==userID){
                return user;
            }
        }
        return null;
    }

    public User updateUser(int userID, User user) {
        for(User u:userList){
            if(u.getUserID()== userID){
                u.setName(user.getName());
                u.setAddress(user.getAddress());
                u.setAge(user.getAge());
                u.setProfilePicUrl(user.getProfilePicUrl());
                return u;
            }
        }
        return null;
    }

    public User deleteUser(int userID) {
        User deletedUser = null;
        for(User users:userList) {
            if (users.getUserID() == userID) {
                System.out.println(users.getName());
                deletedUser = users;
                userList.remove(users);
                return deletedUser;
            }
        }
//        for (int i = 0; i < userList.size(); i++) {
//            if(user[i].userID == userID) {
//                userList.remove(i);
//            }
//        }
        return deletedUser;
    }
}

/*
for (int i = 0; i < userList.size(); i++) {
     if(user[i].userId == userId) {
           userList.remove(i);
}
* */