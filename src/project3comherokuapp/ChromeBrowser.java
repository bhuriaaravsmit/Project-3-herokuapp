package project3comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ChromeBrowser {
        public static void main(String[] args) throws InterruptedException{
            String baseurl = "http://the-internet.herokuapp.com/login";
//Setup the Chrome browser
            WebDriver driver = new ChromeDriver();
            // open the URL into Browser
            driver.get(baseurl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            Thread.sleep(5000);
            //Get the Title of the page
            driver.getTitle();
            String title = driver.getTitle();
            System.out.println("Page Title is " + title);
            //Get the current URL
            driver.getCurrentUrl();
            System.out.println("Current URL " + driver.getCurrentUrl());
            // Get Page Source
            System.out.println("Page Source : " + driver.getPageSource());
            //Find the Email field Element
            WebElement emailField = driver.findElement(By.id("username"));
            //Type the email address to the email field
            emailField.sendKeys("Shweta123@gmail.com");
            //Find the password and Type the Password to the password field
            driver.findElement(By.name("password")).sendKeys("1234");
            Thread.sleep(5000);
            driver.close();
        }
    }


