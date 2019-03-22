package com.Pages;

import com.Objects.MyAccountPageObjects;
import com.Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Helpers {
    private MyAccountPageObjects myAccountPageObjects;


    public MyAccountPage(WebDriver driver) {
        super(driver);
        myAccountPageObjects = new MyAccountPageObjects();
        PageFactory.initElements(driver, myAccountPageObjects);
    }


    public void validateMyAccoutPage() {
        waitForElement(myAccountPageObjects.signOutLink);
        runner.validateMyAccountPage(myAccountPageObjects);
    }
}
