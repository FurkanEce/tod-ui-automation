package com.tod.definitions;

import com.tod.helpers.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp() {
        Driver.get().manage().window().setSize(new Dimension(1920, 1080));
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}

