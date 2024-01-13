package com.loop.test.day05_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T3_simple_dropdown {
    // http://the-internet.herokuapp.com/dropdown
    WebDriver driver;
    String expected = "Please select an option";
    String actual;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void dropDownTest(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // create our Dropdown
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(dropdownElement);
        actual = dropdown.getFirstSelectedOption().getText();
        Assert.assertTrue(actual.contains(expected),"actual does not contains expected");

    }

}
