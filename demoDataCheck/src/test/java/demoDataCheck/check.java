package demoDataCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Fileutility;

public class check {
	public static void main(String[] args) throws Throwable {
		Fileutility futil=new Fileutility();
		String url=futil.getProprtykeyValue("url");
		String un=futil.getProprtykeyValue("username");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	
}

}
