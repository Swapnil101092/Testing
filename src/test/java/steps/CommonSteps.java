package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {

	WebDriver driver;
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Webdrivers/chromedriver.exe");
		driver= new ChromeDriver();	
	}
	@After
	public void tesrDown() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(1000);
	}

	public WebDriver getDriver()
	{
		return driver;
	}

}
