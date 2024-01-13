package com.loop.test.day05_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class T0_radioButton {
    /*
    https://demoqa.com/radio-button
    wait implicitly 10 seconds
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");
        // wait the whole page loads - selenium 3
       //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // wait whole page loads - selenium 4
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement radioRed = driver.findElement(By.xpath("//input[@id='red']"));
        System.out.println(radioRed.isSelected() + " before selected");
        radioRed.click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(7000);
        System.out.println(radioRed.isSelected() + ": after selected");
        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));
       // radioNo.click();
        System.out.println("green is enabled: " + green.isEnabled());
        System.out.println("radioRed is enabled: " + radioRed.isEnabled());

    }}
