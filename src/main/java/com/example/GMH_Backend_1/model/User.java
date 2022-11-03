package com.example.GMH_Backend_1.model;

public class User {

    private int userID;
    private String name;
    private String address;
    private int age;

    private String profilePicUrl;

    public User(String name, String address, int age, String profilePicUrl) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.profilePicUrl = profilePicUrl;
    }

    public User(){
        System.out.println("this is a test");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
