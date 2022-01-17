package demoDataCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyCheck {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.close();
		}
}