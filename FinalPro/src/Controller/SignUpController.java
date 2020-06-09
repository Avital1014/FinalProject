package Controller;

import javax.swing.JOptionPane;

import Model.MarkoliaModel;
import Model.Model;
import Model.SingUpModel;
import View.MarkoliaView;
import View.SignUpVieww;

public class SignUpController extends MarkoliaController{

	private Model model = new Model();
	private MarkoliaView view;

	public SignUpController(Model model, MarkoliaView view){
		this.view = view;
		this.model = model;
		
	}
	

	public SignUpController() {
		super();
	}


public void createNewUserFromController() {
		System.out.println("Hello, this is controller");
	model.createNewUserInModel();
}




	
}
