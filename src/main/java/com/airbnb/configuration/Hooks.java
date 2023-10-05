package com.airbnb.configuration;

import com.airbnb.common.BaseTest;
import com.airbnb.common.StaticVariable;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import java.net.MalformedURLException;
import java.nio.file.Paths;

public class Hooks extends BaseTest {

    @BeforeAll
    public static void beforeTest() throws MalformedURLException {
        System.out.println("Sistema Operacional: " + System.getProperty("os.name"));
        inicializarDriver();
        createDriverContext(); // Chama o método para criar o driver e a context antes dos testes
    }

    @Before
    public void before() {
        // Aqui você pode definir qualquer configuração adicional antes de executar seus testes
        StaticVariable.setUrl("https://www.airbnb.com.br");
        driver.setViewportSize(1400, 720);
        driver.navigate(StaticVariable.getUrl());
    }

    @After
    public void close(Scenario scenario) {
        byte[] screenshot = driver.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot.png")).setFullPage(true));
        scenario.attach(screenshot, "image/png", scenario.getName());
        context.close();
    }

    // Método para criar o driver e a context
    public static void createDriverContext() {
        createContextAndPage();
    }
}
