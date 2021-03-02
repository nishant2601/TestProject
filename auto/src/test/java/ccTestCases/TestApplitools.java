package ccTestCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class TestApplitools {

	public static void main(String[] args) throws IOException {	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "//drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://applitools.com/helloworld/?diff1");

		Eyes eyes = new Eyes();

		// Initialize the eyes SDK and set your private API key.
		eyes.setApiKey("UXemckqCrfqPvuyXlqZU102ApqUAti6111BhGa3IPunS10s110");

		// Start the test with a viewport size of 800x600.
		eyes.open(driver, "Tier1", "Test2", new RectangleSize(800, 600));

		//driver.get("https://applitools.com/helloworld/");
		eyes.checkWindow("Hello!");

		// End visual UI testing.
		eyes.close();
		eyes.abortIfNotClosed();
		driver.close();
		driver.quit();
	}
}
