package com.npower.steps;

import com.npower.webpages.HomePage;
import com.npower.webpages.SecondPage;
import cucumber.annotation.Before;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by DLerma on 03/02/2017.
 */
public class HomePageStep {
    String driverPath = "F:\\\\DL_documents\\selenium\\";
    WebDriver driver;
    HomePage home;
    SecondPage second;
    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver",  driverPath+"geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        home = new HomePage(driver);
    }
    @Given("^I am on the Home page$")
    public void iAmOnTheHomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        home.isPageOpened();
        //throw new PendingException();
    }

    @When("^I insert my postcode as \"([^\"]*)\"$")
    public void iInsertMyPostcodeAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        home.setUser_postcode("G128RF");
       // throw new PendingException();
    }


    @And("^I press \"([^\"]*)\"$")
    public void iPress(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        home.clickGetAQuote();
        //throw new PendingException();
    }

    @Then("^I should go to the next page$")
    public void iShouldGoToTheNextPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        second = new SecondPage(driver);
        second.isPageOpened();
        driver.close();
        //throw new PendingException();
    }


}
