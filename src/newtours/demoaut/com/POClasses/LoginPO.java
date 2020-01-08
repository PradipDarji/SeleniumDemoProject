package newtours.demoaut.com.POClasses;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO {
	public WebDriver driver;
	public WebDriverWait wait;
	public FileReader reader;
	public Properties props;

	public LoginPO(WebDriver driver) throws Exception {
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
		reader = new FileReader("E:\\EclipseProjects\\SeleniumDemoProject\\System.properties");
		props = new Properties();
	}

	public By UserName = By.xpath("//input[@name='userName']");
	public By Password = By.xpath("//input[@name='password']");
	public By Submit = By.xpath("//input[@name='login']");
	public By Signoff = By.xpath("//a[contains(text(),'SIGN-OFF')]");

	public boolean enterUsernameandPassword() {
		try {
			WebElement user_name = wait.until(ExpectedConditions.visibilityOfElementLocated(UserName));
			WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
			props.load(reader);
			String uname = props.getProperty("UserName");
			String password = props.getProperty("Password");
			user_name.sendKeys(uname);
			pass.sendKeys(password);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean clickonLoginbutton() {
		try {
			WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated(Submit));
			Login.click();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public boolean verifyUserLoggedIn() {
		try {
			WebElement signoff = wait.until(ExpectedConditions.visibilityOfElementLocated(Signoff));
			if(signoff.isDisplayed()) {
				System.out.println("User successfully logged into the system.");
			}else {
				System.out.println("Oops!There is problem while doing sign in");
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

}
