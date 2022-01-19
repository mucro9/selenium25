package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyVerifyTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
        String actualOutput =  driver.getTitle();
        String expectedOutput = "Wooden spoon | Etsy";

        if (actualOutput.equals(expectedOutput)){
            System.out.println("Etsy verify title passed");
        }else {
            System.out.println("Etsy verify title failed");
        }


    }
}
