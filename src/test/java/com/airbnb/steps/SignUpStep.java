package com.airbnb.steps;

import com.airbnb.funcs.SignUpFunc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStep {

    SignUpFunc signUpFunc = new SignUpFunc();
    @Given("access screen {string}")
    public void accessScreenLogin(String tela) {
        signUpFunc.accessScreen(tela);
    }

    @When("enter the information of a new user")
    public void enterInformationNewUser(){

    }

    @Then("should perform the registration with success")
    public void performRegistrationWithSuccess(){

    }
}
