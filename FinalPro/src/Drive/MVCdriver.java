package Drive;

import java.awt.Window;
import java.io.IOException;


import Controller.MarkoliaController;
import Controller.SignUpController;
import Controller.generalController;
import Model.MarkoliaModel;
import Model.Model;
import Model.SingUpModel;
import Model.generalModel;
import View.MarkoliaMainView;
import View.MarkoliaView;
import View.SignUpVieww;

public class MVCdriver {

	private static final Model Model = null;

	public static void main(String [] args) throws IOException{
		/**configuration for General   */
		MarkoliaModel general_Model = new generalModel();
		MarkoliaView general_View = new MarkoliaMainView();
		//MarkoliaController general_Controller = new generalController(general_Model, general_View);
		MarkoliaController general_Controller = new generalController(Model, general_View);
		general_View.setController(general_Controller);
		general_View.start();
		((Window) general_View).setVisible(true);
		

		/**configuration for Create new user  */
		//MarkoliaModel createNewUser_model = new SingUpModel(); 
		//MarkoliaView createNewUser_view = new SignUpView();
		//MarkoliaController createNewUser_controller = new SignUpController(createNewUser_model, createNewUser_view);		
		//createNewUser_view.setController(createNewUser_controller);
		//createNewUser_view.start();
		//((Window) createNewUser_view).setVisible(true);
	

}
}