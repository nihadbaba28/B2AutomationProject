package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T1_findElements {
    /*
    1- Open a chrome browser
    2- Go to: https://www.nba.com
    3- Locate all the links in the page
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.nba.com");
        List<WebElement> nbaLinks = driver.findElements(By.tagName("a"));
        System.out.println("nbaLinks.size() = " + nbaLinks.size());
        List<WebElement> nbaLinks2 = driver.findElements(By.xpath("//a"));
        for(WebElement nbaLink : nbaLinks){
            if (!nbaLink.getText().equalsIgnoreCase("")){
            System.out.println("nbaLink.getText() = " + nbaLink.getText());
            System.out.println("nbaLink = " + nbaLink.getAttribute("href"));
        }

    }
}}
