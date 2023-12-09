package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        //setup driver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate to google
        driver.get("https://Google.com");
        driver.manage().window().maximize();

//        // locate the element
       WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
       WebElement searchBoxWithName = driver.findElement(By.name("q"));
       WebElement aboutLink = driver.findElement(By.linkText("About"));

       String testToSearch = "Loop Academy";
       searchBoxWithID.sendKeys(testToSearch);
       searchBoxWithID.clear();
       searchBoxWithID.sendKeys(testToSearch + Keys.ENTER);



    }
}
