package by.pizzatempo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver webDriver;
    @BeforeEach
    public void setUp(){
        webDriver= new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://www.pizzatempo.by/");
    }

    @AfterEach
    public void exit(){
      //  webDriver.quit();
    }
}
