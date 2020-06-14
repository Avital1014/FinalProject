package Drive;

import java.awt.Window;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Controller.Controller;
import Model.MarkoliaUser;
import Model.Model;
import View.MarkoliaMainView;
import View.SignUpView;



public class MVCdriver {

	private static String fILENAME= "Users";
	

	public static void main(String [] args) throws IOException, ClassNotFoundException {
		
		
		//Set<MarkoliaUser> Users = (Set<MarkoliaUser>) new HashSet<MarkoliaUser>();
	
		
		
		//try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream(fILENAME))) {
		//	System.out.println("open file in the main");
//		}catch (IOException e) {
	//		e.printStackTrace();
		//}
		
		
		/**configuration for General   */
		Model general_Model = new Model();
		MarkoliaMainView general_View = new MarkoliaMainView();
		//MarkoliaController general_Controller = new generalController(general_Model, general_View);
		Controller general_Controller = new Controller(general_Model, general_View);
		general_View.setController(general_Controller);
		general_View.start();
		((Window) general_View).setVisible(true);

	//}
	}
}

