package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ComparingPage extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"article-hgroup\"]/h1")
    private ExtendedWebElement comparingPageTitle;

    public ComparingPage(WebDriver driver) {
        super(driver);
    }

    public boolean comaparingPageCheck(){
        return comparingPageTitle.isElementPresent();
    }
}
