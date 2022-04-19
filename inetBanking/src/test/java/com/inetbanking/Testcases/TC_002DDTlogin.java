package com.inetbanking.Testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.Login;
import com.inetbanking.utilities.Xlutils;

import junit.framework.Assert;

public class TC_002DDTlogin extends Base {
	
@Test(dataProvider="loginda")	
public void loginDDT(){
	Login lp =  new Login(driver);
	lp.setusername("username");
	lp.setPassword("password");
	lp.clickbutton();
		if(isalert() ==true){
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}
		
		else{
			Assert.assertTrue(true);
			lp.End();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
}
	
 public boolean isalert(){
	 try{
	 driver.switchTo().alert();
	 return true;
 }
    catch(NoAlertPresentException e){
    	return false;
    }
 }


@DataProvider(name = "loginda")
 String[][] getData() throws IOException{
	 String path = "C:\\Users\\Pallavi\\workspace\\inetBanking\\src\\test\\java\\com\\inetbanking\\testdata\\Logindata.xl.xlsx";
	 int rownum = Xlutils.getRowCount(path, "sheet1");
	 int COnum =Xlutils.getCellCount(path, "sheet1", 1);
	 String loginda[][] = new String[rownum][COnum];
	 for(int i=1;i<=rownum;i++){
		 for(int j=0;j<rownum;j++){
			 loginda[i-1][j] = Xlutils.getCellData(path, "sheet1", i,j);
			 
			 
		 }
		 
	 }
	 return loginda;
 }
	

}
