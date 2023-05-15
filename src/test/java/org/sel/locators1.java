package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mukul/Documents/Testing/Automation/drivers/chrome/chromedriver");

        WebDriver driver = new ChromeDriver();



        driver.get("https://www.selenium.dev/");
        driver.findElement(By.partialLinkText("Watch the")).click();
        driver.quit();






    }
}
