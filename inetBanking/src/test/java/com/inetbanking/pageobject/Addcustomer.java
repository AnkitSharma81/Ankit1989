package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcustomer {
	
	WebDriver driver;
	public Addcustomer(WebDriver rdriver){
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="/html/body/div[3]/div/ul/li[2]/a")
	WebElement Customername;
	@FindBy(xpath="//input[@name='name']")
	WebElement txtcustomername;
	@FindBy(xpath="//input[@type='radio' and @Value='m' ]")
	WebElement valuem;
	@FindBy(xpath="//input[@type='radio' and @Value='f']")
	WebElement valuef;
	@FindBy(xpath="//input[@type='date' and @name='dob']")
	WebElement Dateofbirth;
	@FindBy(xpath="//textarea[ @name='addr']")
	WebElement Address;
	@FindBy(xpath="//input[ @name='city']")
	WebElement city;
	@FindBy(xpath="//input[ @name='state']")
	WebElement state;
	@FindBy(xpath="//input[ @name='pinno']")
	WebElement PIN;
	@FindBy(xpath="//input[ @name='telephoneno']")
	WebElement txttelephoneno;
	@FindBy(xpath="//input[ @name='emailid']")
	WebElement txtemailid;
	@FindBy(xpath="//input[ @name='password']")
		WebElement Password;
	@FindBy(xpath="//input[@value='Submit']")
	WebElement Submit;
	
	public void Addcustomername(){
		Customername.click();
		
	}
	
	public void Custname(String cname){
		txtcustomername.sendKeys(cname);
	}

	public void Addgendermale(String gen){
		valuem.click();
	}
	public void addgenderfemale(String fgen){
	valuef.click();
	}
	public void adddateofbirth(String mm, String dd, String yyyy ){
		Dateofbirth.sendKeys(mm);
		Dateofbirth.sendKeys(dd);
		Dateofbirth.sendKeys(yyyy);
	}
	public void getaddress(String addres){
		Address.sendKeys(addres);
	}
	
	public void getcity(String City){
		city.sendKeys(City);
	}
	
	public void addstate(String cState){
		state.sendKeys(cState);
	}
	
	public void getPin(String pinno){
		PIN.sendKeys(pinno);
	}
	
	public void  gettelephoneno(String ctelephoneno){
		txttelephoneno.sendKeys(ctelephoneno);
	}
	
	public void getemailid(String  cemailid){
		txtemailid.sendKeys(cemailid);
	}
	
	public void getpassword(String pass){
		Password.sendKeys(pass);
	}
	
	public void submit(){
		Submit.click();
	}
	
	
	
	
	
	
	
}

