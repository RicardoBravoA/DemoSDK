package com.rba.sdkdemo.model.request;

/**
 * Created by Ricardo Bravo on 30/01/17.
 */

public class LoginRequest {


    /**
     * email : ricardo@test.pe
     * password : 123456
     */

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
