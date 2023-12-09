package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_css {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverFactory.getDriver("chrome");
      //  driver.get(By.ByCssSelector);
        driver.get("https://beta.docuport.app");
        WebElement lego ;

    }
}
