package com.example.mvp_example01.model.part01;

public class User {
    private int id;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }
}
