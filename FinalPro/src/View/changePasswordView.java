package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class changePasswordView extends JFrame {

	private Controller controller = new Controller();
	private JPanel contentPane;
	private JTextField ChangeIdText;
	private JPasswordField currentPasswordField;
	private JPasswordField newPasswordField;
	private JPasswordField confirmPsswordField;
	JLabel validid = new JLabel("");
	JLabel validCurrentPass = new JLabel("");
	JLabel validnewPass = new JLabel("");
	JLabel validConfirmPass = new JLabel("");
	JLabel ValidMatchPass = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changePasswordView frame = new changePasswordView();
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
	public changePasswordView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 365, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("ID");
		
		JLabel lblNewLabel_1 = new JLabel("Entet Current Password");
		
		JLabel lblNewLabel_2 = new JLabel("Enter New Password");
		
		ChangeIdText = new JTextField();
		ChangeIdText.setColumns(10);
		
		JButton changeButton = new JButton("Change");
		changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String iDString = ChangeIdText.getText();
			String currentPassString = currentPasswordField.getText();
			String newPassString = newPasswordField.getText();
			String confirmPassString = confirmPsswordField.getText();
			boolean flag;
				
				try {
					if(iDString.isEmpty()) {
					validid.setText("Required field");
					//throw user id empty
					}
					try {
						if(currentPassString.isEmpty()) {
							validCurrentPass.setText("Required field");
						}
						try {
							flag = controller.findID(iDString);
							System.out.println("flag in login changepAss is = " + flag);
							if(!flag) throw new Exception("User Dose Not Exist, Please Create Account");
							try {
								flag = controller.userLogin(iDString, currentPassString);
								if(!flag) throw new Exception("ID/Password Worng");
								try {
									
									if(newPassString.isEmpty() ||(confirmPassString.isEmpty())) {
										throw new Exception("Invalid Password");
									}
									if(newPassString.length() < 4) {
										System.out.println("ASDFasdfasdf");
										throw new Exception("Plaese Enter 4 Characters at least");
									}
								if((newPassString.equals(confirmPsswordField)) ) {
								
									ValidMatchPass.setText("Your Password Does NOT Match!");
									throw new Exception("Password does not match, please fix");
									}
								try {
									System.out.println("ASDFasdfasdf");
									flag = controller.changePass(iDString, newPassString);
									//hadle action
								} catch (Exception e2) {
									// TODO: handle exception
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
						// TODO: handle exception
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		currentPasswordField = new JPasswordField();
		
		newPasswordField = new JPasswordField();
		
		confirmPsswordField = new JPasswordField();
		
		JLabel lblNewLabel_3 = new JLabel("Confirm Your Passwod");
		
		
		validid.setForeground(Color.RED);
		
		
		validCurrentPass.setForeground(Color.RED);
		
		
		validnewPass.setForeground(Color.RED);
		
		
		validConfirmPass.setForeground(Color.RED);
		
		
		ValidMatchPass.setForeground(Color.RED);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3))
							.addGap(40)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(currentPasswordField)
								.addComponent(ChangeIdText)
								.addComponent(newPasswordField, Alignment.TRAILING)
								.addComponent(confirmPsswordField)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(102)
							.addComponent(changeButton)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(validConfirmPass)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(validid)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(validCurrentPass))
						.addComponent(validnewPass)
						.addComponent(ValidMatchPass, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(ChangeIdText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(validid))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(currentPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(validCurrentPass))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(newPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(validnewPass))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(confirmPsswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(validConfirmPass))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(changeButton)
						.addComponent(ValidMatchPass))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
