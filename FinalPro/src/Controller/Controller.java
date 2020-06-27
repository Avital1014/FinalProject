package Controller;

import java.io.IOException;



import Model.MarkoliaUser;
import Model.Model;
import Model.UserRepositoryImple;
import Model.customer;
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

	public boolean createNewUser(String name, String iD, String email, String password, String question, String answer) throws Exception {	
		boolean addUserResult = false;	
		//System.out.println("at controller");
		customer userTocreate = new customer(name, iD, email, password, question, answer);		
		System.out.println(userTocreate.toString());
		addUserResult = userRep.addNewUser(userTocreate);				
		return addUserResult;	
		}	
	
	public boolean userLogin(String IdString, String passString) {
		System.out.println("flag in main "  );
		boolean flag = userRep.userLoging(IdString, passString);	
		System.out.println("flag in main " + flag );
		return flag;
		}
	
	public String findNameById(String idString) {
		return userRep.findNameById(idString);
		
	}
	
	public boolean findUser(String id) throws Exception {
	
			return userRep.findUser(id);		
	}
	
	public boolean findID(String id) {
		
		return userRep.findID( id);
	}
	
	public boolean changePass(String id, String newPass) throws IOException {
		return userRep.changePass(id , newPass);
	}
	
	public void printAllUser() {
		userRep.printAllUser();
	}
	
	public String forgotPassword(String qustion,String answer, String id) throws IOException {
		return userRep.forgotPassword(qustion,answer, id);
	}
}


