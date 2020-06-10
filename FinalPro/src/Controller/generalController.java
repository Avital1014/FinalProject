package Controller;

import Model.MarkoliaModel;

import Model.generalModel;
import View.MarkoliaMainView;
import View.MarkoliaView;

public class generalController extends MarkoliaController{
	private MarkoliaModel model;
	private MarkoliaView view;

	public generalController(MarkoliaModel general_Model, MarkoliaView general_View){
		this.view = general_View;
		this.model = general_Model;
		
	}
}
