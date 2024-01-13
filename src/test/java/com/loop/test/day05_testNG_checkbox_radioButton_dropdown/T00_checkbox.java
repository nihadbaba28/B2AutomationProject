package com.loop.test.day05_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T00_checkbox {
    /*
    1. Go to https://the-internet.herokuapp.com/checkboxes
    2. Confirm checkbox #1 is NOT selected by default
    3. Confirm checkbox #2 is SELECTED by default
    4. Click checkbox #1 to select it
    5. Click checkbox #2 to deselect it
    6. Confirm checkbox #1 is SELECTED
    7. Confirm checkbox #2 is NOT selected
     */
    public static void main(String[] args) {
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/checkboxes");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement checkbox1 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(.,' checkbox 1')]/preceding-sibling::input"));
        if(!checkbox1.isSelected()){
            System.out.println("Checkbox1 Is not selected by default");
        }else {
            System.out.println("Is selected");
        }
        checkbox1.click();
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        WebElement checkbox2 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(.,' checkbox 1')]/following-sibling::input"));
        if (checkbox2.isSelected()){
            System.out.println("Checkbox2 is selected by default");
        }
        checkbox2.click();
        if(!checkbox2.isSelected()){
            System.out.println("Is not selected");
        }



    }
}
