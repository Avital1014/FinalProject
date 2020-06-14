package Controller;

import javax.swing.text.View;

import Model.MarkoliaUser;
import Model.Model;
import Model.UserRepositoryImple;
import View.MarkoliaMainView;
import View.SignUpView;


public class Controller {
	boolean addUserResult;
	@SuppressWarnings("unused")
	private Model model = new Model();
	
	private UserRepositoryImple userRep = new UserRepositoryImple(); 
	
	
	public Controller(Model model, MarkoliaMainView view) {
		super();
		this.model = model;
	}
	
	
	public Controller() {
		
		super();
	}


	public boolean createNewUser() throws Exception {	
		SignUpView signUpview = new SignUpView();
		String nameString = signUpview.getnameField();	
		String idString = signUpview.getIDtextField();
		String emailString = signUpview.getEmailText2();
		String passwordString = signUpview.getPsswordTextField();
		String passwordAgainString = signUpview.getPasswordAgainTextField();
		boolean addUserResult = false;
			
		if (nameString.isEmpty()){signUpview.PrintErrorMessage("Please Enter name");}
		
		if (idString.isEmpty()) {signUpview.PrintErrorMessage("Please Enter ID");}
		
		if (emailString.isEmpty()) {signUpview.PrintErrorMessage("Please Enter Email");}
		
		if (passwordString.isEmpty()) {signUpview.PrintErrorMessage("Please Enter Password");}
		
		if (passwordAgainString.isEmpty()) {signUpview.PrintErrorMessage("Please Re-Insert your Password");}
		
		if(!(passwordString.equals(passwordAgainString))){signUpview.PrintErrorMessage("Passwords Do not match!");}
		
		MarkoliaUser userTocreate = new MarkoliaUser(nameString, idString, emailString, passwordString);
		
		addUserResult = userRep.addNewUser(userTocreate);
				
		
		return true;
	
	}
		
	}


