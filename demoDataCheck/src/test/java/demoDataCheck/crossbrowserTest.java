package demoDataCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.facebook.automate.baseclass;

import Generic.Fileutility;

public class crossbrowserTest extends baseclass {
	@Test
	public void mainmethod(String Browser) throws Throwable {
		WebDriver driver=null;
		Fileutility fis=new Fileutility();
		String url=fis.getProprtykeyValue("url");
		//String browser=fis.getProprtykeyValue("browser");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("chrome");
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("firefox");
		}
		
		fis.getProprtykeyValue(url);
		Thread.sleep(3000);
		driver.close();
	}

}
