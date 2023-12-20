package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("https://beta.docuport.app");
        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_FOR_CLIENT );
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();
        WebElement errorMessageForEmptyPassword = driver.findElement(By.className("v-messages__message"));
       // Thread.sleep(3000);
        String actualResult = errorMessageForEmptyPassword.getText();
        System.out.println(actualResult);
        if (actualResult.equalsIgnoreCase(DocuportConstants.ERROR_MESSAGE_PASSWORD_DOCUPORT_LOGIN)){
            System.out.println("TEST PASSED");
        }else {
            System.err.println("TEST FAILED");
        }
        driver.quit();



    }
}
