package com.loop.test.day05_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_testNG_with_selenium {
    // set up chrome and create driver
    // go to google.com
    // Assert; title is Google
    WebDriver driver;
    String expected;
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
    public void googleTitle(){
        driver.get("https://www.google.com/");
        System.out.println("( (RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Google";
        actual = driver.getTitle();
        Assert.assertEquals(expected,actual,"actual doesn't match expected ");
    }
    @Test
    public void docuportTitle(){
        driver.get("https://beta.docuport.app/");
        expected = "Docuport";
        actual = driver.getTitle();
        Assert.assertTrue(actual.contains(expected),"Actual does not contains expected");
    }
}
