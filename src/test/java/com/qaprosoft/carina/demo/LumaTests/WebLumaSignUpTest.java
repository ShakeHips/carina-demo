package com.qaprosoft.carina.demo.LumaTests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.LumaComponents.HeaderMenuLuma;
import com.qaprosoft.carina.demo.gui.pages.LumaPages.HomePageLuma;
import com.qaprosoft.carina.demo.gui.pages.LumaPages.SignUpPageLuma;
import org.testng.annotations.Test;
import org.testng.Assert;

public class WebLumaSignUpTest implements IAbstractTest {
    public final String firstName = "John";
    public final String lastName = "Doe";
    public final String email = "yazlovytskynikita@gmail.com";
    public final String password = "1LoveCoding";
    @Test
    public void SignUpLumaTest() {
        HomePageLuma homePageLuma = new HomePageLuma(getDriver());
        homePageLuma.open();
        Assert.assertTrue(homePageLuma.isPageOpened(), "Home page is not opened");
        HeaderMenuLuma headerMenuLuma = homePageLuma.getHeaderMenuLuma();
        SignUpPageLuma signUpPageLuma = headerMenuLuma.getSignUpPageLuma();
        signUpPageLuma.createUser(firstName,lastName,email,password);
    }
}
