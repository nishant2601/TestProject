package ccTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ccPageObjects.LoginPageObjects;

public class LoginTest {
	
	WebDriver driver = null;
	
	public static void main(String[] args) {
		loginToApplication();
	}
	
	public static void loginToApplication() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.salesforce.com/");
		
		LoginPageObjects loginPage = new LoginPageObjects(driver);
		
		loginPage.setTextInUserName("demo@acedemo.com.qademo");
		loginPage.setTextInPassword("OrgforIndiaQA123");
		loginPage.clickLoginButton();
	}
}

