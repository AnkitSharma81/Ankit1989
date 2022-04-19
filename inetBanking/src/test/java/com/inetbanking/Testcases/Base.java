package com.inetbanking.Testcases;
import java.io.File;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.Readconfig;

public class Base {
	WebDriver  driver ;
	Readconfig C = new Readconfig();
	public String username = C.getname();
	public String password = C.pass();
    public Properties pro = new Properties();
	
   public static Logger logger;
	@BeforeClass
	void setup() throws FileNotFoundException{
	     
		File f =  new File(System.getProperty("user.dir")+"\\configuration\\objectrepo.properties");
		FileInputStream fio = new FileInputStream(f);
     System.setProperty("webdriver.chrome.driver","c:\\Users\\pallavi\\workspace\\inetBanking\\Driver\\chromedriver.exe" );
    driver= new ChromeDriver();
    driver.get("http://www.demo.guru99.com/V4/");
     driver.manage().window().maximize();
     logger = logger.getLogger("ebanking");
     PropertyConfigurator.configure("Log4j.properties");

          
	}
    ///  @AfterClass
    ///  public void End(){
    ////	  driver.close();
//}
      
      public void capturescreenshot(WebDriver driver2,String tname) throws IOException{
    	  TakesScreenshot scrShot =(TakesScreenshot)driver;
    	  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    	  File DestFile= new File("c:\\Users\\pallavi\\workspace\\inetBanking\\Screenshot\\tname.png");
    	  FileUtils.copyFile(SrcFile, DestFile);
    	  
      }
      
      public String randomestring()
  	{
  		String generatedstring=RandomStringUtils.randomAlphabetic(8);
  		return(generatedstring);
  	}
  	
  	public static String randomeNum() {
  		String generatedString2 = RandomStringUtils.randomNumeric(4);
  		return (generatedString2);
  	}
}