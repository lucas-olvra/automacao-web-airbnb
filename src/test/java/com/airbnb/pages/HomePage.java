package com.airbnb.pages;

public class HomePage {
        private String buttonPerfomLogin = "//button[@data-testid='cypress-headernav-profile']";

        private String buttonEmail = "//button[@data-testid='social-auth-button-google']";

        private String buttonAcceptCookies = "//button[@class='l1ovpqvx bmx2gr4 c1ih3c6 f1hzc007 dir dir-ltr']";

        private String buttonLogin = "//a[@data-testid='cypress-headernav-login']";

        private String buttonAccount = "//a[@href='/account-settings']";

    public String getButtonAccount() {
        return buttonAccount;
    }

    public String getButtonPerfomLogin() {
            return buttonPerfomLogin;
        }

        public String getButtonEmail() {
            return buttonEmail;
        }

        public String getButtonAcceptCookies() {
            return buttonAcceptCookies;
        }

        public String getButtonLogin() {
            return buttonLogin;
        }
    }
