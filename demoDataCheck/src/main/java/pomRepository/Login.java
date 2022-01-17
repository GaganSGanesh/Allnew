package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	//we have to create a constructor 
	public  Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "email")
	private WebElement emailbtn;
	
	@FindBy(name = "pass")
	private WebElement passbtn;
	
	@FindBy(name = "login")
	private WebElement loginbtn;

	public WebElement getEmailbtn() {
		return emailbtn;
	}

	public void setEmailbtn(WebElement emailbtn) {
		this.emailbtn = emailbtn;
	}

	public WebElement getPassbtn() {
		return passbtn;
	}

	public void setPassbtn(WebElement passbtn) {
		this.passbtn = passbtn;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
	
}