package com.cydeo.tests.day2_Selenium_Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Log in";
        System.out.println(actualTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("ZeroBank title verification is Passed");
        }else {
            System.out.println("Zero bank title verification is failed");
        }





    }
}
