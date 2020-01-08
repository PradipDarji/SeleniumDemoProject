package BaseClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	public WebDriver driver;

	/*
	 * public BaseTest() {
	 * 
	 * }
	 */

	@BeforeTest
	public void setSystemProperty() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
	}

	@Test
	public void startBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

	@AfterTest
	public void tearBrowser() {
		driver.quit();
	}

}
