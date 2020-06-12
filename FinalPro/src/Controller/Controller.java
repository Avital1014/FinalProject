package Controller;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Set;

import Model.MarkoliaUser;
import Model.Model;
import Model.UserRepository;
import Model.UserRepositoryImple;
import View.MarkoliaMainView;

public class Controller {
	private Model model = new Model();
	private MarkoliaMainView view;
	private UserRepositoryImple userRep = new UserRepositoryImple(); 
	public Controller(Model model, MarkoliaMainView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	

	public Controller() {
		super();
	}


	public void createNewUser(String name, String id, String Email, String passString) throws Exception {	
		
		MarkoliaUser userToCreate = new MarkoliaUser(name, id, Email, passString);			
		//if(userRep.findUser(id)) {
		try {
			userRep.addNewUser(userToCreate);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	
}

