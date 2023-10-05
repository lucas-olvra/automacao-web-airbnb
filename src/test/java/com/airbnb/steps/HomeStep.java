package com.airbnb.steps;

import com.airbnb.funcs.HomeFunc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomeStep {

    HomeFunc homeFunc = new HomeFunc();
    @Given("access screen {string}")
    public void accessScreenLogin(String tela) {
        homeFunc.accessScreen(tela);
    }

    @And("select account profile")
    public void selectAccountProfile(){
        homeFunc.accountProfile();
    }
}
