package demoDataCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Fileutility;

public class MMT {
	@Test
	public void makemytrip() throws Throwable {

	Fileutility fiu=new Fileutility();
	String url=fiu.getProprtykeyValue("url");
	String browser=fiu.getProprtykeyValue("browser");
	WebDriver driver = null;
	if(browser.equals("chrome"))
	{
	driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	driver.findElement(By.xpath("//li[@data-cy='account']")).click();
	 WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
	 from.click();
	 driver.findElement(By.xpath("//p[contains(.,'Delhi, India')]")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).click();
	WebElement ele =driver.findElement(By.xpath("//p[contains(.,'Mumbai, India')]"));
	ele.click();
//	WebDriverWait wait=new WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.elementToBeClickable(to));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()",ele);
	driver.findElement(By.xpath("//a[contains(.,'Search')]")).click();
	
}
}
