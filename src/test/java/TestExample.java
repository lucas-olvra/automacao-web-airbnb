import com.microsoft.playwright.*;
import org.junit.jupiter.api.BeforeAll;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExample {

    static Playwright playwright;
    static Browser browser;

    static BrowserContext context;
    static Page page;
    @BeforeAll
    static void launchBrowser(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    @BeforeEach
     void createContextAndPage(){
        context = browser.newContext();
        page = context.newPage();
    }

    @Test
    void testAirbnb(){
        page.navigate("https://www.airbnb.com");
    }
}
