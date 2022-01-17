package com.facebook.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic_DdtHardcode {
	WebDriver driver;
	@BeforeTest
	public void prereq()
	{}
	@Test(dataProvider="logindata")
	public void signup(String username,String password)
	{
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	@DataProvider(name="logindata")
	public String [] [] getdata() {
		String loginData [] [] = {
				{"tysonemperor@gmail.com","9035569475"},
				{"abcd@gmail.com","password"},
				{"abcd@gmail.com","password"}
		}; 
		return loginData;
	}
	@AfterClass
	public void finish() {
		//driver.close();
	}
}
