package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	@FindBy(name="email")
	WebElement userid; 
	@FindBy(name="pass")
	WebElement password;
	@FindBy(xpath = "//*[@aria-label='Log In']")
	WebElement LoginButton;
	@FindBy(linkText = "Forgot account?")
	WebElement forgot;
	@FindBy(name="firstname")
	WebElement Firstname;
	@FindBy(name="lastname")
	WebElement Lastname;
	//create method for each element
	
	public Homepage(WebDriver driver) { // Override the constructor (Page Constructor)
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void EmailidField(String email) {
		userid.sendKeys(email);
	}
	public void PasswordField(String pass) {
		password.sendKeys(pass);
	}
	public void LoginBT() {
		LoginButton.click();
	}
	public void ForgotPass() {
		forgot.click();
	}
	public void FirstName(String firstname) {
		Firstname.sendKeys(firstname);
	}
	public void LastName(String lastname) {
		Lastname.sendKeys(lastname);
	}
	public void clearEmail() {
		userid.clear();
	}
}
