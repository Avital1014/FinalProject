package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.MarkoliaController;
import Controller.SignUpController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.awt.event.ActionEvent;

public class SignUpView extends JFrame implements MarkoliaView, Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MarkoliaController signUpController;
	private JPanel contentPane;
	private JTextField nameTextField;

	
	@Override
	public void setController(MarkoliaController controller) {
		
		//JOptionPane.showMessageDialog(null, "start");
		this.signUpController=controller;
		
	}
	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpView frame = new SignUpView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
	}

	
	public String getName() {
		return nameTextField.getText();		
	}
	
	/**
	 * Create the frame.
	 */
	public SignUpView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Name");
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		
		JButton createButton = new JButton("Create");
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			start();
				}

		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(143)
							.addComponent(createButton)))
					.addContainerGap(192, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addComponent(createButton)
					.addGap(63))
		);
		contentPane.setLayout(gl_contentPane);
	}
	

	@Override
	public void start() {
		//JOptionPane.showMessageDialog(null, "start");
		new Thread(this).start();
		
	}

	@Override
	public void run() {
		//JOptionPane.showMessageDialog(null, "run");
		
		
		signUpController.createNewUSer();
		
		
		//JOptionPane.showMessageDialog(null, "I am happy.");
		
		
	}





	

	



}
