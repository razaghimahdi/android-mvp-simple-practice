package com.example.mvp_example01.model.part01;

import com.example.mvp_example01.view.part01.LoginMVP;

public class LoginModel implements LoginMVP.Model {


    private LoginRepository repository;

    public LoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String name, String lastName) {


        repository.saveUser(new User(name, lastName));


    }

    @Override
    public User getUser() {

        return repository.getUser();
    }
}