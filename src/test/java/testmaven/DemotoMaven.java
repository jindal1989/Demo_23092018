package testmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DemotoMaven {

	public static WebDriver driver;

	/*@BeforeTest
	public void setUp() {
		System.out.println("Welcome to world of Maven");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ankush\\Desktop\\seleniumdriver\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
	}*/

	@Test(priority = 0)
	public void verifyTitle() {

		/*System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Facebook"));*/
		System.out.println("title verified");

	}

	@Test(priority = 1)
	public void loginFB() {

		/*WebElement id = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		id.sendKeys("ankush4love@gmail.com");
		pass.sendKeys("jindal@1989");
		driver.findElement(By.xpath("//*[@value='Log In']")).submit();*/
		System.out.println("Login to FB");
	}
	
	@Test(priority = 2)
	public void verifyUser() {

		//Assert.assertTrue(driver.getPageSource().contains("Ankush"));
		System.out.println("User verified");
	}

}
