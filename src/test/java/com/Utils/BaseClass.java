package com.Utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static IRunner runner;
    public WebDriver driver;
    private String baseUrl = "http://automationpractice.com/index.php";


    @BeforeClass
    public void setUp() {
        driver = BrowserFactory.getBrowser(System.getenv("browser"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterClass
    public void teardown() {
        if (driver != null)
            driver.quit();
    }

}
