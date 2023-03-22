package org.example.stepDef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import utilities.Helper;

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
        driver.navigate().to("https://subscribe.stctv.com/sa-en");
    }

    @After()
    public static void CloseBrowser() {
        driver.quit();
    }

@AfterMethod
    public static void TakeScreenshotOnFailure(ITestResult result)
{
    if (result.getStatus() == ITestResult.FAILURE)
    {
        System.out.println("We have Failed TC");
        System.out.println("We Took screenshot");
        Helper.failureScreenSoot(driver,result.getName());
    }
}
}
