package demoDataCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoSignup2 {
	@Test
	public void singup(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
	 WebElement firstname = driver.findElement(By.name("firstname"));
	 JavascriptExecutor executor=(JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click", firstname);
	 firstname.sendKeys("gagan");
//	WebDriverWait wait=new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("gagan");
	}

}
