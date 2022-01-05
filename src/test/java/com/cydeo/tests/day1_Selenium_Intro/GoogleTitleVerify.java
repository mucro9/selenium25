package com.cydeo.tests.day1_Selenium_Intro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerify {
    public static void main(String[] args) {
        //1- Set up the driver
        WebDriverManager.chromedriver().setup();
        //2- Create instance of the driver
        WebDriver driver = new ChromeDriver(); //it opens the browser
        driver.get("https://www.google.com");
        String  actualOutput = driver.getTitle();
        String expectedOutput = "Google";

        if (actualOutput.equals(expectedOutput)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        driver.close();








    }
}
