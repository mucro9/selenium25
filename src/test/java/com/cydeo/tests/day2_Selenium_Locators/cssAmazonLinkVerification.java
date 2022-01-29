package com.cydeo.tests.day2_Selenium_Locators;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssAmazonLinkVerification {
    public static void main(String[] args) {
     WebDriver driver = WebDriverFactory.getDriver("chrome");
     driver.get("https://www.amazon.com");

        WebElement  searchBox = driver.findElement(By.cssSelector("input[id = 'twotabsearchtextbox']"));
        searchBox.sendKeys("search term"+ Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "search term";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Amazon verification is passed");
        }else {
            System.out.println("Amazon verification is failed");
        }
              //button [@class = 'btn btn-primary']









    }
}
