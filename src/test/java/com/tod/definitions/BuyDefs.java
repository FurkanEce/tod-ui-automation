package com.tod.definitions;

import com.tod.helpers.Driver;
import com.tod.pages.BuyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;

public class BuyDefs {
    private BuyPage buyPage;
    private Dotenv dotenv;
    private String packagePrice;

    public BuyDefs() {
        this.buyPage = new BuyPage();
        this.dotenv = Dotenv.configure().filename(".env").load();
        this.packagePrice = dotenv.get("packagePrice");
    }

    @Then("It is checked that the buy page is open")
    public void itIsCheckedThatTheBuyPageIsOpen(){
        String buyUrl = Driver.get().getCurrentUrl();
        Assertions.assertTrue(buyUrl.equals(this.dotenv.get("buyUrl")));
    }

    @And("Super League package is checked")
    public void superLeaguePackageIsChecked() {
        this.buyPage.advantagePackageCart.isDisplayed();
    }

    @And("Price is right")
    public void priceIsRight() {
        Assertions.assertEquals(this.packagePrice, this.buyPage.advantagePackagePrice.getText());
    }

    @When("User clicks to the buy now button")
    public void userClicksToTheBuyNowButton() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.get();
        jsExecutor.executeScript("arguments[0].click();", this.buyPage.advantagePackageSelectBtn);
    }
}
