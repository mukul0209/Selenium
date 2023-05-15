package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mukul/Documents/Testing/Automation/drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /*
        XPATH - By.xpath("//tag_name[@attribute = 'value']")
        tag_name like input, div, img etc.
        Here, // is used for current node

        Xpath is of 2 types:
        1. Absolute: starts from the root of HTML pages. Starts with single /
                     ex: /html/body/div[1]/form/div[2]/input

        2. Relative: starts from the middle of dom structure. starts with double //
                     ex: //div[@id = 'user-name']/input
         */

        driver.get("https://saucedemo.com");
        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        /*NOTE: If with xpath multiple elements are identified for example a table then
                To select the first row: //tr[1]
                To select the last row: //tr[last()]
        */

        /*
            XPATH FUNCTIONS: 1. contains() - used when value of attribute changes dynamically.
                                           - //tag[contains(@attribute, ‘value‘)]

                             2. starts-with() - //tag[starts-with(@attribute, ‘value‘)]

                             3. text() - used when know exact text. can be used both ways below:
                                       - //button[text()=’Free Sign Up’]
                                       - //button[contains(text(), ‘Signup’ )]

                             4. Position() - used when we have the multiple elements present while making xpath
                                           - //tr[2]/td[position()=1]

                             5. last() - save time if its last i.e. don't know the index!
                                       - (//tag_name[@attribute = 'value']) [last()]

                             6. Concat() - used when text is divided into sections!
         */

        driver.navigate().to("https://softwaretestingo.blogspot.com/2020/08/table-example-for-xpath.html");
        WebElement text_element = driver.findElement(By.xpath("//td[contains(text(), 'Alfred')]"));
        String text = text_element.getText();
        System.out.println(text);

        WebElement text_element_2 = driver.findElement(By.xpath("//td[starts-with(text(), 'Francisco')]"));
        String text2 = text_element_2.getText();
        System.out.println(text2);

        WebElement pos_element = driver.findElement(By.xpath("//tr[2]/td[position()=1]"));
        String pos_text = pos_element.getText();
        System.out.println(pos_text);

        WebElement Ele1 = driver.findElement(By.xpath("//tr[last()]/td[last()-2]"));
        String ele_text = Ele1.getText();

        System.out.println("The Last Row First Cell Text: "+ele_text);

        driver.navigate().to("https://softwaretestingo.blogspot.com/2020/08/invalidselectorexception-in-selenium.html");
        String quotetext = driver.findElement(By.xpath("//p[text()=concat('Hi User. Thanks for Your',\"'s love\",' & Supoport')]")).getText();
        System.out.println("The Full Text: "+quotetext);

        //AND, OR operators - used and functions as used in your maths and excel!

        driver.navigate().to("https://softwaretestingo.blogspot.com/2020/08/xpath-locators.html");
        driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("Software Testingo");

        //INDEX: helps in traversing through same elements like if dealing with a table
                //SYNTAX: //tag_name[@attribute = 'value']/tag_name[n]

        driver.navigate().to("https://softwaretestingo.blogspot.com/2020/08/xpath-locators.html");
        driver.findElement(By.xpath("//div/input[2][@id = 'fname']")).sendKeys("Holaa");








    }
}
