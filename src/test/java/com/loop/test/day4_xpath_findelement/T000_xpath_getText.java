package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T000_xpath_getText {
    public static void main(String[] args) throws InterruptedException {
      WebDriver driver =  WebDriverFactory.getDriver("chrome");
      driver.get("https://beta.docuport.app");
        WebElement forgetPasswordBottom = driver.findElement(By.xpath("//a[contains(text(),'Forgot password')]"));
        forgetPasswordBottom.click();
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(DocuportConstants.RESET_PASSWORD_URL)){
          System.out.println("TEST PASSED");
        }else {
          System.out.println("TEST FAILED");
        }
        WebElement writeMailBottom = driver.findElement(By.xpath("//div[@class='v-text-field__slot']/label/following-sibling::input"));

        writeMailBottom.click();
        Thread.sleep(300);
        writeMailBottom.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD_DOCUPORT);
        WebElement enterTheEmailText = driver.findElement(By.xpath("//div[contains(text(),'Enter the email address associated with your account')]"));
        String actualTextEnterMail = enterTheEmailText.getText();
        if (actualTextEnterMail.equalsIgnoreCase(DocuportConstants.RESET_PASSWORD_MESSAGE)){
          System.out.println("TEST PASSED");
        }else {
          System.out.println("TEST FAILED");
        }
        WebElement cancelBottom = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
      System.out.println("Cancel bottom is displayed ? " + cancelBottom.isDisplayed());

       WebElement sendBottom = driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
       sendBottom.click();
       Thread.sleep(3000);
       WebElement weHaveSendMailPlsCheckMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

       String messageToResetPassword = weHaveSendMailPlsCheckMessage.getText();
        System.out.println("messageToResetPassword = " + messageToResetPassword);



    }
}
