package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login  {
	
	WebDriver ldriver;
	public Login (WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@type='text']")
    WebElement txtuserName;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	@FindBy(xpath= "//input[@type='submit']")
     WebElement Login;
	
	public void setusername(String name){
		txtuserName.sendKeys("mngr260013");
	}	
		public void setPassword(String pwd){
			password.sendKeys("mAjabeh");
		}
		
	 public void clickbutton(){
			submit.click();
}
	  public void End(){
		  Login.click();
	  }
}
