package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FileChooserUI;

import Controller.Controller;

import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class ManagerView extends JFrame implements Runnable {

	private JPanel contentPane;
	
	Controller controller = new Controller();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerView frame = new ManagerView();
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
	public ManagerView() {
		JCheckBox list_Report = new JCheckBox("User's List Report");
		JFileChooser fileChooser = new JFileChooser();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JCheckBox totalOrders = new JCheckBox("New check box");
		JButton btnNewButton = new JButton("Generate Reports");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			
			//System.out.println(path.getAbsolutePath());
				
				if(list_Report.isSelected()) {
					chooser.showOpenDialog(null);
					File path = chooser.getSelectedFile();
					controller.exportUsers(path);
				}
				if(totalOrders.isSelected()) {
					chooser.showOpenDialog(null);
					File path = chooser.getSelectedFile();
					controller.exportOrderToTXT(path);
				}
			}
		});
		
		
	    
		btnNewButton.setBounds(303, 227, 119, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(303, 197, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		
		totalOrders.setBounds(303, 171, 97, 23);
		contentPane.add(totalOrders);
		
		
		list_Report.setBounds(303, 145, 121, 23);
		contentPane.add(list_Report);
		
		Button edit_Prices = new Button("Edit Prices");
		edit_Prices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	System.out.println("before thread");
				Shopping_cart cartForEdit;
				try {
					cartForEdit = new Shopping_cart();
					cartForEdit.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
			}
		});
		edit_Prices.setBounds(46, 228, 70, 22);
		contentPane.add(edit_Prices);
	}

	@Override
	public void run() {
		Shopping_cart cartForEdit = null;
		try {
			cartForEdit = new Shopping_cart();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cartForEdit.setVisible(true);
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
