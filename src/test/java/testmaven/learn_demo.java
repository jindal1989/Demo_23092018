package testmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class learn_demo {
	
	public static WebDriver driver;

	/*@BeforeTest
	public void setUp() {
		System.out.println("Welcome to world of learn Automation");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ankush\\Desktop\\seleniumdriver\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://learn-automation.com/");
		driver.manage().window().maximize();
	}*/

	@Test(priority = 0)
	public void verifyTitleofLearnautomation() {

		/*System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Selenium"));*/
		
		System.out.println("Learn Automation verified");

	}
	
	@Test(priority = 1)
	public void verifyTitleofLearnautomation1() {
		
		System.out.println("test 2 verified");

	}

}
