package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/mukul/Documents/Testing/Automation/drivers/chrome/chromedriver");

        driver.get("https://www.saucedemo.com");

        //Title:
        String title = driver.getTitle();
        System.out.println(title);

        //By.id - unique, fastest
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        driver.findElement(By.id("user-name")).clear();
        Thread.sleep(1000);


        /*By.name - When to use name:
                  - To find an element that is not easily identified by other means, such as by its id or class.
                  - To find an element that is dynamically generated.
                  - To find an element that is shared by multiple pages.
         */

        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        /* TAG-NAME
        The other locators like Name, ID, and Class Name have multiple attributes like name, id,
        and value, class, etc. As for the ID, Name, and class names locators in selenium,
        we use the values for locating the elements,
        but in the case of tagName, we are using the tagName to identify the elements.
         */

        List <WebElement> list1 = driver.findElements(By.tagName("a"));
        int size = list1.size();
        System.out.println("In this page we have found "+ size + " links");

        //Getting text of each link
        for(int i=0; i<size; i++){
            System.out.println(list1.get(i).getText());
        }


        //By.className
        //findElements usage

        driver.navigate().to("https://softwaretestingo.blogspot.com/2020/08/multiple-element-have-same-classname.html");
        Thread.sleep(10000);

        List<WebElement> list = driver.findElements(By.className("inputtext"));
        int list_size = list.size();

        System.out.println("There are "+list_size+" elements which have the same class name");
        list.get(0).sendKeys("SoftwareTestingo");
        list.get(1).sendKeys("Admin");
        list.get(2).sendKeys("Selenium");
        Thread.sleep(2000);







        driver.quit();



    }
}
