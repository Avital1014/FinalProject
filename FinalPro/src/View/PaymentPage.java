package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDateChooserBeanInfo;
import com.toedter.calendar.JDateChooserCellEditor;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.Choice;
import javax.swing.JButton;
import org.jdesktop.swingx.prompt.PromptSupport;
public class PaymentPage extends JFrame {

	private JPanel contentPane;
	private JTextField phoneNumberText;
	private JTextField txtEnterFullName;
	private JTextField txtStreet;
	private JTextField apartementText;
	private JTextField txtZipCode;
	private JTextField textField;
	private JTextField txtNameHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentPage frame = new PaymentPage();
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
	public PaymentPage() {
		setForeground(Color.BLACK);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(PaymentPage.class.getResource("/View/computer-icons-credit-card-png-favpng-DyPKKiNGxPkpeBLHDdXsfcYJV.jpg")));
		setTitle("Payment and Shipping Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shipping Information");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel.setBounds(22, 11, 180, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1.setBounds(279, 49, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBoxNumbers = new JComboBox();
		comboBoxNumbers.setBackground(Color.WHITE);
		comboBoxNumbers.setModel(new DefaultComboBoxModel(new String[] {"054", "052", "050", "053"}));
		comboBoxNumbers.setBounds(382, 43, 52, 22);
		contentPane.add(comboBoxNumbers);
		
		phoneNumberText = new JTextField();
		//phoneNumberText.setText("xxx-xxxx");
		PromptSupport.setPrompt("xxx-xxxx", phoneNumberText);
		PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, phoneNumberText);
		phoneNumberText.setBounds(440, 44, 86, 20);
		contentPane.add(phoneNumberText);
		phoneNumberText.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setFont(new Font("Calibri", Font.BOLD, 14));
		lblContact.setBounds(32, 51, 93, 14);
		contentPane.add(lblContact);
		
		txtEnterFullName = new JTextField();
		//txtEnterFullName.setText("Enter Full Name");
		PromptSupport.setPrompt("Enter Full Name", txtEnterFullName);
		PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtEnterFullName);
		txtEnterFullName.setBounds(92, 44, 154, 20);
		contentPane.add(txtEnterFullName);
		txtEnterFullName.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Calibri", Font.BOLD, 14));
		lblAddress.setBounds(32, 86, 93, 14);
		contentPane.add(lblAddress);
		
		txtStreet = new JTextField();
		//txtStreet.setText("Street");
		PromptSupport.setPrompt("Street", txtStreet);
		PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtStreet);
		txtStreet.setColumns(10);
		txtStreet.setBounds(92, 81, 154, 20);
		contentPane.add(txtStreet);
		
		apartementText = new JTextField();
		//apartementText.setText("Apartment, Unit, etc");
		PromptSupport.setPrompt("Apartment, Unit, etc", apartementText);
		PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, apartementText);
		apartementText.setColumns(10);
		apartementText.setBounds(279, 81, 154, 20);
		contentPane.add(apartementText);
		
		JLabel lblIsrael = new JLabel("Israel");
		lblIsrael.setIcon(null);
		lblIsrael.setFont(new Font("Calibri", Font.BOLD, 14));
		lblIsrael.setBounds(42, 122, 46, 14);
		contentPane.add(lblIsrael);
		
		JLabel lblCity = new JLabel("City: ");
		lblCity.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCity.setBounds(92, 122, 93, 14);
		contentPane.add(lblCity);
		
		JComboBox comboBoxCities = new JComboBox();
		comboBoxCities.setModel(new DefaultComboBoxModel(new String[] {"Tel Aviv-Yafo", "Bat Yam", "Givatayim", "Ramat-Gan", "Herzliya", "Holon ", "Hod-HaSharon", "Kfar-Saba ", "Netanya", "Or-Yehuda", "Petah-Tikva", "Ranana", "Ramat-Hasharon", "Rishon-Lezion"}));
		comboBoxCities.setBounds(135, 116, 99, 22);
		contentPane.add(comboBoxCities);
		
		txtZipCode = new JTextField();
		//txtZipCode.setText("Zip Code");
		PromptSupport.setPrompt("Zip Code", txtZipCode);
		PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtZipCode);
		txtZipCode.setBounds(279, 117, 86, 20);
		contentPane.add(txtZipCode);
		txtZipCode.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Set Shipping information as Default to your User");
		chckbxNewCheckBox.setBounds(32, 153, 316, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblPaymentMethods = new JLabel("Payment Methods");
		lblPaymentMethods.setFont(new Font("Calibri", Font.BOLD, 18));
		lblPaymentMethods.setBounds(22, 198, 180, 23);
		contentPane.add(lblPaymentMethods);
		
		JLabel lblCreditCard = new JLabel("Credit Card:");
		lblCreditCard.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCreditCard.setBounds(22, 232, 93, 14);
		contentPane.add(lblCreditCard);
		
		textField = new JTextField();
		//textField.setText("0000 0000 0000 0000");
		PromptSupport.setPrompt("0000 0000 0000 0000", textField);
		PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, textField);
		textField.setColumns(10);
		textField.setBounds(92, 227, 154, 20);
		contentPane.add(textField);
		
		JLabel lblCreditHolder = new JLabel("Card Holder:");
		lblCreditHolder.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCreditHolder.setBounds(279, 232, 93, 14);
		contentPane.add(lblCreditHolder);
		
		txtNameHere = new JTextField();
		//txtNameHere.setText("Name Here");
		PromptSupport.setPrompt("Name Here", txtNameHere);
		PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtNameHere);
		txtNameHere.setColumns(10);
		txtNameHere.setBounds(366, 227, 154, 20);
		contentPane.add(txtNameHere);
		
		 
		 JDateChooser dateChooser = new JDateChooser();
		 dateChooser.setBounds(135, 258, 111, 20);
		 contentPane.add(dateChooser);
		 
		 JLabel lblEx = new JLabel("Expiration Date:");
		 lblEx.setFont(new Font("Calibri", Font.BOLD, 14));
		 lblEx.setBounds(22, 263, 119, 14);
		 contentPane.add(lblEx);
		 
		 JButton btnNewButton = new JButton("Finish the Purchase");
		 btnNewButton.setBounds(120, 310, 154, 23);
		 contentPane.add(btnNewButton);
	}
}
