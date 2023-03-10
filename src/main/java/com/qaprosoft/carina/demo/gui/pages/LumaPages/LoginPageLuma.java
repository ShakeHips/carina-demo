package com.qaprosoft.carina.demo.gui.pages.LumaPages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPageLuma extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"field email required\"]/div/input[1]")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//div[@class=\"field password required\"]/div/input[1]")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//div[@class=\"primary\"]/button[@type=\"submit\"]")
    private ExtendedWebElement submitButton;

    public LoginPageLuma(WebDriver driver) {
        super(driver);
    }

    public void insertEmail(String email){
        emailInput.type(email);
    }

    public void insertPassword(String password){
        passwordInput.type(password);
    }

    public LoginPageLuma loginUser(String email, String password){
        insertEmail(email);
        insertPassword(password);
        submitButton.click();
        return new LoginPageLuma(driver);
    }
}
