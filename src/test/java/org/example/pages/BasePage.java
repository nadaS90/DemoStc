package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    static WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public static void ClickBtn(WebElement button)
    {
        button.click();
    }

}
