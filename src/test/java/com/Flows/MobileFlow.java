package com.Flows;

import com.Objects.MyAccountPageObjects;
import com.Utils.Helpers;
import com.Utils.IRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MobileFlow extends Helpers implements IRunner {

    public MobileFlow(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement waitForElement(WebElement by) {
        return super.waitForElement(by);
    }

    public void validateMyAccountPage(MyAccountPageObjects myAccountPageObjects) {
        waitForElement(myAccountPageObjects.signOutLink);
        Assert.assertEquals(myAccountPageObjects.categoryLink.getText(), "CATEGORIES", "View might not be responsive");
        System.out.println("In My account Page of Mobile");
    }
}
