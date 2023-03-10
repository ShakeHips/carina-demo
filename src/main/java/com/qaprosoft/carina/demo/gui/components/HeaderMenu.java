package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.SearchResultPage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends AbstractUIObject {


    @FindBy(xpath = "//div[@class=\"search-buttons\"]/a[@class=\"go\"]")
    private ExtendedWebElement submitSearchButton;
    @FindBy(xpath = "//div[@id=\"nav\"]/form/input")
    private ExtendedWebElement searchInput;
    @FindBy(xpath = "//a[@href=\"register.php3\"]")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//a[@id=\"login-active\"]/i")
    private ExtendedWebElement loginButtonHeader;

    @FindBy(xpath = "//a[@href=\"account.php3\"]")
    private ExtendedWebElement accountButton;
    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isLoggedIn(){
        return accountButton.isElementPresent();
    }
    public SignUpPage openSignUpPage() {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public SearchResultPage openSearchResultPage(String searchString){
        searchInput.type(searchString);
        searchInput.click(10);
        submitSearchButton.click();
        return new SearchResultPage(driver);
    }
}
