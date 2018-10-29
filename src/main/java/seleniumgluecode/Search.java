package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 
{
public static WebDriver driver;
	
	@Given("^user is on Vacation Exotica home page$")
	public void user_is_on_Vacation_Exotica_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Akshaya\\eclipse\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.vacationsexotica.com/");
		driver.manage().window().maximize();
	}

	@When("^user clicks on search icon$")
	public void user_clicks_on_search_icon() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cd-search-trigger']")).click();
		
	}

	@When("^enters valid search as \"(.*?)\"$")
	public void enters_valid_search_as(String searchname) throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='s' and @name='s']")).sendKeys(searchname);
	}

	@When("^press enter button$")
	public void press_enter_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='s' and @name='s']")).sendKeys(Keys.ENTER);
	}

	@Then("^user able to see data related to entered search$")
	public void user_able_to_see_data_related_to_entered_search() throws Throwable {
	    
	}


}
