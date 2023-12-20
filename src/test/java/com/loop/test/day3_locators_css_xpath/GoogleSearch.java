package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
       // setup the driver
        WebDriverManager.chromedriver().setup();

         // create driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google
      //  driver.navigate().to("https://www.google.com");
        driver.get("https://www.google.com");

        //maximize the window
        driver.manage().window().maximize();

        String expectedTitle = "Google";
       String actualTitle= driver.getTitle();
       if(actualTitle.contains(expectedTitle)){
           System.out.println("Actual title: " + actualTitle + ", matches excepted title: " + expectedTitle + ", => TEST PASS");
       } else {
           System.err.println("Actual title: " + actualTitle +  " does not matched expected title: " + expectedTitle );
       }
      // driver.close();

       String expectedURL = "https://www.google.com";
       String currentURL;
        currentURL = driver.getCurrentUrl();
        if (currentURL.contains(expectedURL)){
           System.out.println("Expected URL: " + expectedURL + " is matching with actual URL: " + currentURL);
       } else {
           System.out.println("FAILED");
       }


    }
}
