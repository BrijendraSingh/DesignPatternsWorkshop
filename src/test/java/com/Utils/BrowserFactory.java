package com.Utils;

import com.Flows.MobileFlow;
import com.Flows.WebFlow;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.PHANTOMJS;

public class BrowserFactory {
    public static IRunner runner;

    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;
        Dimension d = new Dimension(464, 836);  //iPhone 6 Plus

        switch (browserName) {
            case "chrome":
                System.out.println("Setting up Chrome Browser");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                runner = new WebFlow(driver);
                break;

            case "chromeMobile":
                System.out.println("Setting up Chrome Browser in Mobile View");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().setSize(d);
                runner = new MobileFlow(driver);
                break;

            case "firefox":
                System.out.println("Setting up FireFox Browser For Desktop");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                runner = new WebFlow(driver);
                break;

            case "firefoxMobile":
                System.out.println("Setting up FireFox Browser in Mobile view");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().setSize(d);
                runner = new MobileFlow(driver);
                break;

            case "safari":
                System.out.println("Setting up Safari Browser ");
                driver = new SafariDriver();
                runner = new MobileFlow(driver);
                break;

            case "phantomJS":
                System.out.println("Setting up PhantomJS Browser ");
                WebDriverManager.getInstance(PHANTOMJS).setup();
                break;

            default:
                System.out.println("Invalid browser Name");
                break;

        }
        return driver;
    }
}
