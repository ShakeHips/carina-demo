package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.naming.ldap.ExtendedRequest;

public class NewsSimplePage extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"article-hgroup\"]/h1")
    private ExtendedWebElement newsPageCheckTitle;

    public NewsSimplePage(WebDriver driver) {
        super(driver);
    }

    public boolean newsPageCheck(){
        return newsPageCheckTitle.isElementPresent();
    }
}
