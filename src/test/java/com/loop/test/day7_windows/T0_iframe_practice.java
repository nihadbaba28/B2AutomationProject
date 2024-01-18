package com.loop.test.day7_windows;
import com.loop.test.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T0_iframe_practice extends TestBase {
    /*
    Go to "https://loopcamp.vercel.app/nested-frames.html"
    Validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"
     */
  @Test
    public void leftAndMiddle(){
    driver.get("https://loopcamp.vercel.app/nested-frames.html");
    WebElement frameFirst  = driver.findElement(By.xpath("//frame[@src='frame_top.html']"));
    driver.switchTo().frame(frameFirst);
    driver.switchTo().frame("frame-left");
    WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
    Assert.assertEquals(left.getText(),"LEFT","Not matched");
    driver.switchTo().parentFrame();
    driver.switchTo().frame("frame-middle");
    Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'MIDDLE')]")).getText(),"MIDDLE");




    }

}
