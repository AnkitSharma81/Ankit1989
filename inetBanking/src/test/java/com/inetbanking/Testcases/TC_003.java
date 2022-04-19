package com.inetbanking.Testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.Addcustomer;
import com.inetbanking.pageobject.Login;

public class TC_003 extends Base {
	
	
	@Test
	public void addcustomer() throws InterruptedException{
		
	Login l = new Login(driver);
	l.setusername("mngr257716");
	l.setPassword("agEnetU");
	l.End();
	
	Addcustomer cust= new Addcustomer(driver);
	
	cust.Addcustomername();
	cust.Custname("Sakshi");
	cust.addgenderfemale("female");
	cust.Addgendermale("male");
	cust.adddateofbirth("10", "12", "2012");
	cust.getaddress("India");
	cust.getcity("New Delhi");
	cust.addstate("Delhi");
	cust.getPin("110085");
	cust.gettelephoneno("987890091");
	String ran= randomestring()+"gmail.com";
	cust.getemailid("xyzsd@gmail.com");
	cust.getpassword("XYZ@123");
	cust.submit();
	
	Thread .sleep(3000);
	
	boolean result =  driver.getPageSource().contains("Customer registered succesfully");
	
	if(result==true){
		Assert.assertTrue(true);
	}
	else{
		Assert.assertFalse(false);
	}
}
    	public String randomestring(){
    		String generatedstring=RandomStringUtils.randomAlphabetic(8);
    		return generatedstring;
    	}
    	
    	public static String randomeNum() {
    		String generatedString2 = RandomStringUtils.randomNumeric(2);
    		return (generatedString2);
    	}
	
}