package Controller;

import Model.MarkoliaUser;
import Model.Model;
import Model.UserRepositoryImple;
import View.MarkoliaMainView;
import View.SignUpView;
import View.signIn;


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

	public boolean createNewUser(String name, String iD, String email, String password) throws Exception {	
		boolean addUserResult = false;	
		MarkoliaUser userTocreate = new MarkoliaUser(name, iD, email, password);		
		addUserResult = userRep.addNewUser(userTocreate);				
		return addUserResult;	
		}	
	
	public boolean userLogin(String nameString, String passString) {
		boolean flag = userRep.userLoging(nameString, passString);
		
		return true;
		}
	}


