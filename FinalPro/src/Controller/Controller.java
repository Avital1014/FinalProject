package Controller;

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



	public void createNewUser(String name, String id, String Email, String passString) {
		System.out.println("this is controller");
		System.out.println(name);
		MarkoliaUser userToCreate = new MarkoliaUser(name, id, Email, passString);
		try {
			System.out.println(name);
			userRep.addNewUser(userToCreate);
			//userRep.findUser("206022337");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
