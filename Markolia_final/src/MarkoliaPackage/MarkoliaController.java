package MarkoliaPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MarkoliaController {
	private MarkoliaView1 theView;
	private MarkoliaModel theModel;
	
	public MarkoliaController(MarkoliaView1 theView, MarkoliaModel theModel) {
		this.theView = theView;
		this.theModel = theModel;		
		this.theView.addListener(new CalculateListener());
}

class CalculateListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		addNewUserWin newUserCreate = new addNewUserWin();
		System.out.println("uytutuituc");
	}
	

}
}
