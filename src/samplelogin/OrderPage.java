package samplelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderPage {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kchan\\Documents\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();

	driver.quit();
	
	}

}
