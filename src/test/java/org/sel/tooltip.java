package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
The tooltips text is a hidden text which is behind the elements like images, buttons, link, etc.
and when you place your mouse over those elements,
 then some text appears which shares some of the information about that element or object.
 */
public class tooltip {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mukul/Documents/Testing/Automation/drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");
        WebElement tooltip_element = driver.findElement(By.id("Layer_1"));
        String tool_tip_text = tooltip_element.getAttribute("title");
        System.out.println("ToolTip Text is: " + tool_tip_text);
        driver.quit();



    }
}
