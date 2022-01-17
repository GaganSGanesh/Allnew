package demoDataCheck;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://workspace.jaim.tech/");
		driver.findElement(By.xpath("//span[@style='padding: 10px 10px 10px 0px; font-weight: 500;']")).click();
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		all.remove(parent);
		
		for (String allwin:all)
		{
			driver.switchTo().window(allwin);
			driver.findElement(By.xpath("")).sendKeys();
			
			
		}
	}

}
