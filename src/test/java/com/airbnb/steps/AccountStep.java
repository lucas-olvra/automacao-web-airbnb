package com.airbnb.steps;

import com.airbnb.funcs.AccountFunc;
import io.cucumber.java.en.Then;

public class AccountStep {

    AccountFunc accountFunc = new AccountFunc();

    @Then("check login with user {string} with success")
    public void checkLoginWithUserWithSuccess(String user){
        accountFunc.ckeckLoginSuccess(user);
    }
}
