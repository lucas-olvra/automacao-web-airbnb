package com.airbnb.common;

import com.microsoft.playwright.*;

public abstract class BaseTest {

    public static Playwright playwright;
    static Browser browser;

    public static BrowserContext context;
    public static Page driver;

    public static void inicializarDriver() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    protected static void createContextAndPage() {
        context = browser.newContext();
        driver = context.newPage();
    }
}

