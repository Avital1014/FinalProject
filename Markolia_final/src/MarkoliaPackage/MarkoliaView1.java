package MarkoliaPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MarkoliaView1 extends JFrame {
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarkoliaView1 frame = new MarkoliaView1();
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
	public MarkoliaView1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,300);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton signInUser = new JButton("Sing In");
		signInUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signIn signInView= new signIn();
				signInView.setVisible(true);
			}
		});
		signInUser.setBounds(55, 106, 89, 48);
		panel.add(signInUser);
		
		JButton createNewUser = new JButton("Sign Up");
		createNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signUp signUpView = new signUp();
				signUpView.setVisible(true);
				
				
			}
		});
		createNewUser.setBounds(188, 106, 89, 48);
		panel.add(createNewUser);
		
		JLabel welcomLabel = new JLabel("Welcome to Markolia");
		welcomLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		welcomLabel.setForeground(new Color(255, 255, 255));
		welcomLabel.setBackground(Color.WHITE);
		welcomLabel.setBounds(47, 29, 246, 50);
		panel.add(welcomLabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\350x3001.jpg"));
		lblNewLabel.setBounds(0, 0, 334, 261);
		panel.add(lblNewLabel);
		
		};
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}


	}


