package com.tod.pages;

import com.tod.helpers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    public ShoppingCartPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h5[1]/span[1]")
    public WebElement advantagePackageShoppingCart;
}
