package com.qaprosoft.carina.demo.gui.pages.LumaPages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpPageLuma extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"actions-toolbar\"]/div[@class=\"primary\"]/button[@type=\"submit\"]")
    private ExtendedWebElement submitButton;

    @FindBy(xpath = "//h1[@class=\"page-title\"]/span")
    private ExtendedWebElement titleCheck;

    @FindBy(xpath = "//div[@class=\"field field-name-firstname required\"]/div/input")
    private ExtendedWebElement firstNameInput;

    @FindBy(xpath = "//div[@class=\"field field-name-lastname required\"]/div/input")
    private ExtendedWebElement lastNameInput;

    @FindBy(xpath = "//div[@class=\"field required\"]/div/input")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//div[@class=\"field password required\"]/div/input")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//div[@class=\"field confirmation required\"]/div/input")
    private ExtendedWebElement confirmPassword;

    public SignUpPageLuma(WebDriver driver) {
        super(driver);
    }

    public void insertEmail(String email){
        emailInput.type(email);
    }

    public void insertPassword(String password){
        passwordInput.type(password);
    }

    public void insertFirstName(String firstName){
        firstNameInput.type(firstName);
    }

    public void insertLastName(String lastName){
        lastNameInput.type(lastName);
    }

    public void confirmPassword(String password){
        confirmPassword.type(password);
    }

    public SignUpPageLuma createUser(String firstName, String lastName, String email, String password){
        insertFirstName(firstName);
        insertLastName(lastName);
        insertEmail(email);
        insertPassword(password);
        confirmPassword(password);
        submitButton.click();
        return new SignUpPageLuma(driver);
    }
}
