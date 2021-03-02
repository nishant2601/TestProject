package ccTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ccPageObjects.LoginPageObjects;

public class LoginTest_TestNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setup() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//drivers//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://test.salesforce.com/");
	}
	
	@Test
	public void loginToApplication() {
		LoginPageObjects loginPage = new LoginPageObjects(driver);
		
		loginPage.setTextInUserName("demo@acedemo.com.qademo");
		loginPage.setTextInPassword("OrgforIndiaQA123");
		loginPage.clickLoginButton();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Login Test Case Run Successfully");
	}
}

