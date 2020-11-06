package com.example.mvp_example01.view.part01;

import com.example.mvp_example01.model.part01.User;




public interface LoginMVP {

    interface View{

        String getFirstName();
        String getLastName();/**Both these methods will get string values from our view.*/

        void showUserNotAvailable();/**it will serve the purpose of showing some messages to the user.*/
        void showInputError();
        void showUserSavedMessage();


        void setFirstName(String fname);/**This is when the presenter returns some String to view, so they can be set in the text fields that the view provides for us.*/
        void setLastName(String lname);
    }

    interface Presenter {

        void setView(LoginMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();

    }

    interface Model {

        void createUser(String name, String lastName);

        User getUser();/**This model is just forwarding the request to the repository because we don't have any business logic to apply in our view model.*/



    }
}
