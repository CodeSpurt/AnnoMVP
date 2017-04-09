package com.codespurt.annomvp.mvp.imp;


import com.codespurt.annomvp.mvp.engine.LoginInteractor;
import com.codespurt.annomvp.mvp.engine.LoginPresenter;
import com.codespurt.annomvp.mvp.engine.LoginView;
import com.codespurt.annomvp.mvp.engine.OnLoginInteractedListener;

public class LoginPresenterImp implements LoginPresenter, OnLoginInteractedListener {

    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImp(LoginView view) {
        this.view = view;
        interactor = new LoginInteractorImp();
    }

    // presenter
    @Override
    public void loginP(String email, String password) {
        interactor.loginP(email, password, this);
    }

    // view
    @Override
    public void onUserLoginV() {
        view.onUserLoginV();
    }

    // core
    @Override
    public void showDialogC() {

    }

    @Override
    public void hideDialogC() {

    }
}