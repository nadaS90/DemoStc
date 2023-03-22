package org.example.stepDef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;

    @Before
    public static void OpenBrowser() {
        String chromePath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);

        ChromeOptions newOptions = new ChromeOptions();
        newOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(newOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://subscribe.stctv.com/bh-en");
    }

    @After()
    public static void CloseBrowser() {
        driver.quit();
    }


}
