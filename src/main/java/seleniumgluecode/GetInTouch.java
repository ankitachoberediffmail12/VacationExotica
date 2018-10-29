package seleniumgluecode;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetInTouch extends Main
{
	
	@Given("^Vacation Exotica home page$")
	public void Vacation_Exotica_home_page() throws Throwable {
		URLSetup();
	}

	@When("^user clicks on Quick Enquiry icon$")
	public void user_clicks_on_Quick_Enquiry_icon() throws Throwable {
		driver.findElement(By.xpath("//a[@class='floating-enquiry-btn form-popup' and @href='#popup-enquiry-form']")).click();
	}

	@When("^enters name as \"(.*?)\" And enters emailid as \"(.*?)\" And enters Mobile as \"(.*?)\"  and enters city as \"(.*?)\" And enters destination as \"(.*?)\" And enters add\\. req\\. as \"(.*?)\" and select permissions$")
	public void enters_name_as_And_enters_emailid_as_And_enters_Mobile_as_and_enters_city_as_And_enters_destination_as_And_enters_add_req_as_and_select_permissions(String name, String email, String mobile, String city, String dest, String addreq) throws Throwable {
formdata("//input[@id='name' and @name='Name']", name, 
		"//input[@id='email' and @name='email']", email, 
		"//input[@id='mobile' and @name='mobile']", mobile, 
		"//input[@id='city' and @name='city']", city, 
		"//input[@id='destination' and @name='destination']", dest, 
		"//textarea[@name='add_desc' and @id='add_desc']", addreq);
		/*driver.findElement(By.xpath("//input[@id='name' and @name='Name']")).sendKeys(name);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys(email);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='mobile' and @name='mobile']")).sendKeys(mobile);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='city' and @name='city']")).sendKeys(city);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='destination' and @name='destination']")).sendKeys(dest);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//textarea[@name='add_desc' and @id='add_desc']")).sendKeys(addreq);
		 Thread.sleep(2000);*/
		 driver.findElement(By.xpath("//input[@name='tnc' and @type='checkbox']")).click();
	}

	@Then("^@validatemobilenumber$")
	public void validatemobilenumber() throws Throwable {
	    
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='submit-btn' and @type='submit']")).click();
	}

	@When("^user enters mobile number and click on Send OTP button$")
	public void user_enters_mobile_number_and_click_on_Send_OTP_button() throws Throwable {
	   driver.findElement(By.xpath("//a[text()='Send OTP']")).click();
	   driver.findElement(By.xpath("//button[@type='button' and text()='OK']")).click();
	}

	@Then("^user enters OTP and verify OTP by clicking on Verify OTP button$")
	public void user_enters_OTP_and_verify_OTP_by_clicking_on_Verify_OTP_button() throws Throwable {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='Verify OTP']")).click();
	}
	
}
