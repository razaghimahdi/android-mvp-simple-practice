package com.example.mvp_example01.di.part01;

import com.example.mvp_example01.model.part01.LoginModel;
import com.example.mvp_example01.model.part01.LoginRepository;
import com.example.mvp_example01.model.part01.MemoryRepository;
import com.example.mvp_example01.presenter.part01.LoginPresenter;
import com.example.mvp_example01.view.part01.LoginMVP;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginMVP.Presenter provideLoginActivityPresenter(LoginMVP.Model model){
        return new LoginPresenter(model);
    }

    @Provides
    public LoginMVP.Model provideLoginActivityModel(LoginRepository repository){
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new MemoryRepository();
    }


}
