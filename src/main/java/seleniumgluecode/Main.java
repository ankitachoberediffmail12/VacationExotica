package seleniumgluecode;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
	
	 public static WebDriver driver;
	 Properties prop = new Properties();
	 static WebElement e=null;
	 static WebElement elements=null;
	
	//method of URL setup
		public void URLSetup()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://www.vacationsexotica.com/");
			driver.manage().window().maximize();
		}
		
public void formdata(String namexpath,String name, String emailxpath, String email, String mobilexpath, String mobile, String cityxpath, String city, String destxpath, String dest, String addreqxpath, String addreq) throws Throwable {
	driver.findElement(By.xpath(namexpath)).sendKeys(name);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(emailxpath)).sendKeys(email);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(mobilexpath)).sendKeys(mobile);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(cityxpath)).sendKeys(city);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(destxpath)).sendKeys(dest);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(addreqxpath)).sendKeys(addreq);
	 Thread.sleep(2000);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
