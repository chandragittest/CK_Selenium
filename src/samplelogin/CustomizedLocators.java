package samplelogin;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v95.browser.Browser;

public class CustomizedLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kchan\\Documents\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	boolean result = false;
		
		//Using xpath locators
		
		/*
		 * driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		 * driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("test123");
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */
		
		//Using css selector locators -1 (using tag and id)
		/*
		 * driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");  //#email
		 * driver.findElement(By.cssSelector("input#pass")).sendKeys("test123");	//#pass 
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */
		
		/*
		 * //Using css selector locators -1 (using tag and class)
		 * driver.findElement(By.cssSelector("input.inputtext")).sendKeys(
		 * "abc@gmail.com");
		 * 
		 * driver.findElement(By.cssSelector("input.pass")).sendKeys("test123");
		 * 
		 * 
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */
		
		//Using css selector  - tag and attribute 
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("abc@gmail.com");  //#email
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("test123");	//#pass 
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//Using contains method
		//WebElement invalidcredentialsTitlePage = driver.findElement(By.xpath("//*[contains(text(), 'To helps keep your account safe, we temporarily locked it. Before you try logging in again, check your login info and')]"));
		WebElement invalidTitlePage = driver.findElement((By.xpath("//*[contains(text(), 'logs in right now')]")));
		
		if(invalidTitlePage.isDisplayed())
		{
			result = true;
		}
		//else
			result=false;
		
		/*
		 * public boolean isPageExists() { try {
		 * 
		 * return (invalidcredentialsTitlePage.isDisplayed()); } catch(Exception e) {
		 * return(false); } }
		 */		
		
	// result = true;
		
		if(result==true)
		System.out.println("Test case is passed");
		if(result==false)
		System.out.println("Test case is failed");
	
	
		driver.close();
		
		driver.quit();
		
			
		
		
			
		
	}

}
