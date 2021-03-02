package ccPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	WebDriver driver = null;
	
	//Object Locators
	By txtUserName = By.id("username");
	By txtPassword = By.id("password");
	By btnLogin = By.id("Login");
	By chkRememberMyInfo = By.id("rememberUn");
	By Forgotpasswordlink = By.id("forgot_password_link");
	By mydomainLink = By.id("mydomainLink");
	By imgLogo = By.id("logo");
	
	//Constructor
	public  LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	//Action Methods
	public void setTextInUserName(String username) {
		driver.findElement(txtUserName).sendKeys(username);
	}
	
	public void setTextInPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(btnLogin).click();
	}
	
	public void chkRememberMyInfo() {
		driver.findElement(chkRememberMyInfo).click();
	}
	
	public void clickForgotpasswordlink() {
		driver.findElement(Forgotpasswordlink).click();
	}
	
	public void clickMydomainLink() {
		driver.findElement(mydomainLink).click();
	}
}
