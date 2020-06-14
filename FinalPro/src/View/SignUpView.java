package View;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import Controller.Controller;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

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
	private JTextField emailText2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel lblNewLabel_5;
	
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
		setBounds(100, 100, 713, 462);
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
				String nameString = null;
				String iDString= null;
				String EmaString= null;
				String passwordString= null;
				String secoundPassword= null;								
			
				/*
				try {
					if (nameTextField.getText().isEmpty())
						PrintErrorMessage("sdfgsdfgsdfg");
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				if(nameTextField.getText().isEmpty()) 
				JOptionPane.showMessageDialog(null, "Please Enter a name");				
				else {
					 nameString = getNameField();}
				*/
				
				/*
				//System.out.println(nameString);
				if(IDtextField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter ID");	
				}else {
				iDString = getIDtextField();}
				//System.out.println(iDString);
				if(emailText2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Email");	
				}else {
					EmaString = getEmailText2();
				}				
				//System.out.println(EmaString);
				if(passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Enter Password");}
				else if(passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Re-Insert your Password");}
					else {
						passwordString = getPsswordTextField();
						secoundPassword = getPasswordAgainTextField();
						if(!passwordString.equals(secoundPassword))
						JOptionPane.showMessageDialog(null, "Passwords do not match");
					}
				
		
				passwordString = getPsswordTextField();
				*/	
				try {
				//	if (!(nameTextField.getText().isEmpty()) && !(IDtextField.getText().isEmpty()) && !(emailText2.getText().isEmpty()) && !(psswordTextField.getText().isEmpty())) {
					boolean flag = controller.createNewUser();
					//	boolean flag = controller.createNewUser(nameString, iDString, EmaString, passwordString);
						if(flag) 
							JOptionPane.showMessageDialog(null, "User registered successfully");
					//}
					else
						System.out.println("asdfasdf");
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
				}

		});
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		
		IDtextField = new JTextField();
		IDtextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password");
		
		emailText2 = new JTextField();
		emailText2.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(chckbxNewCheckBox.isSelected())
			{
				passwordField_1.setEchoChar((char)0);
			}else {
			
			}
			}
			
		});
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Show Password");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_1.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}else {
						
				}
			}
		});
		
		passwordField_1 = new JPasswordField();
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4))
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(54)
									.addComponent(createButton)
									.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE))
								.addComponent(passwordField_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
								.addComponent(IDtextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameField, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addComponent(emailText2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(IDtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(emailText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_1)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
					.addComponent(createButton)
					.addGap(56))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(396, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
		);
		panel_1.setLayout(null);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\eladb\\Desktop\\Screenshot_2.png"));
		lblNewLabel_5.setBounds(10, 0, 249, 395);
		panel_1.add(lblNewLabel_5);
		contentPane.setLayout(gl_contentPane);
	}
	


//	public void start() throws Exception {
		
//		controller.createNewUser(getNameField(), getIDtextField(), getEmailText2(), getPsswordTextField());
//	}

	
	public void run() {
			
		//System.out.println(name);
		try {
	//		controller.createNewUser(getNameField(), getIDtextField(), getEmailText2(), getPsswordTextField());
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


	@SuppressWarnings("deprecation")
	public String getPsswordTextField() {
		return passwordField.getText();
	}


	@SuppressWarnings("deprecation")
	public String getPasswordAgainTextField() {
		return passwordField_1.getText();
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
	
	public void PrintErrorMessage(String error) {
		JOptionPane.showMessageDialog(null, error);
	}
}
