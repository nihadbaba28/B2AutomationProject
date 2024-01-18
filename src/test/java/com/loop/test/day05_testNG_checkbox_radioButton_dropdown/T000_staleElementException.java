package com.loop.test.day05_testNG_checkbox_radioButton_dropdown;

//import com.loop.test.utilities.Driver;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
1. Open Chrome Browser
2. Go to http://the-internet.herokuapp.com/add_remove_elements/
 */
public class T000_staleElementException {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement addElement = driver.findElement(By.xpath("//button[contains(.,'Add Element')]"));
        addElement.click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(.,'Delete')]"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete button is displayed");
        };
        deleteButton.click();

       try {
           deleteButton.isDisplayed();
       } catch (StaleElementReferenceException s){
           System.out.println("Exception handled");
           System.out.println("Element is not displayed any more");
       }

    }
}
