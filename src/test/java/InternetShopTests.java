import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.pages.HomePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InternetShopTests {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final String SECTION = "Instrumenti";
//    private final MENU_ITEM =

    @Test
    public void checkProductsInCart() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://1a.lv");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        //find element
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);
        acceptBtn.click();

    }

    @Test
    public void workingWithLists() {
        List<String> names = new ArrayList<>();
        names.add("Dmitry");
        names.add("Laura");
        names.add("Inna");
        names.add("Ira");
        names.add("Anna");

        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.get(2));

        //---FOR---
        for (int i = 0; i < 4; i++) {
            System.out.println(names.get(i));
            System.out.println("The name number " + (i + 1) + " is: " + names.get(i));
              }
        //--FOREACH--
        for (String n : names) {
            System.out.println(n);
        }
    }
}
