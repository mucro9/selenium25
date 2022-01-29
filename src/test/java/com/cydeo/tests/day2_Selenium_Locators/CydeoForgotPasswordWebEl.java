package com.cydeo.tests.day2_Selenium_Locators;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CydeoForgotPasswordWebEl {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement home = driver.findElement(By.xpath("//a[@class ='nav-link']"));
        WebElement forgotPassword = driver.findElement(By.xpath("//div[@class = 'example']/h2"));
        WebElement eMailText = driver.findElement(By.xpath("//label[@for ='email']"));
        WebElement eMailInputBox = driver.findElement(By.xpath("//input[@type = 'text']"));
        WebElement retrievePassword = driver.findElement(By.xpath("//button[@id = 'form_submit']"));

        WebElement[] list = {home,forgotPassword,eMailText,eMailInputBox,retrievePassword};

        for (WebElement each : list) {
            if (each.isDisplayed()){
                System.out.println("true");
            }else {
                System.out.println("false");
            }



        }
    }
}
