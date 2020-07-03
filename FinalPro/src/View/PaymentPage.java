package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
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
		phoneNumberText.setText("xxx-xxxx");
		phoneNumberText.setBounds(440, 44, 86, 20);
		contentPane.add(phoneNumberText);
		phoneNumberText.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact:");
		lblContact.setFont(new Font("Calibri", Font.BOLD, 14));
		lblContact.setBounds(32, 51, 93, 14);
		contentPane.add(lblContact);
		
		txtEnterFullName = new JTextField();
		txtEnterFullName.setText("Enter Full Name");
		txtEnterFullName.setBounds(92, 44, 154, 20);
		contentPane.add(txtEnterFullName);
		txtEnterFullName.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Calibri", Font.BOLD, 14));
		lblAddress.setBounds(32, 86, 93, 14);
		contentPane.add(lblAddress);
		
		txtStreet = new JTextField();
		txtStreet.setText("Street");
		txtStreet.setColumns(10);
		txtStreet.setBounds(92, 81, 154, 20);
		contentPane.add(txtStreet);
		
		apartementText = new JTextField();
		apartementText.setText("Apartment, Unit, etc");
		apartementText.setColumns(10);
		apartementText.setBounds(279, 81, 154, 20);
		contentPane.add(apartementText);
		
		JLabel lblIsrael = new JLabel("Israel");
		lblIsrael.setIcon(new ImageIcon(PaymentPage.class.getResource("/View/israel-flag-icon-free-download.jpg")));
		lblIsrael.setFont(new Font("Calibri", Font.BOLD, 14));
		lblIsrael.setBounds(32, 122, 65, 14);
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
		txtZipCode.setText("Zip Code");
		txtZipCode.setBounds(279, 117, 86, 20);
		contentPane.add(txtZipCode);
		txtZipCode.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Set Shipping information as Default to your User");
		chckbxNewCheckBox.setBounds(32, 153, 286, 23);
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
		textField.setText("0000 0000 0000 0000");
		textField.setColumns(10);
		textField.setBounds(92, 227, 154, 20);
		contentPane.add(textField);
		
		JLabel lblCreditHolder = new JLabel("Credit Holder:");
		lblCreditHolder.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCreditHolder.setBounds(279, 232, 93, 14);
		contentPane.add(lblCreditHolder);
		
		txtNameHere = new JTextField();
		txtNameHere.setText("Name Here");
		txtNameHere.setColumns(10);
		txtNameHere.setBounds(366, 227, 154, 20);
		contentPane.add(txtNameHere);
		
		JLabel lblExpires = new JLabel("Expires:");
		lblExpires.setFont(new Font("Calibri", Font.BOLD, 14));
		lblExpires.setBounds(22, 264, 93, 14);
		contentPane.add(lblExpires);
		
		 
		
	}
}
