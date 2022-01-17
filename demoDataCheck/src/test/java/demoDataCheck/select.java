package demoDataCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class select {
@Test
public void handler() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	driver.navigate().refresh();
	WebDriverWait wait=new WebDriverWait(driver, 3);
	WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("dropdown")));
	//WebElement element = driver.findElement(By.name("dropdown"));
	Select sel=new Select(element);
	sel.selectByIndex(1);
	driver.close();
	
	
	
}
}
