package com.tod.definitions;

import com.tod.helpers.Driver;
import com.tod.pages.WelcomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Dimension;

import java.util.concurrent.TimeUnit;

public class WelcomeDefs {
    private WelcomePage welcomePage;
    private Dotenv dotenv;

    public WelcomeDefs(){
        this.welcomePage = new WelcomePage();
        this.dotenv = Dotenv.configure().filename(".env").load();
    }

    @Given("User goes to the TOD page")
    public void userGoesToTheTODPage(){
        Driver.get().manage().window().setSize(new Dimension(1920, 1080));
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().get(this.dotenv.get("url"));
    }

    @Then("It is checked that the homepage is open")
    public void itIsCheckedThatTheHomepageIsOpen() {
        String todUrl = Driver.get().getCurrentUrl();
        System.out.println(todUrl);
        Assertions.assertTrue(todUrl.equals(this.dotenv.get("url")));
    }

    @When("User clicks to the buy button")
    public void userClicksToTheBuyButton() {
        this.welcomePage.buyBtn.click();
    }
}
