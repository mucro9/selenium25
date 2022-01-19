package com.cydeo.tests.day1_Selenium_Intro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification{
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
       String actual =  driver.findElement(By.tagName("h3")).getText();
       String expected = "Log in to ZeroBank";

       if (actual.equals(expected)){
           System.out.println("Zero bank passed");
       }else {
           System.out.println("Zero bank failed");
       }


    }
}
