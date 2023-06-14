package com.tod.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tod.helpers.Driver;

public class WelcomePage {
    public WelcomePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//a[4]")
    public WebElement buyBtn;

}
