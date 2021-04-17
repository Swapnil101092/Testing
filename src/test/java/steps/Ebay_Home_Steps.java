package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_Home_Steps {

	WebDriver driver;

	public Ebay_Home_Steps(CommonSteps commonSteps) {
		this.driver=commonSteps.getDriver();		
	}

	@Given("I am on Ebay Home Page")
	public void i_am_on_Ebay_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am on Ebay Home Page");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}

	@When("I click on Advance Link")
	public void i_click_on_Advance_Link() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I click on Advance Link");
		driver.findElement(By.xpath("//a[@title='Advanced Search']")).click(); 
		Thread.sleep(5000);
	}

	@Then("I navigate to Advance Search Page")
	public void i_navigate_to_Advance_Search_Page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I navigate to Advance Search Page");
		String expectedUrl="https://www.ebay.com/sch/ebayadvsearch";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		if(!expectedUrl.equals(actualUrl))
		{
			fail("Page does not navigated to expected page...");
		}

	}

	@When("I Search For Iphone 11")
	public void i_Search_For_Iphone() {
		driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("iphone 11");
		driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).click();

	}

	@Then("I validate At Least 1000 Search Items Present")
	public void i_validate_At_Least_Search_Items_Present() {

		String itemCount=driver.findElement(By.xpath("(//h1[@class=\"srp-controls__count-heading\"]/span)[1]")).getText();
		int itemCountInt=Integer.parseInt(itemCount);
		if(!(itemCountInt>=50))
		{
			fail("Less Than 100 results found...");
		}
	}


}
