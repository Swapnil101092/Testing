package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_AdvancedSearch {

	WebDriver driver;

	public Ebay_AdvancedSearch(CommonSteps commonSteps) {

		this.driver=commonSteps.getDriver();
	}

	@Given("I am Ebay Advanced Serach Page")
	public void i_am_Ebay_Advanced_Serach_Page() {
		driver.get("https://www.ebay.com/sch/ebayadvsearch/");
		driver.manage().window().maximize();
	}

	@When("I click on Ebay Logo")
	public void i_click_on_Ebay_Logo() 
	{
		driver.findElement(By.xpath("//a[@href=\"https://www.ebay.com/\"]")).click();
	}

	@Then("I Am Navigated to Ebay Home Page")
	public void i_Am_Navigated_to_Ebay_Home_Page() 
	{
		String expectedUrl="https://www.ebay.com/";
		String actualUrl=driver.getCurrentUrl();
		if(!expectedUrl.equals(actualUrl))
		{
			fail("Page does not navigate to home page");
		}

	}


}
