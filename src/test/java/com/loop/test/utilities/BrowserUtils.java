package com.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils  {
    /**
     * validate if driver switched to expected URL and TITLE
     * @param driver
     * @param expectedURL
     * @param expectedTitle
     * @author nihad
     * implements assertion
     */
    public static void switchWindowAndValidate(WebDriver driver, String expectedURL, String expectedTitle){
        expectedTitle = expectedTitle.toLowerCase();
        expectedURL = expectedURL.toLowerCase();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String each:windowHandles){
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedURL)){
                break;
            }
        }
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }
}
