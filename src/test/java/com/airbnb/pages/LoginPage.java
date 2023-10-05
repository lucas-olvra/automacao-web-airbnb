package com.airbnb.pages;

public class LoginPage {

    private String fieldEmailAdressGoogle = "//input[@type='email']";

    private String buttonNextGoogle = "//div[@id='identifierNext']";

    private String fieldPasswordGoogle = "//input[@type='password']";

    private String buttonNext = "//div[@id='passwordNext']";

    public String getButtonNext() {
        return buttonNext;
    }

    public String getFieldEmailAdressGoogle() {
        return fieldEmailAdressGoogle;
    }

    public String getButtonNextGoogle() {
        return buttonNextGoogle;
    }

    public String getFieldPasswordGoogle() {
        return fieldPasswordGoogle;
    }

    public String getFieldEmailAddress() {
        return fieldEmailAdressGoogle;
    }
}
