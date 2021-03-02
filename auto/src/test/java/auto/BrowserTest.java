package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		
		//System.setProperty("webdriver.gecko.driver", projectPath + "//drivers//geckodriver//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj57Z291YvuAhXIyzgGHXgBD0wQPAgI");
		
		//System.setProperty("webdriver.chrome.driver", projectPath + "//drivers//chromedriver//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj57Z291YvuAhXIyzgGHXgBD0wQPAgI");
		
		System.setProperty("webdriver.ie.driver", projectPath + "//drivers//iexplorer//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj57Z291YvuAhXIyzgGHXgBD0wQPAgI");
		driver.close();
	}
}
