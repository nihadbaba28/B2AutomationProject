package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.LoopCampConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {
    /*
    go to url: https://loopcamp.vercel.app/registration_form.html
    verify header text expected: Registration form
    verify placeholder attribute value expected: username
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/registration_form.html");
        WebElement actualHeaderForFrom = driver.findElement(By.tagName("h2"));
        String actualHeader = actualHeaderForFrom.getText();
        if (actualHeader.equalsIgnoreCase(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("TEST PASSED");
        }else {
            System.err.println("TEST FAILED");
        }
        WebElement placeHolderForUsername = driver.findElement(By.name("username"));
        String actualAttributeForPlaceHolder = placeHolderForUsername.getAttribute("placeholder");
        placeHolderForUsername.getAttribute("Nihad");
        System.out.println(actualAttributeForPlaceHolder);
      if (actualAttributeForPlaceHolder.equalsIgnoreCase(LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME)){
          System.out.println("TEST PASSED");
      }else {
          System.out.println("TEST FAILED");
      }


    }





    }

//        WebDriver driver = new ChromeDriver();
//        WebElement actualHeaderText = driver.findElement(By.linkText("Registration form"));
//      String actualHeader =  actualHeaderText.getText();
//        String expectedHeaderText = "Registration form";
//        if (expectedHeaderText.equalsIgnoreCase(actualHeader)){
//            System.out.println("Expected header text: " + expectedHeaderText + " is matching with actual header text: " + actualHeaderText + ", TEST PASSED");
//        }else {
//            System.err.println("TEST FAILED");
//        }
//
//        WebElement actualPlaceHolder = driver.findElement(By.name("username"));
//       String actualPlace = actualPlaceHolder.getAttribute("name");
//
//        String expectedPlaceHolder = "username";
//        if (expectedPlaceHolder.equalsIgnoreCase(actualPlace)){
//            System.out.println("TEST PASSED");
//        }else {
//            System.out.println("TEST FAILED");
//        }
