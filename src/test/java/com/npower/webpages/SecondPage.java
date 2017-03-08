package com.npower.webpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by DLerma on 03/02/2017.
 */
public class SecondPage {
    private WebDriver driver;
    @FindBy(xpath = ".//*[@id='quoteSearchForm']/h1/span")
    private WebElement heading;

    public SecondPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isPageOpened(){
        return heading.getText().toString().contains("Get a quote for gas and electricity at:");
    }
}
