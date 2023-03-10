package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SamsungFoldPage;
import com.qaprosoft.carina.demo.gui.pages.SamsungPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebFoldPhoneTest implements IAbstractTest {

    @Test
    public void findFoldPhoneTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page was not opened");
        SamsungPage samsungPage = homePage.openSamsungPage();
        Assert.assertTrue(samsungPage.isSamsingPageOpen(), "Sumsung Page was not opened");
        SamsungFoldPage samsungFoldPage = samsungPage.openSamsungFoldPage();
        Assert.assertTrue(samsungFoldPage.isFoldPhonePageOpen(), "Samsung Fold page was not opened");
    }
}
