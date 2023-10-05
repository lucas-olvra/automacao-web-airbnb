package com.airbnb.pages;

public class AccountPage {
    private String accessProfile = "//a[@href='/users/show']";

    private String username = "//span[@class='t1gpcl1t dir dir-ltr' and text()='Project-Airbnb']";

    public String getAccessProfile() {
        return accessProfile;
    }

    public String getUsername() {
        return username;
    }
}
