package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoVerify {
    public static void main(String[] args) {
        //set up the webdriver manager
        WebDriverManager.chromedriver().setup();
        //set up the just webdriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";
        if (actualTitle.equals(expectedTitle)){
            System.out.println(" Title Verification Test is passed");
        }else {
            System.out.println(" Title Verification Test is failed");
        }
       String actualURL =  driver.getCurrentUrl();
        String expectedURL = "cydeo";
          if (actualURL.contains(expectedURL)){
              System.out.println("Url verification is passed");
          }else {
              System.out.println("Url verification is failed");
          }

    }
}
