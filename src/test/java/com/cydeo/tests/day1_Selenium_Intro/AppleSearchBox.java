package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleSearchBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+Keys.ENTER);

        String expectedTitle = "apple";
        String acutalTitle = driver.getTitle();

        if (acutalTitle.startsWith(expectedTitle)){ // startsWith, contains, equals
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


    }
}
