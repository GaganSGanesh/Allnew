package com.facebook.automate;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Generic.Fileutility;
import Generic.excelUtility;

public class baseclass {
	
	
	WebDriver driver;
	
	public static Logger logger;
	@Parameters("Browser")
	@BeforeTest
	public void setup(String Browser) throws Throwable {
		Fileutility fis=new Fileutility();
		String baseurl=fis.getProprtykeyValue("url");
		excelUtility eutil=new excelUtility();
		logger=Logger.getLogger("baseclass");
		PropertyConfigurator.configure("Log4j2.properties");
		driver=new ChromeDriver();
		if (Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("chrome");
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("firefox");
		}
		
	driver.get(baseurl);	
		
	}
	@AfterClass
	public void closure() {
		driver.close();
	}
	}
