package demoDataCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class drpdown {
@Test
public void demo() throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/reg/");
WebElement day = driver.findElement(By.name("birthday_day"));
Select s=new Select(day);
s.selectByValue("1");
WebElement month = driver.findElement(By.name("birthday_month"));
s=new Select(month);//every time you have to load particular webelement in select Class
s.selectByVisibleText("May");
WebElement year = driver.findElement(By.name("birthday_year"));
s=new Select(year);
s.selectByValue("1995");
driver.findElement(By.xpath("//label[contains(.,'Male')]")).click();
Thread.sleep(3000);

driver.close();
}
}