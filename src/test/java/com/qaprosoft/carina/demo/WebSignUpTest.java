package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class WebSignUpTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "Nikita Yazlovytsky")
    public void signUpTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page isn't opened");
        SignUpPage signUpPage = homePage.getHeaderMenu().openSignUpPage();
        Assert.assertTrue(signUpPage.isPageOpened(), "Sign Up page isn't opened");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(signUpPage.isUsernameInputPresent(), "Username input is not present");
        softAssert.assertTrue(signUpPage.isEmailInputPresent(), "Email input is not present");
        softAssert.assertTrue(signUpPage.isPasswordInputPresent(), "Password input is not present");
//        softAssert.assertTrue(signUpPage.isAgreeButtonPresent(), "Agree button is not present");
//        softAssert.assertTrue(signUpPage.isConfirmAgeButtonPresent(), "Confirm button is not present");
        softAssert.assertTrue(signUpPage.isSubmitButtonPresent(), "Submit button is not present");
        softAssert.assertAll();
        signUpPage.signUpUser("Nikzzzzzy", "nikitayazlovytskyy@gmail.com", "1112222");
        Assert.assertTrue(signUpPage.isRegistrationSuccessful(), "Registration was not successful");
    }
}
