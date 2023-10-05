package com.airbnb.funcs;

import com.airbnb.common.BaseTest;
import com.airbnb.pages.LoginPage;
import com.microsoft.playwright.Page;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();

    public void performLogin(String username, String password) {
        Page popup = driver.waitForPopup(() -> {
        });
        popup.locator(loginPage.getFieldEmailAdressGoogle()).fill(username);
        popup.locator(loginPage.getButtonNextGoogle()).click();
        driver.waitForTimeout(4000);
        popup.locator(loginPage.getFieldPasswordGoogle()).fill(password);
        popup.locator(loginPage.getButtonNext()).click();
        driver.waitForTimeout(4000);
        driver.reload();
    }
}
