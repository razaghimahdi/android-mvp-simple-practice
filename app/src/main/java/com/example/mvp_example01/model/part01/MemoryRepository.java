package com.example.mvp_example01.model.part01;

public class MemoryRepository implements LoginRepository {


    private User user;

    @Override
    public User getUser() {

        if (user == null) {
            User user=new User("Mahdi","Razzaghi");
            user.setId(0);
            return user;
        } else {
            return user;
        }

    }

    @Override
    public void saveUser(User user) {

        if (user == null) {
            user = getUser();
        }

        this.user = user;

    }


}
