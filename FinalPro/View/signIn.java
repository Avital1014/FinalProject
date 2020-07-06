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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Color;

public class signIn extends JFrame {

	private Controller controller = new Controller();
	private JPanel contentPane;
	private JTextField loginIdText;
	String loginIDString;
	String loginPasswordString;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					signIn frame = new signIn();
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
	public signIn() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 415, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("ID");
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		
		loginIdText = new JTextField();
		loginIdText.setColumns(10);
		
		JButton loginButton = new JButton("Log-In");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean flag;
				loginIDString = loginIdText.getText();
				loginPasswordString = passwordField.getText();
				try {
					flag = controller.userLogin(loginIDString, loginPasswordString);
					//System.out.println("flag is " + flag);
					if((flag == true) && loginIDString.equals("root") && loginPasswordString.equals("root")) {
						ManagerView managerview = new ManagerView();
						managerview.setVisible(true);						
					}
					else if (flag) {
						Shopping_cart shopping_cart = new Shopping_cart();
						shopping_cart.setVisible(true);						
					}
					else {
						JOptionPane.showMessageDialog(null, "ID/Password worng!");
					}					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		JButton btnNewButton = new JButton("Change Password");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePasswordView changePasswordView = new changePasswordView();
				changePasswordView.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Forgot Password");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgotPassword forgotPassword = new ForgotPassword();
				forgotPassword.setVisible(true);
			}
		});
		
		passwordField = new JPasswordField();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(chckbxNewCheckBox.isSelected()) {
				passwordField.setEchoChar((char)0);
			}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(loginIdText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(passwordField, 101, 101, 101))
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(loginButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(31))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(loginButton)
						.addComponent(loginIdText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(btnNewButton)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(btnNewButton_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(chckbxNewCheckBox)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public String getLoginIDString() {
		return loginIDString;
	}

	public String getLoginPasswordString() {
		return loginPasswordString;
	}
}
