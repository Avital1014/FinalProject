package View;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import com.sun.source.tree.Tree;

import javax.swing.JOptionPane;
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
import java.awt.Color;
import javax.swing.JComboBox;

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
	JComboBox comboBox = new JComboBox();
	
	String nameString = null;
	String iDString= null;
	String EmaString= null;
	String passwordString= null;
	String secoundPassword= null;	
	private JTextField answerTextField;

	
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 713, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);		
		JLabel lblNewLabel = new JLabel("Full Name");		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameField = new JTextField();
		nameField.setColumns(10);
		JLabel validLabel = new JLabel("");
		JLabel validIDLabel = new JLabel("");
		JLabel valiedEailLabel = new JLabel("");
		JLabel verifyPass = new JLabel("");		
		JLabel validAnswer = new JLabel("");
		JButton createButton = new JButton("Create");
		createButton.addActionListener(new ActionListener() {
			

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				nameString = nameField.getText();
				iDString = IDtextField.getText();
				EmaString = emailText2.getText();
				passwordString = passwordField.getText();
				secoundPassword = passwordField_1.getText();
				String comboBoxValueString;
				String answerString;

				try {
					nameString = nameField.getText();
					setNameField(nameString);
					if(nameString.isEmpty()) {
						validLabel.setText("Required field");
						throw new Exception("please fix name");
					
					}
					try {
						iDString = IDtextField.getText();
						if(iDString.isEmpty()) {
							 validIDLabel.setText("Required field"); 
							 throw new Exception("please fix ID");
						}
						
						try {
							EmaString = emailText2.getText();
							if(EmaString.isEmpty()) {
								valiedEailLabel.setText("Required field");
								 throw new Exception("please fix your Email");
							}
						
							try {
								passwordString = passwordField.getText();
								secoundPassword = passwordField_1.getText();
									if(passwordString.isEmpty() || secoundPassword.isEmpty()) {
										throw new Exception("Invalid Password");
									}
									if(passwordString.length() < 4) {
										throw new Exception("Plaese Enter 4 Characters at least");
									}
								if(!(passwordString.equals(secoundPassword)) ) {
								
									verifyPass.setText("Your Password Does NOT Match!");
									throw new Exception("Password does not match, please fix");
								}
								try {
								comboBoxValueString = (String) comboBox.getSelectedItem();
								answerString = answerTextField.getText();
								if(answerString.isEmpty()) {
									validAnswer.setText("Required fieldRequired field");
									throw new Exception("Please Enter Your Answer");
								}
								try {									
									boolean flag = controller.createNewUser(nameString, iDString, EmaString, passwordString,comboBoxValueString, answerString);	
									
										if(flag) 
											JOptionPane.showMessageDialog(null, "User registered successfully");	
										else {
											JOptionPane.showMessageDialog(null, "User Already Exist");									
										}	
								} catch (Exception e2) {
									JOptionPane.showMessageDialog(null, e2);
								}
								} catch (Exception e1) {
									
								//	e1.printStackTrace();
								}
							} catch (Exception e2) {
								JOptionPane.showMessageDialog(null, e2);
							}
							
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, e2);
						}
						
						
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e2);	
					}
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);						
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
		
	
		validLabel.setForeground(Color.RED);
		
		
		validIDLabel.setForeground(Color.RED);
		
		
		valiedEailLabel.setForeground(new Color(255, 0, 0));
		
		
		verifyPass.setForeground(Color.RED);
		
		
		comboBox.addItem("What Is Your Favorite Color");
		comboBox.addItem("What Is The Name Of Your Best Friend");
		comboBox.addItem("What Is Your Pet Name");
		
		answerTextField = new JTextField();
		answerTextField.setColumns(10);
		
	
		validAnswer.setForeground(new Color(255, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("working");
				controller.exportUsers(null);
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(42)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_4))
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(emailText2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(valiedEailLabel))
										.addComponent(passwordField_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
										.addComponent(validIDLabel)
										.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
										.addComponent(validLabel)
										.addComponent(IDtextField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
										.addComponent(nameField, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(chckbxNewCheckBox)
											.addGap(32)
											.addComponent(verifyPass))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(95)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(answerTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnNewButton)
											.addGap(84)
											.addComponent(createButton)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(validAnswer)
									.addGap(80)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(validLabel)
							.addGap(1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(IDtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(validIDLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(lblNewLabel_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(emailText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(valiedEailLabel))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(chckbxNewCheckBox_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxNewCheckBox)
								.addComponent(verifyPass)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addComponent(lblNewLabel_4)))
					.addGap(40)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(answerTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(validAnswer))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(createButton)
						.addComponent(btnNewButton))
					.addGap(21))
		);
		panel_1.setLayout(null);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\eladb\\Desktop\\Screenshot_2.png"));
		lblNewLabel_5.setBounds(10, -11, 249, 402);
		panel_1.add(lblNewLabel_5);
		contentPane.setLayout(gl_contentPane);
	}
	
	

	public String getNameTextField() {
		return nameTextField.getText();
	}


	public String getnameField() {
		System.out.println("get" + this.nameString);
		return this.nameString;
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
		return nameString;
	}
	
	public void PrintErrorMessage(String error) {
		JOptionPane.showMessageDialog(null, error);
	}

	public void setNameTextField(JTextField nameTextField) {
		this.nameTextField = nameTextField;
	}

	public void setNameField(String nameField) {
		this.nameString = nameField;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
