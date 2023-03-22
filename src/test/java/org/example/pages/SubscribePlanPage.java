package org.example.pages;

import com.google.common.base.FinalizablePhantomReference;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubscribePlanPage extends BasePage {
    public SubscribePlanPage(WebDriver driver)
    {
        super(driver);
    }

    //Locators
    public final String CountryBtnID = "//div[@class='country-current']";
    public final String CountryNameID = "//span[@id='country-name']";
    public final String CountrySelectID = "//*[@id='country-selct']";
    public final String KSACountryID = "//a[@id='sa']";
    public final String KWDCountryID = "//a[@id='kw']";
    public final String BahrainCountryID = "//a[@id='sa']";

    public final String LitePlanID =  "//strong[@id='name-lite']";
    public final String ClassicPlanID =  "//strong[@id='name-classic']";
    public final String PremiumID =  "//strong[@id='name-premium']";
    public final String LiteCurrencyID = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/i[1]";
    public final String ClassicCurrencyID = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/i[1]";
    public final String PremiumCurrencyID = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/i[1]";
    public final String PlanPriceID = "//*[@id=\"main\"]/div/div[1]/div[3]";


    public WebElement CountryBtn = driver.findElement(By.xpath(CountryBtnID));
    public WebElement CountryName = driver.findElement(By.xpath(CountryNameID));
    public WebElement CountrySelect = driver.findElement(By.xpath(CountrySelectID));
    public WebElement KSACountry = driver.findElement(By.xpath(KSACountryID));
    public WebElement KuwaitCountry = driver.findElement(By.xpath(KWDCountryID));

    public WebElement LitePlan = driver.findElement(By.xpath(LitePlanID));
    public WebElement ClassicPlan = driver.findElement(By.xpath(ClassicPlanID));
    public WebElement Premium = driver.findElement(By.xpath(PremiumID));
    public WebElement LiteCurrency = driver.findElement(By.xpath(LiteCurrencyID));
    public WebElement ClassicCurrency = driver.findElement(By.xpath(ClassicCurrencyID));
    public WebElement PremiumCurrency = driver.findElement(By.xpath(PremiumCurrencyID));
    public WebElement PlanPrice = driver.findElement(By.xpath(PlanPriceID));



    public String ActualCountryName = CountryName.getText();
    public String PlanPrices = PlanPrice.getText();
    public String LitePlaneOption = LitePlan.getText();
    public String ClassicPlaneOption = ClassicPlan.getText();
    public String PremiumPlaneOption = Premium.getText();
    public String LiteCurrencyTxt = LiteCurrency.getText();
    public String ClassicCurrencyTxt = ClassicCurrency.getText();
    public String PremiumCurrencyTxt = PremiumCurrency.getText();


    public  void UserClickOnCountryBtn()
    {
        ClickBtn(CountryBtn);
    }

    public boolean DoesCountrySelectDisplayed()
    {
        try
        {
            return CountrySelect.isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public void UserClickOnKSABtn()
    {
        ClickBtn(KSACountry);
    }

    public  void UserClickOnKwdBtn()
    {
        ClickBtn(KuwaitCountry);
    }



}
