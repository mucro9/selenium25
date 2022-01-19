package com.cydeo.tests.day1_Selenium_Intro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgot_Pass_URL_Verifiication {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement inputBox = driver.findElement(By.name("email"));
        System.out.println(inputBox.isDisplayed());
        inputBox.sendKeys("jabbar@mucromucro.com");

        driver.findElement(By.id("form_submit")).click();

        String expectedURL= "Your e-mail's been sent!";
        String actualAutput = driver.findElement(By.tagName("h4")).getText();

        if (expectedURL.equals(actualAutput)){
            System.out.println("Forgot password verify passed");
        }else {
            System.out.println("Forgot password verify failed");
        }

        //Getcurrenturl resturn the url as string






    }
}
