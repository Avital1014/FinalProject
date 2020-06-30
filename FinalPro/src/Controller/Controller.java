package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import Model.MarkoliaUser;
import Model.Model;
import Model.UserRepositoryImple;
import Model.customer;
import Model.managerRepositoryImple;
import Model.products;
import View.MarkoliaMainView;
import View.SignUpView;
import View.signIn;



public class Controller {
	boolean addUserResult;
	public static MarkoliaUser currentUser;
	@SuppressWarnings("unused")	
	private Model model = new Model();	
	private UserRepositoryImple userRep = new UserRepositoryImple(); 	
	private managerRepositoryImple managerRep = new managerRepositoryImple();
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
		if(flag) {
			createCurrentUser(IdString, passString);
			
		}
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
	
	public void exportUsers(File path) {
		System.out.println("call export");
		managerRep.exportUsersList(path);
	}
	
	/*create and hold current user*/
	public void createCurrentUser(String id, String pass) {
		currentUser = new MarkoliaUser(id, pass);
		System.out.println("current id "+currentUser.getUser_id() + "pass" + currentUser.getPasswordUser());
	}
	
	public boolean isCurrenIsRoot(String name, String pass) {

		if((currentUser.getUser_id().equals("root")) && (currentUser.getPasswordUser().equals("root"))) {
		System.out.println("current id " + currentUser.getUser_id() + "urret pass " + currentUser.getPasswordUser());
		return true;
		}
		return false;
	}
	public Set<products> getProductList(){
		return managerRep.getProductsList();
	}
	
	public void writeToFIleproductslist(Set<products>productslist) throws FileNotFoundException, IOException {
		managerRep.writeToFIleproductslist(productslist);
		System.out.println("controller write");
	}
}


