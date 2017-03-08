package com.npower.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by DLerma on 03/02/2017.
 */
public class HomePage {
    private WebDriver driver;

    private static String PAGE_URL="http://www.npower.com/home/";

    @FindBy(id = "postcode")
    private WebElement enter_postcode;

    @FindBy(xpath = ".//*[@id='frmMain']/input[1]")
    private WebElement getAQuoteButton;

    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialize Elements
        PageFactory.initElements(driver,this);
    }

    public boolean isPageOpened(){
        return enter_postcode.isEnabled();
    }

    public void setUser_postcode(String postcode){
        enter_postcode.clear();
        enter_postcode.sendKeys(postcode);
    }

    public void clickGetAQuote(){
        getAQuoteButton.click();
    }
}
