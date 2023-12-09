package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {


    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("https://loopcamp.vercel.app/registration_form.html");
        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();

        if(actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", matched actual header: \"" + actualHeaderForForm + "=> TEST PASSED");
        }else {
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", does not matched actual header: \"" + actualHeaderForForm + "=> TEST FAILED");

        }
        WebElement userNamePlaceHolder = driver.findElement(By.name("username"));
        String actualNamePlaceHolder = userNamePlaceHolder.getAttribute("placeholder");
        System.out.println(actualNamePlaceHolder);


}}
