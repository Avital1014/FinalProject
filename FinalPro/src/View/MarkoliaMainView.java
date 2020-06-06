package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.hit.controller.Controller;

import Controller.MarkoliaController;
import Controller.SignUpController;

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
import javax.swing.Action;
import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MarkoliaMainView extends JFrame implements MarkoliaView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Action action = new SwingAction();
	 /**
	 * Launch the application.
	 */
	 
		@Override
		public void setController(MarkoliaController controller) {
			
		}

	 
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarkoliaMainView frame = new MarkoliaMainView();
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
	public MarkoliaMainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,300);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton signInUser = new JButton("Sing in");
		signInUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signIn signInView= new signIn();
				signInView.setVisible(true);
			}
		});
		signInUser.setBounds(47, 106, 89, 48);
		panel.add(signInUser);
		
		JButton signUp = new JButton("Sign Up");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpView signUpView = new SignUpView();
				signUpView.setVisible(true);
			}
		});
		signUp.setBounds(174, 106, 89, 48);
		panel.add(signUp);
		
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
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

	@Override
	public void start() {
	
		
	}


	}
