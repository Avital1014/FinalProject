package Controller;

import javax.swing.JOptionPane;

import Model.MarkoliaModel;
import Model.SingUpModel;
import View.MarkoliaView;
import View.SignUpView;

public class SignUpController extends MarkoliaController{

	private MarkoliaModel model;
	private MarkoliaView view;

	public SignUpController(MarkoliaModel model, MarkoliaView view){
		this.view = view;
		this.model = model;
		
	}

	@Override
	public void createNewUSer() {
		
		System.out.println("sdfsahgsdf");
		JOptionPane.showMessageDialog(null, "done.");
		model.createNewUSer() ;
		
	}






	
}
