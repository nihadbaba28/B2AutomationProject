package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;

public class T00_login_docuport extends TestBase {
 @Test
 public void test_login_logOut_docuport () throws InterruptedException {
  DocuportUtilities.login(driver, DocuportConstants.CLIENT);
  DocuportUtilities.logout(driver);
 }


 }

