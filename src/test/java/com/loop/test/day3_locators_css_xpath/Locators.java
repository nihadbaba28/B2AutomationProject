package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManager.chromedriver().setup();
      //  WebDriver driver = new ChromeDriver();
        WebDriver driver =WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        // locate the element
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        //aboutLink.click(); ---> click to selected element

        String text = "Loop Academy";
        searchBoxWithID.clear();  // ---> make sure the selected element (search) is empty
        searchBoxWithID.sendKeys(text + Keys.ENTER);
//        WebElement searchBottomWithName = driver.findElement(By.name("btnK"));
//        Thread.sleep(300);
//        searchBottomWithName.click();
        String actualURL = driver.getCurrentUrl();

        Thread.sleep(3000);
        if (actualURL.contains("Loop")){
            System.out.println("Actual URL :" + actualURL + " contains \"Loop\" TEST PASSED");}
        else {
            System.out.println("TEST FAILED");
        }
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Loop Academy - Google Search")){
            System.out.println("Actual title " + actualTitle + " contains \"Loop Academy - Google Search\" => TEST PASSED");

        }else {
            System.out.println("TEST FAILED");
        }






    }
}