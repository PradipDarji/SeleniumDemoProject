package newtours.demoaut.com.POClasses;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPO {

	public WebDriver driver;
	public WebDriverWait wait;
	public String s1, s2, s3;
	FileWriter fr;
	Properties props;

	public RegisterPO(WebDriver driver) throws Exception {
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
		fr = new FileWriter("E:\\EclipseProjects\\SeleniumDemoProject\\System.properties");
		props = new Properties();
	}

	public By Register = By.xpath("//a[contains(text(),'REGISTER')]");
	public By FirstName = By.xpath("//input[@name='firstName']");
	public By LastName = By.xpath("//input[@name='lastName']");
	public By Phone = By.xpath("//input[@name='phone']");
	public By Email = By.xpath("//input[@name='userName']");
	public By Address1 = By.xpath("//input[@name='address1']");
	public By Address2 = By.xpath("//input[@name='address2']");
	public By City = By.xpath("//input[@name='city']");
	public By State = By.xpath("//input[@name='state']");
	public By PostalCode = By.xpath("//input[@name='postalCode']");
	public By Country = By.xpath("//select[@name='country']");
	public By userName = By.xpath("//input[@name='email']");
	public By Password = By.xpath("//input[@name='password']");
	public By ConfirmPassword = By.xpath("//input[@name='confirmPassword']");
	public By Submit = By.xpath("//input[@name='register']");
	public By VerifyUserName = By.xpath("//b[contains(text(),' Note: Your user name is')]");
	public By Sign_In = By.xpath("//a[contains(text(),' sign-in ')]");

	public boolean clickOnRegister() {
		try {
			WebElement register = wait.until(ExpectedConditions.visibilityOfElementLocated(Register));
			register.click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterFirstName() {
		try {
			WebElement fName = wait.until(ExpectedConditions.visibilityOfElementLocated(FirstName));
			fName.sendKeys("Pradip");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterLastName() {
		try {
			WebElement lName = wait.until(ExpectedConditions.visibilityOfElementLocated(LastName));
			lName.sendKeys("shukla");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterPhone() {
		try {
			WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(Phone));
			Random random = new Random();
			int k = random.nextInt(1000000000);
			String j = String.valueOf(k);
			phone.sendKeys(j);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterEmail() {
		try {
			WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
			email.sendKeys("pradip@mailinator.com");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterAddress1() {
		try {
			WebElement Add1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Address1));
			Add1.sendKeys("123 main street");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterAddress2() {
		try {
			WebElement Add2 = wait.until(ExpectedConditions.visibilityOfElementLocated(Address2));
			Add2.sendKeys("Nehru Road");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterCity() {
		try {
			WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(City));
			city.sendKeys("Ahmedabad");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterState() {
		try {
			WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(State));
			state.sendKeys("Gujarat");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterPostalCode() {
		try {
			WebElement pCode = wait.until(ExpectedConditions.visibilityOfElementLocated(PostalCode));
			pCode.sendKeys("12345");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean selectCountry() {
		try {
			WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(Country));
			Select india = new Select(country);
			india.selectByVisibleText("INDIA");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterUserName() {
		try {
			WebElement uname = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
			Random random = new Random();
			int k = random.nextInt(1000000000);
			uname.sendKeys("ShuklaP" + k);
			s1 = uname.getAttribute("value");
			System.out.println(s1);
			props.setProperty("UserName", s1);
			props.store(fr, "create By pradip");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterPassword() {
		try {
			WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
			password.sendKeys("12345");
			s2 = password.getAttribute("value");
			System.out.println(s2);
			props.setProperty("Password", s2);
			props.store(fr, "create By pradip");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean enterConfirmPassword() {
		try {
			WebElement cpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPassword));
			cpassword.sendKeys("12345");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean clickOnSubmit() {
		try {
			WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(Submit));
			submit.click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean verifyUsername() {
		try {
			WebElement verifyuserName = wait.until(ExpectedConditions.visibilityOfElementLocated(VerifyUserName));
			s3 = verifyuserName.getText();
			if (s3.contains(s1)) {
				System.out.println("Note: Your user name is " + s1 + ".");
			} else {
				System.out.println("Your user name is not matched");
			}
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

	public boolean clickOnSignIn() {
		try {
			WebElement signin = wait.until(ExpectedConditions.visibilityOfElementLocated(Sign_In));
			signin.click();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;
		}
	}

}
