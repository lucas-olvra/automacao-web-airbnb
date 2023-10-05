package com.airbnb.funcs;

import com.airbnb.common.BaseTest;
import com.airbnb.pages.AccountPage;

public class AccountFunc extends BaseTest {

    AccountPage accountPage = new AccountPage();
    public String ckeckLoginSuccess(String user){
        driver.locator(accountPage.getAccessProfile()).click();
        user = driver.locator(accountPage.getUsername()).textContent();
        return user;
    }
}
