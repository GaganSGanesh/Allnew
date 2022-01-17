package com.facebook.automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Fileutility;
import pomRepository.Login;

public class ExistingUserLogin {
	@Test
	public void ExistingUserLogin() throws Throwable {
		Fileutility fis=new Fileutility();
		String url = fis.getProprtykeyValue("url");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Login log=new Login(driver);
		log.getEmailbtn().sendKeys("gagan");
		log.getPassbtn().sendKeys("1234567");
		log.getLoginbtn().click();
	}

}
