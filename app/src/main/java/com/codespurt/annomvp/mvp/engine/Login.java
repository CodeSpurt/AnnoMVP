package com.codespurt.annomvp.mvp.engine;

import com.mvp.MVP;
import com.mvp.Presenter;
import com.mvp.View;

@MVP
public interface Login {

    @Presenter
    void loginP(String email, String password);

    @View
    public void onUserLoginV();
}