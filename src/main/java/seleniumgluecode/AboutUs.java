package seleniumgluecode;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutUs extends Main
{

	@Given("^user on VE home page$")
	public void user_on_VE_home_page() throws Throwable {
	    URLSetup();
	}

	@When("^user clicks on About Us$")
	public void user_clicks_on_About_Us() throws Throwable {
		 Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id='cd-primary-nav' and @class='cd-primary-nav is-fixed']/li[1]/a")).click();
	}

	@Then("^user redirect to About Us page$")
	public void user_redirect_to_About_Us_page() throws Throwable {
	    
	}

	@Then("^clicks on About the Company$")
	public void clicks_on_About_the_Company() throws Throwable {
		 Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='ABOUT THE COMPANY - BALMER LAWRIE']")).click();	
	}

	@Then("^user able to see the details of the company$")
	public void user_able_to_see_the_details_of_the_company() throws Throwable {
	    
	}

	@Then("^clicks on About the Brand$")
	public void clicks_on_About_the_Brand() throws Throwable {
		 Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='ABOUT THE BRAND - VACATIONS EXOTICA']")).click();
		
	}

	@Then("^user able to see the details of the brand$")
	public void user_able_to_see_the_details_of_the_brand() throws Throwable {
	    
	}

	@Then("^clicks on Why VE$")
	public void clicks_on_Why_VE() throws Throwable {
		 Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='WHY VACATIONS EXOTICA']")).click();
		
	}

	@Then("^user able to see the details of Why VE$")
	public void user_able_to_see_the_details_of_Why_VE() throws Throwable {
	    
	}

	
}
