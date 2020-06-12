package View;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import Controller.Controller;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpView extends JFrame implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Controller controller = new Controller();
	private JPanel contentPane;
	private JTextField nameTextField;	
	private JTextField nameField;
	private JTextField IDtextField;
	private JTextField psswordTextField;
	private JTextField passwordAgainTextField;
	private JTextField emailText2;
	
	public SignUpView(Controller Controller) throws HeadlessException {
		super();
		this.controller = Controller;
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

	
	
	/**
	 * Create the frame.
	 */
	public SignUpView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);		
		JLabel lblNewLabel = new JLabel("Full Name");		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameField = new JTextField();
		nameField.setColumns(10);
		
		JButton createButton = new JButton("Create");
		createButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String nameString = getNameField();
				//System.out.println(nameString);
				String iDString = getIDtextField();
				//System.out.println(iDString);
				String EmaString = getEmailText2();
				//System.out.println(EmaString);
				String passwordString = getPsswordTextField();
				//System.out.println(passwordString);	
				try {
					controller.createNewUser(nameString, iDString, EmaString, passwordString);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//Thread t1 = new Thread(new SignUpView());
				//t1.start();
				}

		});
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		
		IDtextField = new JTextField();
		IDtextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		
		psswordTextField = new JTextField();
		psswordTextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Enter password again");
		
		passwordAgainTextField = new JTextField();
		passwordAgainTextField.setColumns(10);
		
		emailText2 = new JTextField();
		emailText2.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(emailText2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGap(47)
													.addComponent(lblNewLabel_4)
													.addGap(18)
													.addComponent(passwordAgainTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(27)
											.addComponent(IDtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(psswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(173)
							.addComponent(createButton)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(passwordAgainTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(IDtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(emailText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(psswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(createButton)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	


	public void start() throws Exception {
		
		controller.createNewUser(getNameField(), getIDtextField(), getEmailText2(), getPsswordTextField());
	}

	
	public void run() {
			
		//System.out.println(name);
		try {
			controller.createNewUser(getNameField(), getIDtextField(), getEmailText2(), getPsswordTextField());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public String getNameTextField() {
		return nameTextField.getText();
	}


	public String getnameField() {
		return nameField.getText();
	}


	public String getPsswordTextField() {
		return psswordTextField.getText();
	}


	public String getPasswordAgainTextField() {
		return passwordAgainTextField.getText();
	}

	public String getEmailText2() {
		return emailText2.getText();
	}

	public String getIDtextField() {
		return IDtextField.getText();
	}

	public String getNameField() {
		return nameField.getText();
	}


	
	
	
}
