package com.loop.test.day05_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

// go to https://demoqa.com/select-menu

public class T4_multi_dropdown {
    WebDriver driver;

    @BeforeMethod
        public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }

    @Test
    public void testMultiDropdown() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        Assert.assertTrue(dropdown.isMultiple());
//        dropdown.selectByIndex(0);
//        Thread.sleep(3000);
//        dropdown.selectByIndex(1);
//        Thread.sleep(3000);
//        dropdown.selectByIndex(2);
        List<WebElement> options = new ArrayList<>();
        options = dropdown.getOptions();
        for(WebElement each: options){
            System.out.println(each.getText());
        }
        options.forEach(each ->
            System.out.println(each.getText()));
        //dropdown.deselectAll();


    }}


