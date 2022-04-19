package com.inetbanking.Testcases;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.Login;

import junit.framework.Assert;
 
@Test
public class Tc_001 extends Base {
     public void Login() throws IOException, InterruptedException{
    	 logger.info("URL is opened");
	Login obj = new Login(driver);
	 obj.setusername("mngr260013");
	 logger.info("Enter username");
	 obj.setPassword("mAjabeh");
	 logger.info("Enter password");
	 obj.clickbutton();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
	if (driver.getTitle().equals("Guru99 Bank Manager HomePage")){
		Assert.assertTrue(true);
		logger.info("login passed");
	}
	else{
		capturescreenshot(driver,"Tc_001");
		Assert.assertFalse(false);
		logger.info("Login failed");
	}
	
	
	
}

	
}