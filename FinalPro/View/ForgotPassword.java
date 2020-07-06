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
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;

public class ForgotPassword extends JFrame {

	private JPanel contentPane;
	private JTextField iDTextField;
	private JTextField EmailTextField;
	private JTextField answerTextField;
	JComboBox comboBox = new JComboBox();
	private JLabel validAnswer;
	private JLabel validID;
	private JLabel validEmail;
	Controller controller = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword frame = new ForgotPassword();
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
	public ForgotPassword() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 489, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("ID");
		
		iDTextField = new JTextField();
		iDTextField.setColumns(10);
		
		JLabel EmailLabel = new JLabel("Email");
		
		EmailTextField = new JTextField();
		EmailTextField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idString = iDTextField.getText();
				String emalString = EmailTextField.getText();
				String comboBoxValue = (String) comboBox.getSelectedItem();
				String answer = answerTextField.getText();
				
				try {
					if(idString.isEmpty()) {
						validID.setText("Required field");
						throw new Exception("Please Enter ID");
					}
					try {
						if(emalString.isEmpty()) {
						validEmail.setText("Required field");
						throw new Exception("Please Enter Email");
						
					}
						try {
							String flagString = controller.forgotPassword(comboBoxValue,answer, idString);
							if(flagString != null) {
								JOptionPane.showMessageDialog(null, "Youe Password is " + flagString);
							}
							else {
								throw new Exception("Unable To Find Youe Account, Please Call System Admin");
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
		
		
		comboBox.addItem("What Is Your Favorite Color");
		comboBox.addItem("What Is The Name Of Your Best Friend");
		comboBox.addItem("What Is Your Pet Name");
		
		answerTextField = new JTextField();
		answerTextField.setColumns(10);
		
		validAnswer = new JLabel("");
		validAnswer.setForeground(new Color(255, 0, 0));
		
		validID = new JLabel("");
		validID.setForeground(new Color(255, 0, 0));
		
		validEmail = new JLabel("");
		validEmail.setForeground(new Color(255, 0, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(EmailLabel))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(iDTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(validID))
								.addComponent(EmailTextField, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(answerTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(validAnswer)))
							.addGap(18)
							.addComponent(validEmail))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(92)
							.addComponent(btnNewButton)))
					.addContainerGap(121, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(iDTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(validID))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(EmailLabel)
						.addComponent(EmailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(validEmail))
					.addGap(50)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(answerTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(validAnswer))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
