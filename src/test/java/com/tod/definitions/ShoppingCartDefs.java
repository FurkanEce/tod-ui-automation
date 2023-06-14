package com.tod.definitions;

import com.tod.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;

public class ShoppingCartDefs {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartDefs() {
        this.shoppingCartPage = new ShoppingCartPage();
    }

    @And("Shopping cart page is checked")
    public void shoppingCartPageIsChecked() {
        Assertions.assertEquals("(Avantajlı Sezonluk Süper Lig )", this.shoppingCartPage.advantagePackageShoppingCart.getText());
    }

}
