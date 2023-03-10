package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SamsungFoldPage extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"article-info-line page-specs light border-bottom\"]/h1")
    private ExtendedWebElement foldPhonePageTitle;

    public SamsungFoldPage(WebDriver driver) {
        super(driver);
    }

    public boolean isFoldPhonePageOpen(){
        return foldPhonePageTitle.isElementPresent();
    }
}
