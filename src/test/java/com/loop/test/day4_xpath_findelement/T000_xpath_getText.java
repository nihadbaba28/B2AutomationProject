package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T000_xpath_getText {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/login?redirect=%2F");
      WebElement forgetPassword = driver.findElement(By.xpath("//a[@href='/reset-password']"));
      forgetPassword.click();

      // validate URL contains: reset-password
        String actualURLForResetPassword = driver.getCurrentUrl();
        if (actualURLForResetPassword.contains(DocuportConstants.RESET_PASSWORD_URL)){
            System.out.println("Test Passed");
        } else {
            System.out.println("FAILED");
        }
        WebElement validateMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String actualValidatedMessage = validateMessage.getText();

        if (actualValidatedMessage.contains(DocuportConstants.RESET_PASSWORD_MESSAGE)){
            System.out.println("Test passed");
        }else {
            System.out.println("FAILED");
        }





    }
}