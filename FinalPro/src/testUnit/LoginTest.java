package testUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Controller.Controller;

class LoginTest {

	@Test
	public void loginWhenUserIsEmpty() {
		Controller controller = new Controller();
		try {
			controller.userLogin(" ", "123");
			Assertions.fail("Login finished successfully but it should fail because ID is empty");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Username or password must not be null", e.getMessage());
		}
		
	}
	
	@Test
	public void loginWhenPassIsEmpty() {
		Controller controller = new Controller();
		try {
			controller.userLogin("123", " ");
			Assertions.fail("Login finished successfully but it should fail because the password is empty");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Username or password must not be null", e.getMessage());
		}
		
	}
	

}
