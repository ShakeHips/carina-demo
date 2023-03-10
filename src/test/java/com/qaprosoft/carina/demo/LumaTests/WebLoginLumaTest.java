package com.qaprosoft.carina.demo.LumaTests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.LumaComponents.HeaderMenuLuma;
import com.qaprosoft.carina.demo.gui.pages.LumaPages.HomePageLuma;
import com.qaprosoft.carina.demo.gui.pages.LumaPages.LoginPageLuma;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebLoginLumaTest implements IAbstractTest {

    public final String email = "yazlovytskynikita@gmail.com";
    public final String password = "1LoveCoding";

    @Test
    public void loginTest(){
        HomePageLuma homePageLuma = new HomePageLuma(getDriver());
        homePageLuma.open();
        Assert.assertTrue(homePageLuma.isPageOpened(), "Home page is not opened");
        HeaderMenuLuma headerMenuLuma = homePageLuma.getHeaderMenuLuma();
        LoginPageLuma loginPageLuma = headerMenuLuma.getLoginPageLuma();
        loginPageLuma.loginUser(email,password);
    }

}
