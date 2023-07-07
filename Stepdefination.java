package org.test.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.*;

public class Stepdefination {
	
	WebDriver driver;
	
	@Given("Launch chrome browser")
	public void Launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver();
		driver= new ChromeDriver(option);
		
		
		
	}
      
	@Then("Open youtube application URL")
	public void Open_youtube_Application() {
		driver.get("https://www.youtube.com/");
	}
}
