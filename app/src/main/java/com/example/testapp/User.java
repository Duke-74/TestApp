package com.example.testapp;

public class User {
    public String name, password;

    public User(){
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }
}
