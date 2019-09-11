package com.souvik.mvvmexample.viewmodel;

import android.databinding.BaseObservable;

import com.souvik.mvvmexample.R;
import com.souvik.mvvmexample.model.User;

public class Usermodel extends BaseObservable {

    private String email;
    private String password;
    private String emailhint;
    private String passwordhint;

    public Usermodel(User user) {
        this.emailhint = user.emailhint;
        this.passwordhint = user.passwordhint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.emailid);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.passid);
    }

    public String getEmailhint() {
        return emailhint;
    }

    public void setEmailhint(String emailhint) {
        this.emailhint = emailhint;
    }

    public String getPasswordhint() {
        return passwordhint;
    }

    public void setPasswordhint(String passwordhint) {
        this.passwordhint = passwordhint;
    }
}
