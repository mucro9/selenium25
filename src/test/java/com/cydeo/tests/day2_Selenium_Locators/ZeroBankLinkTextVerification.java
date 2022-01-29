package com.cydeo.tests.day2_Selenium_Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankLinkTextVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement topLeftText =  driver.findElement(By.className("brand"));

        String actual = topLeftText.getText();
        String expected = "Zero Bank";

        if (actual.equals(expected)){
            System.out.println("Top left text verification is passed");
        }else {
            System.out.println("Top left text verification is failed");
        }

       String hrefActual = "Actual = "+ topLeftText.getAttribute("href");
        String  hfrefExPECTED = "index.html";
        System.out.println(hrefActual);

        if (hrefActual.contains(hfrefExPECTED)){
            System.out.println("href is passed");
        }else {
            System.out.println("href is failed");
        }

        System.out.println(topLeftText.isDisplayed());









    }
}
