package com.airbnb.funcs;


import com.airbnb.common.BaseTest;
import com.airbnb.pages.HomePage;
public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public void accessScreen(String tela) {
        tela = tela.toUpperCase();
        driver.waitForTimeout(2000);

        switch (tela) {
            case "LOGIN":
                if (driver.locator(homePage.getButtonPerfomLogin()).isVisible()) {
                    driver.waitForTimeout(2000);
                    if (driver.locator(homePage.getButtonAcceptCookies()).isVisible()) {
                        driver.locator(homePage.getButtonAcceptCookies()).click();
                        if (!driver.locator(homePage.getButtonAcceptCookies()).isVisible()) {
                            driver.locator(homePage.getButtonPerfomLogin()).click();
                        }
                    }
                }
                driver.locator(homePage.getButtonLogin()).click();
                driver.locator(homePage.getButtonEmail()).click();
        }
    }

    public void accountProfile() {
        driver.locator(homePage.getButtonPerfomLogin()).click();
        driver.locator(homePage.getButtonAccount()).click();
    }
}
