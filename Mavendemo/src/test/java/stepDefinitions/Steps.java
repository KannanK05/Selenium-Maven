package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Steps {
	WebDriver driver;
	@Given("^I want to open google home page$")
	public void i_want_to_open_google_home_page() throws Throwable {
		System.out.println("------Start Testing--------");
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("------First Maven test Testing--------");
		driver.quit();
		System.out.println("------End Testing--------");
	    
	}

}
