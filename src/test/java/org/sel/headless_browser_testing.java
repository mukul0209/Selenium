package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Sometimes you don’t want to test on the real browser, that time Headless(no GUI) helps you in testing the application.
//Advantages: fast, low bugs risk due to no human interaction
//Disadvantages: no real user experience, GUI bugs not detected!

public class headless_browser_testing {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mukul/Documents/Testing/Automation/drivers/chrome/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        //window-size necessary for responsive sites.
        options.addArguments("window-size=1200x600");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("http://seleniumhq.org");
        driver.quit();




    }
}
