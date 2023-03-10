package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"normal-text res-success\"]/h3")
    private ExtendedWebElement successfulRegistration;
    @FindBy(xpath = "//fieldset/input[@id=\"uname\"]")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//fieldset/input[@id=\"email\"]")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//div[@id=\"user-submit\"]/form[@id=\"frmOpin\"]/input")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//fieldset[2]/div/label[@for = 'iagree1']")
    private ExtendedWebElement agreeButton;

    @FindBy(xpath = "//fieldset[2]/div/label[@for = 'iagree2']")
    private ExtendedWebElement confirmAgeButton;

    @FindBy(xpath = "//div[@id=\"ucsubmit-f\"]/input")
    private ExtendedWebElement submitButton;

    @FindBy(className = "article-info-name")
    private ExtendedWebElement signUpPageTitle;
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return signUpPageTitle.isElementPresent();
    }

    public boolean isRegistrationSuccessful(){
        return successfulRegistration.isElementPresent();
    }

    public boolean isUsernameInputPresent() {
        return usernameInput.isElementPresent();
    }

    public boolean isEmailInputPresent() {
        return emailInput.isElementPresent();
    }

    public boolean isPasswordInputPresent() {
        return passwordInput.isElementPresent();
    }

    public boolean isAgreeButtonPresent() {
        return agreeButton.isElementPresent();
    }

    public boolean isConfirmAgeButtonPresent() {
        return confirmAgeButton.isElementPresent();
    }

    public boolean isSubmitButtonPresent() {
        return submitButton.isElementPresent();
    }

    public void insertUsername(String username) {
        usernameInput.type(username);
    }

    public void insertEmail(String email) {
        emailInput.type(email);
    }
    public void insertPassword(String password) {
        passwordInput.type(password);
    }

    public void clickAgree(){
        agreeButton.click();
    }

    public void clickConfirm() {
        confirmAgeButton.click();
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public SignUpPage signUpUser(String username, String email, String password) {
        insertUsername(username);
        insertEmail(email);
        insertPassword(password);
        clickAgree();
        clickConfirm();
        clickSubmit();
        return new SignUpPage(driver);
    }
}
