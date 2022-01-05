package com.cydeo.tests.day1_Selenium_Intro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1- Set up the driver
        WebDriverManager.chromedriver().setup();
        //2- Create instance of the driver
        WebDriver driver = new ChromeDriver();// opens the browser
        //3- Use the driver instance to test selenium
         driver.get("https://www.cydeo.com");
        //  get() accepts  a string as a parameter
        String title = driver.getTitle();
        //It gets the tittle of the driver
        String currentUrl = driver.getCurrentUrl();

        Thread.sleep(2000);//throw Exception

        driver.navigate().back();

        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();



        //driver.close(); closes the last opened of the browser
        //driver.quit();  closes all of them




        







    }
}
