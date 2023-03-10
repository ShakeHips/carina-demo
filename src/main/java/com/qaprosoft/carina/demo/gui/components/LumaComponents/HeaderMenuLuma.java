package com.qaprosoft.carina.demo.gui.components.LumaComponents;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.LumaPages.LoginPageLuma;
import com.qaprosoft.carina.demo.gui.pages.LumaPages.SignUpPageLuma;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenuLuma extends AbstractUIObject {


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

    public HeaderMenuLuma(WebDriver driver) {
        super(driver);
    }

    public HeaderMenuLuma(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SignUpPageLuma getSignUpPageLuma(){
        signUpButton.click();
        return new SignUpPageLuma(driver);
    }

    public LoginPageLuma getLoginPageLuma(){
        signInButton.click();
        return new LoginPageLuma(driver);
    }
}
