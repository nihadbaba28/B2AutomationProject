package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLocatorsPractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/registration_form.html");
        WebElement firstname = driver.findElement(By.className("form-control"));
        firstname.sendKeys("Loop");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Academy");

        // this will return us 3 elements, and always will click the first one,
        // that's why we should pay attention to locate unique elements
        WebElement gender = driver.findElement(By.xpath("//input[@value='female']"));
        gender.click();


    }
}
