package newtours.demoaut.com.JavaClasses;

import static org.testng.Assert.assertEquals;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClasses.BaseTest;
import newtours.demoaut.com.POClasses.LoginPO;

public class LoginClass extends BaseTest {

	public static final Logger log = Logger.getLogger(LoginClass.class.getName());

	public LoginClass() {

	}

	public LoginClass(WebDriver driver) {
		this.driver = driver;
	}

	@Test
	public void verifyLoginfunctionality() throws Exception {
		RegisterClass RPO = new RegisterClass(driver);
		RPO.verifyUserRegistrationfunctinality();
		LoginPO LP = new LoginPO(driver);
		assertEquals(LP.enterUsernameandPassword(), true, "User able to enter his/her username and password");
		log.info("User has been entered his/her username and password successfully");
		assertEquals(LP.clickonLoginbutton(), true, "User able to click on 'Submit' button");
		log.info("User redirect on flight booking page.");
		assertEquals(LP.verifyUserLoggedIn(), true, "User should able to see 'Sign-off' option after login.");
		log.info("System display sign off button once user logged into the system.");
	}

}
