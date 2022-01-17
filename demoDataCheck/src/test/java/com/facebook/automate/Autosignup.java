package com.facebook.automate;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic.Fileutility;
import Generic.excelUtility;
import Generic.javautility;
import pomRepository.signUp;

public class Autosignup extends baseclass{
	@Test 
	public void signup()  throws Throwable {
		
		
		try {//Fileutility fis=new Fileutility();
		excelUtility eutil=new excelUtility();
		javautility jav=new javautility();
		String name=eutil.getData("Sheet1",1,0)+jav.getrandomnumber();
		String lastname=eutil.getData("Sheet1",1,1)+jav.getrandomnumber();
		String email=eutil.getData("Sheet1",1,2)+jav.getrandomnumber()+"@gmail.com";
		String password="G"+jav.getRanpassword();
		//String url=fis.getProprtykeyValue("url");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(url);
		logger.info("entered url");
		//step:Create Object of the Pomclass that you want to use first
			signUp up=new signUp(driver);
			
			up.getCreateaccountbutton().click();
			up.getFirstTF().sendKeys(name);
			logger.info("entered FN");
			up.getLastnameTF().sendKeys(lastname);
			logger.info("entered LN");
			up.getReg_email__TF().sendKeys(email);
			logger.info("entered Email");
			//up.getReg_email_confirmation__().sendKeys(email);
			up.getReg_passwd__TF().sendKeys(password);
			logger.info("entered pwd");
			WebElement day = up.getBirthday_day();
			Select select=new Select(day);
			select.selectByValue("1");
			WebElement month = up.getBirthday_month();
			select=new Select(month);
			select.selectByVisibleText("May");
			WebElement year = up.getBirthday_year();
			select=new Select(year);
			select.selectByValue("1995");
			logger.info("entered birth");
			up.getRadiobutton().click();
			up.getSignupbutton().click();
			logger.info("clicked signup");
			
				
			} catch (Exception e) {
				System.out.println("notworking");
				driver.close();
			}
			
		}
	
	}
