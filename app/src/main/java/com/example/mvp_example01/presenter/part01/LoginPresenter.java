package com.example.mvp_example01.presenter.part01;

import androidx.annotation.Nullable;

import com.example.mvp_example01.model.part01.User;
import com.example.mvp_example01.view.part01.LoginMVP;



public class LoginPresenter implements LoginMVP.Presenter {

    @Nullable/**This is a just a JLint hint to help us check for null reference whenever we access the view field.*/
    private LoginMVP.View view;/**Here we create a private variable for our view instance which we can talk to or control from our presenter*/
    private LoginMVP.Model model; /**WE create another private variable called model so that we can communicate with the model from the presenter.*/


    public LoginPresenter(LoginMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginMVP.View view) {
        /**to work with this we need to set the our field to the view instance that is passed in form the onResume method we coded.*/
        this.view = view;

    }

    @Override
    public void loginButtonClicked() {

        if (view != null) {
            if (view.getFirstName().trim().equals("") || view.getLastName().trim().equals("")) {
                view.showInputError();
            } else {

                model.createUser(view.getFirstName(), view.getLastName());
                view.showUserSavedMessage();

            }

        }

    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();

        if (user != null) {
            if (view != null) {
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }

    }
}
