package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class T1_alerts extends TestBase {
@Test
    public void informationAlert(){
    driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
    WebElement clickForJSAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
    clickForJSAlert.click();


    Alert alert = driver.switchTo().alert();
    alert.accept();
    assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(),"You successfully clicked an alert","It's not matching");
}

@Test
    public void confirmationAlerts(){
    driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
    WebElement confirmationButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
    confirmationButton.click();
    Alert alert = driver.switchTo().alert();
    alert.accept();
   WebElement successMessage = driver.findElement(By.xpath("//p[@id='result']"));
   String actualMessage = successMessage.getText();
   String expectedMessage = "You clicked: Ok";

    if (successMessage.isDisplayed()){
        System.out.println("Actual message is displayed");
    };
    confirmationButton.click();
    alert.dismiss();
    WebElement actualDismissMessage = driver.findElement(By.xpath("//p[@id='result']"));
    String actualDismissResult = actualDismissMessage.getText();
    assertTrue(actualDismissResult.contains("You clicked: Cancel"));
    assertTrue(actualDismissMessage.isDisplayed());

}
@Test
    public void promptAlerts(){
    driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
    WebElement promptJSButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
    promptJSButton.click();
    Alert alert = driver.switchTo().alert();
    alert.sendKeys("Loop Academy");
    alert.accept();
    WebElement resultElement = driver.findElement(By.xpath("//p[@id='result']"));
    String actualResultMessage = resultElement.getText();
    String expectedMessage = "You entered: Loop Academy";
    assertTrue(resultElement.isDisplayed());

}
}
