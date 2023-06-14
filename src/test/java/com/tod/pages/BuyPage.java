package com.tod.pages;

import com.tod.helpers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage {

    public BuyPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h3[contains(.,'Avantajlı Sezonluk Süper Lig')]")
    public WebElement advantagePackageBuyPage;

    @FindBy(xpath = "//span[.='Avantajlı Sezonluk Süper Lig']")
    public WebElement advantagePackageCart;

    @FindBy(xpath = "//span[.='129.00 ₺']")
    public WebElement advantagePackagePrice;

    @FindBy(xpath = "//div[@id='SUPER_LIG_OTT_WEB_KATALOGU']//div[@class='bc-card package-card subscribe-card has-ribbon  ']//a[@id='add-package-into-basket']")
    public WebElement advantagePackageSelectBtn;



}
