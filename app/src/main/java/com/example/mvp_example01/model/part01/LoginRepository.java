package com.example.mvp_example01.model.part01;

    public interface LoginRepository {

        User getUser();

        void saveUser(User user);

}
