package com.cydeo.tests.day2_Selenium_Locators;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonVerification {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/multiple_buttons");
        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));
        button2.click();
        //<button class="btn btn-primary" onclick="button2()" name="button2">Button 2</button>
        //Never forget double slash while creating a xpath.
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        WebElement resultPage = driver.findElement(By.xpath("//p[@id = 'result']"));

        String actualText = resultPage.getText();
        String expectedText = "Clicked on button two!";

        if (actualText.equals(expectedText)){
            System.out.println("Button2 verification is passed!");
        }else {
            System.out.println("Button2 verification is failed");
        }

    }
}
