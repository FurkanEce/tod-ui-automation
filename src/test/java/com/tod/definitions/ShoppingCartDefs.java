package com.tod.definitions;

import com.tod.helpers.Driver;
import com.tod.pages.BuyPage;
import com.tod.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;

public class ShoppingCartDefs {
    private ShoppingCartPage shoppingCartPage;
    private BuyPage buyPage;

    public ShoppingCartDefs(){
        this.buyPage = new BuyPage();
        this.shoppingCartPage = new ShoppingCartPage();
    }

    @And("Shopping cart page is checked")
    public void shoppingCartPageIsChecked(){
        Assertions.assertEquals("(Avantajlı Sezonluk Süper Lig )", this.shoppingCartPage.advantagePackageShoppingCart.getText());
        Driver.closeDriver();
    }

}
