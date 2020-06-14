package Controller;



import Model.MarkoliaUser;
import Model.Model;
import Model.UserRepositoryImple;
import View.MarkoliaMainView;

public class Controller {
	
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

