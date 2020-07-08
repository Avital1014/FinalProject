package testUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controller.Controller;
import Model.UserRepositoryImple;
import Model.customer;

class LoginTest {

	@BeforeEach
	public void notifyForAllStart() {
		System.out.println("Tests are running now");
	}
	
	@AfterEach
	public void notifyForAllFinish() {
		System.out.println("Tests Finished");
	}
	 
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
	
	@Test
	public void signUpEmptyField() {
		UserRepositoryImple userRepositoryImple = new UserRepositoryImple();
		try {
			customer user = null;
			userRepositoryImple.addNewUser(user);
			Assertions.fail("User must enter the required fields");
		} catch (Exception e) {
			Assertions.assertEquals("User must have a value", e.getMessage());
		}
	}
	@Test
	public void findNameID() {
		UserRepositoryImple userRepositoryImple = new UserRepositoryImple();
		try {
			
			userRepositoryImple.findNameById(" ");
			Assertions.fail("Name is incorrect");
		} catch (Exception e) {
			Assertions.assertEquals("Name none avilabile", e.getMessage());
		}
	}
	
}
