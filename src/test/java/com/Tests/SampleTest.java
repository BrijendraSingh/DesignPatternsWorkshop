package com.Tests;

import com.Pages.HomePage;
import com.Utils.BaseClass;
import com.Utils.NewUser;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {

    @Test
    public void SignInTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn().enterCredentials("test@thoughtworks.com", "password")
                .validateMyAccoutPage();
    }

    @Test
    public void RegistrationTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn().enterEmailToRegister("thoughtworks@tw1.com").registerUser(new NewUser().
                addAdditionalAddress("TW").addAdditionInfo("Additional Info"));
    }
}
