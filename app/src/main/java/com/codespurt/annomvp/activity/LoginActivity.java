package com.codespurt.annomvp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.codespurt.annomvp.R;
import com.codespurt.annomvp.mvp.engine.LoginPresenter;
import com.codespurt.annomvp.mvp.engine.LoginView;
import com.codespurt.annomvp.mvp.imp.LoginPresenterImp;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new LoginPresenterImp(this);
        presenter.loginP("abc@example.com", "123456");
    }

    @Override
    public void onUserLoginV() {
        Toast.makeText(this, getString(R.string.mvp_executed), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDialogC() {

    }

    @Override
    public void hideDialogC() {

    }
}