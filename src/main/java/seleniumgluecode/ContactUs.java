package seleniumgluecode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs extends Main
{
	@Given("^user is on Vacation Exotica homepage$")
	public void user_is_on_Vacation_Exotica_homepage() throws InterruptedException
	{
		URLSetup();
	}
	
	@When("^user clicks on hamburge icon$")
	public void user_clicks_on_hamburge_icon() throws InterruptedException 
	{
		
		
		driver.findElement(By.xpath("//ul[@class='cd-header-buttons']/li[2]//a")).click();
		
	}
	@When("^user clicks on Contact Us link$")
	public void user_clicks_on_Contact_Us_link() throws Throwable
	{
		
		driver.get("https://www.vacationsexotica.com/contact-us");
		driver.manage().window();
	}
	@When("^user clicks on GET IN TOUCH button$")
	public void user_clicks_on_GET_IN_TOUCH_button() throws Throwable 
	{
		
		 WebElement elementmaster=driver.findElement(By.xpath("//a[text()='get in touch']"));
		 JavascriptExecutor executormaster = (JavascriptExecutor) driver;
		 executormaster.executeScript("arguments[0].click();", elementmaster);
	     //driver.findElement(By.xpath("//a[text()='get in touch']")).click();		
	}
	
	
	@Then("^user enters name as \"(.*)\" and enters emailid as \"(.*)\" and enters Mobile as \"(.*)\"  and enters city as \"(.*)\"$")
	public void user_enters_name_as_and_enetrs_emailid_as_and_enters_Mobile_as_and_enetrs__city_as(String name, String emailid, String Mobile, String city)
	{
	    driver.findElement(By.xpath("//form[@id='contact-form']/div[1]//input")).sendKeys(name);
	    driver.findElement(By.xpath("//form[@id='contact-form']/div[2]//input")).sendKeys(emailid);
	    driver.findElement(By.xpath("//form[@id='contact-form']/div[3]//input")).sendKeys(Mobile);
	    driver.findElement(By.xpath("//form[@id='contact-form']/div[4]//input")).sendKeys(city);
	    
	}
	

	
	@Then("^user clicks on  SUBMIT button$")
	public void user_clicks_on_Submit_button()
	{
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	
	@Then("^user close the browser$")
	public void user_close_the_browser() 
	{
		driver.close();
	}



}
