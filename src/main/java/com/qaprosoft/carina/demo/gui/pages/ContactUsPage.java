package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"article-hgroup\"]/h1")
    private ExtendedWebElement contactUsPageTitle;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public boolean contactUsPageCheck() {
        return contactUsPageTitle.isElementPresent();
    }
}
