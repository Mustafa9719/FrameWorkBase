package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLoginJunit {
	static WebDriver driver;

	@BeforeClass
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@Before
	public void getMillisecond() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
	}
	@Test
	public void txtUserName() {
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("MohamedMustafa97");
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("Mustafa97");
		WebElement element2 = driver.findElement(By.id("login"));
		element2.click();
	}
	@After
	public void getMillisecond1() {
		long currentTimeMillis1 = System.currentTimeMillis();
		System.out.println(currentTimeMillis1);
	}
	@AfterClass
	public static void closeWin() {
		driver.quit();
	}
}
