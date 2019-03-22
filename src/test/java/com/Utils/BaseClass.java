package com.Utils;

import com.Flows.MobileFlow;
import com.Flows.WebFlow;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.PHANTOMJS;

public class BaseClass {
    public static IRunner runner;
    public WebDriver driver;
    Dimension d;
    private String baseUrl = "http://automationpractice.com/index.php";


    @BeforeClass
    public void setUp() {
        getFireFoxBrowser();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    private void getChromeBrowser() {
        System.out.println("Setting up Chrome Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private void getFireFoxBrowser() {
        System.out.println("Setting up FireFox Browser");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        runner = new WebFlow(driver);
    }

    private void getFireFoxMobileBrowser() {
        System.out.println("Setting up FireFox Browser");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        d = new Dimension(464, 836);  //iPhone 6 Plus
        driver.manage().window().setSize(d);
        runner = new MobileFlow(driver);
    }

    private void getPhantomJsBrowser() {
        System.out.println("Setting up PhantomJs Browser");
        WebDriverManager.getInstance(PHANTOMJS).setup();
    }

    @AfterClass
    public void teardown() {
        if (driver != null)
            driver.quit();
    }

}
