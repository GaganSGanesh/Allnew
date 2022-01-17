package demoDataCheck;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Fileutility;

public class ScreenShot {
	@Test
	public void sshot() throws Throwable
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Fileutility fis=new Fileutility();
		String URL = fis.getProprtykeyValue("url");
		driver.get(URL);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("D:\\shot.jpeg");
		FileUtils.copyFile(src, dst);//for fileutils add dependency of commons.io in pom.xml file  
	driver.close();
	}

}
