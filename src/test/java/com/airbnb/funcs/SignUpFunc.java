package com.airbnb.funcs;

import com.airbnb.common.BaseTest;
import com.airbnb.pages.SingUpPage;

public class SignUpFunc extends BaseTest {

    SingUpPage singUpPage = new SingUpPage();
    public void accessScreen(String tela) {
        tela = tela.toUpperCase();
        driver.waitForTimeout(2000);
        switch (tela) {
            case "LOGIN":
                if (driver.locator(singUpPage.getButtonLogin()).isVisible()) {
                    driver.locator(singUpPage.getButtonLogin()).click();
                }
        }
    }
}
