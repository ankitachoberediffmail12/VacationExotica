package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonalisedForm extends Main 
{
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	   URLSetup();
	}

	@When("^user is on personalised form$")
	public void user_is_on_personalised_form() throws Throwable {
	    driver.get("https://www.vacationsexotica.com/personalised");
	}

	@When("^name as \"([^\"]*)\" And enters emailid as \"([^\"]*)\" And enters Mobile as \"([^\"]*)\"  and enters city as \"([^\"]*)\" And enters destination as \"([^\"]*)\" And enters add\\. req\\. as \"([^\"]*)\" and select permissions$")
	public void name_as_And_enters_emailid_as_And_enters_Mobile_as_and_enters_city_as_And_enters_destination_as_And_enters_add_req_as_and_select_permissions(String name, String email, String mobile, String city, String dest, String addreq) throws Throwable {
		 Thread.sleep(2000);
		formdata("//input[@id='name' and @name='name']", name, 
				"//input[@id='email' and @name='email']", email, 
				"//input[@id='mobile' and @name='mobile']", mobile, 
				"//input[@id='city' and @name='city']", city, 
				"//input[@id='destination' and @name='destination']", dest, 
				"//textarea[@name='add_desc' and @id='add_desc']", addreq);
				driver.findElement(By.xpath("//input[@name='tnc' and @type='checkbox']")).click();
				driver.findElement(By.xpath("//input[@name='tnc' and @type='checkbox']")).click();
	}

	@Then("^click submit button$")
	public void click_submit_button() throws Throwable {
		
	}

	@When("^enters mobile number and click on Send OTP button$")
	public void enters_mobile_number_and_click_on_Send_OTP_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Send OTP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button' and @class='swal2-confirm swal2-styled']")).click();
	}

	@Then("^enters OTP and verify OTP by clicking on Verify OTP button$")
	public void enters_OTP_and_verify_OTP_by_clicking_on_Verify_OTP_button() throws Throwable {
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[text()='Verify OTP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button' and @class='swal2-confirm swal2-styled']")).click();
	}

}
