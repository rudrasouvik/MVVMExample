package com.souvik.mvvmexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.souvik.mvvmexample.commands.UserLogin;
import com.souvik.mvvmexample.databinding.ActivityMainBinding;
import com.souvik.mvvmexample.model.User;
import com.souvik.mvvmexample.viewmodel.Usermodel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Usermodel usermodel = new Usermodel(new User("Email", "Password"));
        activityMainBinding.setLogin(usermodel);

        activityMainBinding.setUserloginevent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this, activityMainBinding.getLogin().getEmail(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
