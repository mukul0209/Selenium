package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class navigation_commands {
    public static void main(String[] args) {

        //Creating a driver object referencing WebDriver interface
        WebDriver driver;

        //Setting webdriver.chrome.driver property
        System.setProperty("webdriver.chrome.driver", "/Users/mukul/Documents/Testing/Automation/drivers/chrome/chromedriver");

        //Instantiating driver object and launching browser
        driver = new ChromeDriver();

        //get() - helps in opening a URL
        driver.get("https://www.google.com");

        /*navigate().to("url") - helps in loading a new webpage in current browser window.
                        - blocks all other operations under web page is loaded completely.(when internal HTTP: GET operation is called! )

        */
        driver.navigate().to("https://www.saucedemo.com");

        //getCurrentUrl() - helps in getting current url
        String current_url = driver.getCurrentUrl();
        System.out.println("Current URL is: " + current_url);

        //getPageSource() - helps in getting page source
        String page_source = driver.getPageSource();
        System.out.println("Page Source is: " + page_source);

        //getTitle() - helps in getting page title
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);



        /* findElement() - helps in finding any element in active DOM with help of locators. Returns a single web element.
                         - if element not found >> returns NoSuchElementException
           findElements() - helps in finding multiple similar web elements and returns a LIST of web elements.
                          - if elements not found >> return an empty list List<WebElement>.
           Implementation in next video! */


       //MANAGING WINDOWS COMMANDS - manage().window().?

        //fullscreen() - helps in getting window fullscreen
        driver.manage().window().fullscreen();

        //maximize() - helps in getting maximized browser
        driver.manage().window().maximize();

        //getPosition() - helps in measuring position from left side in terms of X and y coordinates.
        Point xy = driver.manage().window().getPosition();
        System.out.println(xy);
        int x = driver.manage().window().getPosition().getX();
        System.out.println(x);
        int y = driver.manage().window().getPosition().getY();
        System.out.println(y);

        //setPosition() - helps in setting the position of window by providing X and Y coordinates
        driver.manage().window().setPosition(new Point(50,200));

        //getSize() - helps in getting window size
        Dimension size = driver.manage().window().getSize();
        System.out.println("Size is: " + size);

        //setSize() - helps in setting window size by providing width and height
        driver.manage().window().setSize(new Dimension(300,500));

        //getWidth() and getHeight() - helps in getting width and height
        System.out.println("Width of window: " + driver.manage().window().getSize().getWidth());
        System.out.println("Height of window: " + driver.manage().window().getSize().getHeight());

        //deleteAllCookies() - deleting all the cookies of a specific domain
        driver.manage().deleteAllCookies();
        System.out.println("Cookies Deleted!");



        //NAVIGATION COMMANDS - can only be used for urls opened by .navigate().to()
        //back() - helps in navigating to previous page
        driver.navigate().back();
        //forward() - helps in navigating to next page
        driver.navigate().forward();
        //refresh() - helps in refreshing the current page
        driver.navigate().refresh();



        //switchTo() - helps in switching to alerts while testing
        driver.switchTo().alert();

        //switchTo() COMMANDS:
        //frame - helps in jumping from one frame to another [in case of multiple frames present]
        driver.switchTo().frame(2);

        //frame - through String name/id
        driver.switchTo().frame("name or ID");

        //frame - through locator
        driver.switchTo().frame("WebElement locator");

        //parentFrame() - helps in switching from inner frame to Parent Frame
        driver.switchTo().parentFrame();





































        //close() - closing the current active window!
        //driver.close();

        //quit() - closing all the windows opened!
        driver = new ChromeDriver();
        driver.navigate().to("https://www.yashrajfilms.com/");

        Set<String> size1 = driver.getWindowHandles();
        System.out.println("Total Windows: " + size1.size());
        //driver.quit();








        
        
        









    }
}
