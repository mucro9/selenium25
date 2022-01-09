package com.cydeo.tests.day1_Selenium_Intro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
       WebElement  Gmail =  driver.findElement(By.linkText("Gmail"));
       //Looks through the texts of the links on the page and resturns the matching link as a web element
       //This locator ONLY works for locating links
        // When we inspect, if we see the tag is <a> then it is a link.
        //We must pass the text of the link
       Gmail.click();




    }
}
