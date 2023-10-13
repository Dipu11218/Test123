package BeTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {
	
	WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/delwarabegum/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
