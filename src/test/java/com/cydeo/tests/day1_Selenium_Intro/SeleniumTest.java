package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1- Set up the driver
        WebDriverManager.chromedriver().setup();
        //2- Create instance of the driver
        WebDriver driver = new ChromeDriver();
        //3- Use the driver instance to test selenium
         driver.get("https://www.cydeo.com");
        //  get() accepts  a string as a parameter
        String title = driver.getTitle();
        //It gets the tittle of the driver
        String currentUrl = driver.getCurrentUrl();

        System.out.println(currentUrl);







    }
}
