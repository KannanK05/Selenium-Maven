package testRunnerQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------Start Testing--------");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("------Start Testing--------");
		driver.quit();
		System.out.println("------End Testing--------");

	}

}
