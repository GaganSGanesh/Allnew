package demoDataCheck;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dent {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://workspace.jaim.tech/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@style='padding: 10px 10px 10px 0px; font-weight: 500;']")).click();
		String parentID=driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		allwin.remove(parentID);
		
		for (String allwindows:allwin )
		{
		driver.switchTo().window(allwindows);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("toothsitesting@gmail.com");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//div[@class='VfPpkd-Jh9lGc']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;//to solve"ElementClickInterceptedException" we went to JSE
		executor.executeScript("arguments[0].click();", element);//element was overlapped by anither element so "ECI"exception
//	WebDriverWait wait=new WebDriverWait(driver, 30);-->Did not worked --went for JSE
//	wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Toothsi@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
	}
}
}