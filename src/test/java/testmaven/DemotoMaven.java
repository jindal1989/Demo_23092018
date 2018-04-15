package testmaven;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemotoMaven {
	
	//WebDriver driver;
	
	@Test
	public void hellomaven()
	{
		/*driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    WebElement id = driver.findElement(By.name("email"));
	    WebElement pass = driver.findElement(By.name("pass"));
	    id.sendKeys("ankush4love@gmail.com");
	    pass.sendKeys("jindal@1989");
		driver.findElement(By.id("loginbutton")).submit();
		driver.quit();*/
		
		System.out.println("Welcome to world of Maven");
		
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://learn-automation.com/");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
		
		
	}

}
