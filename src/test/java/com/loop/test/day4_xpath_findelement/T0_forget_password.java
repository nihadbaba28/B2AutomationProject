package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T0_forget_password {
    /*
    verify forget password
    identify reset password heading using css and go from parent to child
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/login?redirect=%2F");
        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
//        String actualForgetPasswordText =  forgetPasswordLink.getText();
//        String expectedForgetPasswordText = "Forgot password?";
//        if (actualForgetPasswordText.contains(expectedForgetPasswordText)){
//            System.out.println("TEST PASSED");
//        }else {
//            System.out.println("FAILED");
//        }
        forgetPasswordLink.click();

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        System.out.println("Forget Password Heading = " + forgetPasswordHeading.getText());


    }
}
