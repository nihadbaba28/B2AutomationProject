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

public class T4_dropdown_options {
    // Go to https://demoqa.com/select-menu
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
  //  @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void colorTest(){
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(3);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Yellow","Is not matching");
        dropdown.selectByValue("red");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Red");
        dropdown.selectByVisibleText("White");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"White");
    }
}
