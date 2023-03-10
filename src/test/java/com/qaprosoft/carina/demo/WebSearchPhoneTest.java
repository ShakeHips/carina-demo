package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebSearchPhoneTest implements IAbstractTest {
    private final String searchModel = "Galaxy Z Fold4";
    @Test
    public void searchFoldPhoneTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        headerMenu.openSearchResultPage(searchModel);

    }
}
