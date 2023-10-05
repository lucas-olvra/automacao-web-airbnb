package com.airbnb.steps;

import com.airbnb.funcs.LoginFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();

    @When("perform the login with the user")
    public void performLoginUser(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps();
        String username = maps.get(0).get("username");
        String password = maps.get(0).get("password");
        loginFunc.performLogin(username, password);
    }
}
