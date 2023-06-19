package project3comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


    public class MultiBrowser {
        static String browser = "Edge";
        static String baseurl = "http://the-internet.herokuapp.com/login";
        static WebDriver driver;
        public static void main(String[] args) throws InterruptedException{

            if (browser.equalsIgnoreCase("FireFox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("wrong browser name");
            }

            String baseurl = "http://the-internet.herokuapp.com/login";
            //Get the Title of the pagedriver.
            driver.get(baseurl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            String title = driver.getTitle();
            System.out.println("Page Title is " + title);
            //Get the current URL
            driver.getCurrentUrl();
            System.out.println("Current URL " + driver.getCurrentUrl());
            // Get Page Source
            System.out.println("Page Source : " + driver.getPageSource());
            ///Find the Email field Element
            WebElement emailField = driver.findElement(By.id("username"));
            //Type the email address to the email field
            emailField.sendKeys("Shweta123@gmail.com");
            //Find the password and Type the Password to the password field
            driver.findElement(By.name("password")).sendKeys("1234");
            Thread.sleep(5000);
            driver.close();
        }
    }



