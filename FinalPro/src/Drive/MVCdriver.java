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
	

	public static void main(String [] args) throws IOException {
		
		
		//Set<MarkoliaUser> Users = (Set<MarkoliaUser>) new HashSet<MarkoliaUser>();
		String file = "Users";
		
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream(file, true))) {
			System.out.println("open file in the main");
			objectOutputStream.close();
			
			
			
		}
		/**configuration for General   */
		Model general_Model = new Model();
		MarkoliaMainView general_View = new MarkoliaMainView();
		//MarkoliaController general_Controller = new generalController(general_Model, general_View);
		Controller general_Controller = new Controller(general_Model, general_View);
		general_View.setController(general_Controller);
		general_View.start();
		((Window) general_View).setVisible(true);

/*
		List<MarkoliaUser> Users = new ArrayList<MarkoliaUser>();
		Users.add(new MarkoliaUser(1, "avitala", "avi", "aaa@gmail", "123"));
		Users.add(new MarkoliaUser(2, "EladBre", "eladi", "bbb@gmail", "122"));
		Users.add(new MarkoliaUser(3, "Check", "2", "a1@gmail", "122"));
		String file = "Users";
		
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream(file))) {
		objectOutputStream.writeObject(Users);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
}
}


//}