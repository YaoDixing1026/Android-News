package com.and.news.bean.entity;

/**
 * Created by ydx on 17-1-16.
 */

public class LoginState {
    private boolean loginState;

    public LoginState(boolean loginState) {
        this.loginState = loginState;
    }

    public LoginState() {
    }

    public boolean getLoginState() {
        return this.loginState;
    }

    public void setLoginState(boolean loginState) {
        this.loginState = loginState;
    }
}
