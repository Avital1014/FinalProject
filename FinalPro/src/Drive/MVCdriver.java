package Drive;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Controller.MarkoliaController;
import Controller.SignUpController;
import Controller.generalController;
import Model.MarkoliaModel;
import Model.MarkoliaUser;
import Model.SingUpModel;
import Model.generalModel;
import View.MarkoliaMainView;
import View.MarkoliaView;
import View.SignUpView;

public class MVCdriver {

	private static String fILENAME= "Users";
	

	public static void main(String [] args) throws IOException{
		/**configuration for General   */
		MarkoliaModel general_Model = new generalModel();
		MarkoliaView general_View = new MarkoliaMainView();
		MarkoliaController general_Controller = new generalController(general_Model, general_View);
		general_View.setController(general_Controller);
		general_View.start();
		((Window) general_View).setVisible(true);
		

		/**configuration for Create new user  */
		MarkoliaModel createNewUser_model = new SingUpModel(); 
		MarkoliaView createNewUser_view = new SignUpView();
		MarkoliaController createNewUser_controller = new SignUpController(createNewUser_model, createNewUser_view);		
		createNewUser_view.setController(createNewUser_controller);
	
	
		List<MarkoliaUser> Users = new ArrayList<MarkoliaUser>();
		Users.add(new MarkoliaUser(1, "avitala", "avi", "aaa@gmail", "123"));
		Users.add(new MarkoliaUser(2, "EladBre", "eladi", "bbb@gmail", "122"));
		Users.add(new MarkoliaUser(3, "Check", "2", "a1@gmail", "122"));
		String file = "Users";
		
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream(file))) {
		objectOutputStream.writeObject(Users);
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}