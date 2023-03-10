package com.qaprosoft.carina.demo.gui.components.LumaComponents;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterMenu extends AbstractUIObject {

    @FindBy(xpath = "//div[@class=\"header content\"]/a")
    private ExtendedWebElement homeButton;

    @FindBy(xpath = "//ul[@class=\"header links\"]/li/a[1]")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//ul[@class=\"header links\"]/li[3]/a")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//div[@class=\"control\"]/input")
    private ExtendedWebElement searchInput;

    @FindBy(id = "ui-id-5")
    private ExtendedWebElement menProducts;

    public FooterMenu(WebDriver driver) {
        super(driver);
    }

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
