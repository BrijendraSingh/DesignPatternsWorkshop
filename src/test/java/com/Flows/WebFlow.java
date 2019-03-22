package com.Flows;

import com.Objects.MyAccountPageObjects;
import com.Utils.Helpers;
import com.Utils.IRunner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebFlow extends Helpers implements IRunner {

    public WebFlow(WebDriver driver) {
        super(driver);
    }

    public void validateMyAccountPage(MyAccountPageObjects myAccountPageObjects) {
        waitForElement(myAccountPageObjects.signOutLink);
        Assert.assertEquals(myAccountPageObjects.categoryLink.getText(), "", "View is not desktop");
        System.out.println("In My account Page of Desktop");
    }
}
