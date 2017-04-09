package com.codespurt.annomvp.mvp.imp;


import com.codespurt.annomvp.mvp.engine.LoginInteractor;
import com.codespurt.annomvp.mvp.engine.OnLoginInteractedListener;

public class LoginInteractorImp implements LoginInteractor {

    @Override
    public void loginP(String email, String password, OnLoginInteractedListener listener) {
        listener.onUserLoginV();
    }
}