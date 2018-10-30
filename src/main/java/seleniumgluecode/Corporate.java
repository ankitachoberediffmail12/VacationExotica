package seleniumgluecode;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Corporate extends Main{

		@Given("^user is on homepage$")
		public void user_is_on_homepage() throws InterruptedException {
			URLSetup();
		}
		
		@When("^user clicks on corporate button on homepage$")
		public void user_clicks_on_corporate_button_on_homepage() throws InterruptedException {
			
			//driver.findElement(By.xpath("//li[@class='has-children two-child']/following::li[1]")).click();
			driver.findElement(By.xpath("//*[@class='cd-primary-nav is-fixed']/li[4]/a")).click();
					
		}
		
		@Then("^user enters company as \"(.*)\" and name as \"(.*)\" and mobile as \"(.*)\" and emailid as \"(.*)\" and city as \"(.*)\"$")
		public void user_enters_company_as_and_name_as_and_mobile_as_and_emailid_as_and_city_as(String companyname, String name, String mobile, String email, String city){
		    driver.findElement(By.xpath("//*[@id='corporate_form']//input[@id='company_name']")).sendKeys(companyname);
		    driver.findElement(By.xpath("//*[@id='corporate_form']//input[@id='name']")).sendKeys(name);
		    driver.findElement(By.xpath("//*[@id='corporate_form']//input[@id='mobile']")).sendKeys(mobile);
		    driver.findElement(By.xpath("//*[@id='corporate_form']//input[@id='email']")).sendKeys(email);
		    driver.findElement(By.xpath("//*[@id='corporate_form']//input[@id='city']")).sendKeys(city);
		}
		
		@Then("^user selects occasion$")
		public void user_selects_occasion() {
			driver.findElement(By.xpath("//*[@id='corporate_form']//label[2]")).click();
		}
		
		@Then("^user clicks on submit button$")
		public void user_clicks_on_submit_button(){
			driver.findElement(By.xpath("//*//*[@id='corporate_form']//*[@id='submit-btn']")).click();
		}
		
		@Then("^user clicks on OK button on error popup$")
		public void user_clicks_on_OK_button_on_error_popup() {
			
			driver.findElement(By.xpath("//*[@class='swal2-buttonswrapper']//button[contains(text(),'OK')]")).click();
		}
		
		@Then("^close the browser$")
		public void close_the_browser() {
			
		}



}
