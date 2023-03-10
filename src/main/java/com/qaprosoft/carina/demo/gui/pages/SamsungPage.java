package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SamsungPage extends AbstractPage {


    @FindBy(xpath = "//div[@class=\"makers\"]/ul/li/a[@href=\"samsung_galaxy_z_fold4-11737.php\"]")
    private ExtendedWebElement foldPhoneButton;
    @FindBy(xpath = "//div[@class=\"article-hgroup\"]/h1")
    private ExtendedWebElement samsungPageTitle;

    public SamsungPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSamsingPageOpen(){
        return samsungPageTitle.isElementPresent();
    }

    public SamsungFoldPage openSamsungFoldPage(){
        foldPhoneButton.click();
        return new SamsungFoldPage(driver);
    }
}
