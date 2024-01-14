package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T2_iframe extends TestBase {
    // Go to: https://loopcamp.vercel.app/iframe.html

    @Test
    public void iframeTest(){
        driver.get("https://loopcamp.vercel.app/iframe.html");
        // if we find the element directly it will not work. First we need locate iframe itself
        //There are three ways to locate iframe.With id or name value, with index, with WebElement
         //First we gonna use WebElement
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        // then we need switch to frame
        driver.switchTo().frame(iframe);
       //There another way to locate iframe
       // driver.switchTo().frame(0);   ---> with index (starts from 0)
        //driver.switchTo().frame("mce_0_ifr"); ---> with id attribute value, it also can be with name attribute value

        WebElement textMessage = driver.findElement(By.xpath("//body[@id='tinymce']"));
        textMessage.clear();
        textMessage.sendKeys("Loop Academy");
        Assert.assertTrue(driver.findElement(By.xpath("//body[@id='tinymce']")).isDisplayed());

        // for now we are in the inside iframe. if we want to go out of the iframe we need use the methods i used below
       // driver.switchTo().defaultContent(); ---> that method switch driver to the default (first) iframe
        driver.switchTo().parentFrame(); // ---> that method helps to switch one iframe back, to parent of current iframe
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(.,'An iFrame containing the TinyMCE WYSIWYG Editor')]")).isDisplayed());


    }
    @Test
    public void amazon(){
        driver.get("https://www.amazon.com");
        List<WebElement> iframe = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframe = " + iframe.size());
    }
}
