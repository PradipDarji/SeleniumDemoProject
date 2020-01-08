package newtours.demoaut.com.JavaClasses;

import static org.testng.Assert.assertEquals;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClasses.BaseTest;
import newtours.demoaut.com.POClasses.RegisterPO;

public class RegisterClass extends BaseTest {

	public static final Logger log = Logger.getLogger(RegisterClass.class.getName());;

	public RegisterClass() {

	}

	public RegisterClass(WebDriver driver) {
		this.driver = driver;
	}

	@Test
	public void verifyUserRegistrationfunctinality() throws Exception {
		RegisterPO registerpo = new RegisterPO(driver);
		assertEquals(registerpo.clickOnRegister(), true, "User able to click on 'Register' button");
		log.info("User Should redirect on registration page.");
		assertEquals(registerpo.enterFirstName(), true, "User able to enter firstname");
		log.info("System allowed to user enter his/her firstname");
		assertEquals(registerpo.enterLastName(), true, "User able to enter lastname");
		log.info("System allowed to user enter his/her lastname");
		assertEquals(registerpo.enterPhone(), true, "User able to enter phone");
		log.info("System allowed to user enter his/her phone");
		assertEquals(registerpo.enterEmail(), true, "User able to enter email");
		log.info("System allowed to user enter his/her email");
		assertEquals(registerpo.enterAddress1(), true, "User able to enter address1");
		log.info("System allowed to user enter his/her address1");
		assertEquals(registerpo.enterAddress2(), true, "User able to enter address2");
		log.info("System allowed to user enter his/her address2");
		assertEquals(registerpo.enterCity(), true, "User able to enter city");
		log.info("System allowed to user enter his/her city");
		assertEquals(registerpo.enterState(), true, "User able to enter state");
		log.info("System allowed to user enter his/her state");
		assertEquals(registerpo.enterPostalCode(), true, "User able to enter pincode");
		log.info("System allowed to user enter his/her pincode");
		assertEquals(registerpo.selectCountry(), true, "User able to enter country");
		log.info("System allowed to user enter his/her country");
		assertEquals(registerpo.enterUserName(), true, "User able to enter username");
		log.info("System allowed to user enter his/her username");
		assertEquals(registerpo.enterPassword(), true, "User able to enter password");
		log.info("System allowed to user enter his/her password");
		assertEquals(registerpo.enterConfirmPassword(), true, "User able to enter confirm password");
		log.info("System allowed to user enter his/her confirm password");
		assertEquals(registerpo.clickOnSubmit(), true, "User able to click on 'Submit' button");
		log.info("System should display success message");
		assertEquals(registerpo.verifyUsername(), true, "User able to see his/her user name with success message.");
		log.info("System should display success message with their username.");
		assertEquals(registerpo.clickOnSignIn(), true, "User able to click on 'Sign-in' button");
		log.info("User Should redirect on login page.");

	}

}
