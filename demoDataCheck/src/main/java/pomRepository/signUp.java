package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUp {
	public signUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(.,'Create New Account')]")
	private WebElement Createaccountbutton;
	public WebElement getCreateaccountbutton() {
		return Createaccountbutton;
	}
	public void setCreateaccountbutton(WebElement createaccountbutton) {
		Createaccountbutton = createaccountbutton;
	}
	@FindBy(name = "firstname")
	private WebElement firstTF;
	@FindBy(name = "lastname")
	private WebElement lastnameTF;
	@FindBy(name = "reg_email__")
	private WebElement reg_email__TF;
	@FindBy(name = "reg_passwd__")
	private WebElement reg_passwd__TF;
	@FindBy(name = "reg_email_confirmation__")
	private WebElement reg_email_confirmation__;
	public WebElement getReg_email_confirmation__() {
		return reg_email_confirmation__;
	}
	public void setReg_email_confirmation__(WebElement reg_email_confirmation__) {
		this.reg_email_confirmation__ = reg_email_confirmation__;
	}
	@FindBy(name = "birthday_day")
	private WebElement birthday_day;
	@FindBy(name = "birthday_month")
	private WebElement birthday_month;
	@FindBy(name = "birthday_year")
	private WebElement birthday_year;
	@FindBy(xpath = "//label[contains(.,'Male')]")
	private WebElement radiobutton;
	@FindBy(xpath = "//button[contains(.,'Sign Up')]")
	private WebElement signupbutton;
	public WebElement getFirstTF() {
		return firstTF;
	}
	public void setFirstTF(WebElement firstTF) {
		this.firstTF = firstTF;
	}
	public WebElement getLastnameTF() {
		return lastnameTF;
	}
	public void setLastnameTF(WebElement lastnameTF) {
		this.lastnameTF = lastnameTF;
	}
	public WebElement getReg_email__TF() {
		return reg_email__TF;
	}
	public void setReg_email__TF(WebElement reg_email__TF) {
		this.reg_email__TF = reg_email__TF;
	}
	public WebElement getReg_passwd__TF() {
		return reg_passwd__TF;
	}
	public void setReg_passwd__TF(WebElement reg_passwd__TF) {
		this.reg_passwd__TF = reg_passwd__TF;
	}
	public WebElement getBirthday_day() {
		return birthday_day;
	}
	public void setBirthday_day(WebElement birthday_day) {
		this.birthday_day = birthday_day;
	}
	public WebElement getBirthday_month() {
		return birthday_month;
	}
	public void setBirthday_month(WebElement birthday_month) {
		this.birthday_month = birthday_month;
	}
	public WebElement getBirthday_year() {
		return birthday_year;
	}
	public void setBirthday_year(WebElement birthday_year) {
		this.birthday_year = birthday_year;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}
	public WebElement getSignupbutton() {
		return signupbutton;
	}
	public void setSignupbutton(WebElement signupbutton) {
		this.signupbutton = signupbutton;
	}
	
}
