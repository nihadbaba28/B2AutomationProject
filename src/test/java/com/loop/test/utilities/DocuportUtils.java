package com.loop.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocuportUtils {
    /**
     * logins to the docuport application
     * @param driver, which initialized in the test base
     * @param role, comes from docuport constants
     * @author nihad
     */
    public static void login (WebDriver driver, String role){
        driver.get("https://beta.docuport.app/");
        WebElement UserName = driver.findElement(By.xpath("//label[.='Username or email']//following-sibling::input"));
        WebElement password = driver.findElement(By.xpath("//input[@type"));

    }
}
