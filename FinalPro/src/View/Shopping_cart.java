package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.Box;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Window.Type;
import java.awt.Frame;

public class Shopping_cart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shopping_cart frame = new Shopping_cart();
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
	public Shopping_cart() {
		setType(Type.POPUP);
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\download.png"));
		setTitle("Shopping Cart");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1172, 896);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(tabbedPane);
		
		JPanel fruitPanel = new JPanel();
		fruitPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Fruits", null, fruitPanel, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		fruitPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Watermelon");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\download.jpg"));
		lblNewLabel.setBounds(875, 8, 226, 216);
		fruitPanel.add(lblNewLabel);
		
		JButton watermelonButton = new JButton("Add to Cart");
		watermelonButton.setFont(new Font("Calibri", Font.BOLD, 18));
		watermelonButton.setBounds(933, 235, 119, 24);
		fruitPanel.add(watermelonButton);
		
		JLabel lblNewLabel_1 = new JLabel("kg");
		lblNewLabel_1.setBounds(1015, 270, 46, 14);
		fruitPanel.add(lblNewLabel_1);
		
		JSpinner watermelonSpinner = new JSpinner();
		watermelonSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		watermelonSpinner.setBounds(962, 267, 46, 20);
		fruitPanel.add(watermelonSpinner);
		
		JLabel label = new JLabel("Melon");
		label.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-34-300x300.jpg"));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.BOLD, 24));
		label.setBounds(579, 8, 237, 216);
		fruitPanel.add(label);
		
		JButton melonButton = new JButton("Add to Cart");
		melonButton.setFont(new Font("Calibri", Font.BOLD, 18));
		melonButton.setBounds(637, 235, 119, 24);
		fruitPanel.add(melonButton);
		
		JLabel label_1 = new JLabel("kg");
		label_1.setBounds(719, 270, 46, 14);
		fruitPanel.add(label_1);
		
		JSpinner melonSpinner = new JSpinner();
		melonSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		melonSpinner.setBounds(663, 267, 46, 20);
		fruitPanel.add(melonSpinner);
		
		JLabel label_2 = new JLabel("Pineapple");
		label_2.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-12-300x300.jpg"));
		label_2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Calibri", Font.BOLD, 24));
		label_2.setBounds(337, 3, 182, 227);
		fruitPanel.add(label_2);
		
		JButton pineappleButton = new JButton("Add to Cart");
		pineappleButton.setFont(new Font("Calibri", Font.BOLD, 18));
		pineappleButton.setBounds(373, 235, 119, 24);
		fruitPanel.add(pineappleButton);
		
		JSpinner pineappleSpinner = new JSpinner();
		pineappleSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		pineappleSpinner.setBounds(402, 267, 46, 20);
		fruitPanel.add(pineappleSpinner);
		
		JLabel label_3 = new JLabel("kg");
		label_3.setBounds(458, 270, 46, 14);
		fruitPanel.add(label_3);
		
		JLabel label_4 = new JLabel("Strawberries");
		label_4.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\strawberry-300x300.jpg"));
		label_4.setHorizontalTextPosition(SwingConstants.CENTER);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Calibri", Font.BOLD, 24));
		label_4.setBounds(31, 3, 265, 227);
		fruitPanel.add(label_4);
		
		JButton strawberriesbButton = new JButton("Add to Cart");
		strawberriesbButton.setFont(new Font("Calibri", Font.BOLD, 18));
		strawberriesbButton.setBounds(93, 235, 119, 24);
		fruitPanel.add(strawberriesbButton);
		
		JSpinner strwaberriesSpinner = new JSpinner();
		strwaberriesSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		strwaberriesSpinner.setBounds(117, 264, 46, 20);
		fruitPanel.add(strwaberriesSpinner);
		
		JLabel label_5 = new JLabel("kg");
		label_5.setBounds(173, 267, 46, 14);
		fruitPanel.add(label_5);
		
		JLabel lblPeachPita = new JLabel("Peach Pita");
		lblPeachPita.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-17-300x300.jpg"));
		lblPeachPita.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPeachPita.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeachPita.setFont(new Font("Calibri", Font.BOLD, 24));
		lblPeachPita.setBounds(875, 343, 246, 216);
		fruitPanel.add(lblPeachPita);
		
		JButton peachPitaButton = new JButton("Add to Cart");
		peachPitaButton.setFont(new Font("Calibri", Font.BOLD, 18));
		peachPitaButton.setBounds(933, 570, 119, 24);
		fruitPanel.add(peachPitaButton);
		
		JSpinner peachPitaSpinner = new JSpinner();
		peachPitaSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		peachPitaSpinner.setBounds(962, 602, 46, 20);
		fruitPanel.add(peachPitaSpinner);
		
		JLabel label_7 = new JLabel("kg");
		label_7.setBounds(1015, 605, 46, 14);
		fruitPanel.add(label_7);
		
		JLabel lblRedApple = new JLabel("Pink Lady Apple");
		lblRedApple.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-54-300x300.jpg"));
		lblRedApple.setHorizontalTextPosition(SwingConstants.CENTER);
		lblRedApple.setHorizontalAlignment(SwingConstants.CENTER);
		lblRedApple.setFont(new Font("Calibri", Font.BOLD, 24));
		lblRedApple.setBounds(579, 343, 246, 216);
		fruitPanel.add(lblRedApple);
		
		JButton pinkLadyButton = new JButton("Add to Cart");
		pinkLadyButton.setFont(new Font("Calibri", Font.BOLD, 18));
		pinkLadyButton.setBounds(637, 570, 119, 24);
		fruitPanel.add(pinkLadyButton);
		
		JSpinner pinkLadySpinner = new JSpinner();
		pinkLadySpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		pinkLadySpinner.setBounds(666, 602, 46, 20);
		fruitPanel.add(pinkLadySpinner);
		
		JLabel label_8 = new JLabel("kg");
		label_8.setBounds(719, 605, 46, 14);
		fruitPanel.add(label_8);
		
		JLabel lblLemon = new JLabel("Lemon");
		lblLemon.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-29-300x300.jpg"));
		lblLemon.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLemon.setHorizontalAlignment(SwingConstants.CENTER);
		lblLemon.setFont(new Font("Calibri", Font.BOLD, 24));
		lblLemon.setBounds(299, 343, 246, 216);
		fruitPanel.add(lblLemon);
		
		JButton lemonButton = new JButton("Add to Cart");
		lemonButton.setFont(new Font("Calibri", Font.BOLD, 18));
		lemonButton.setBounds(357, 570, 119, 24);
		fruitPanel.add(lemonButton);
		
		JSpinner lemonSpinner = new JSpinner();
		lemonSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		lemonSpinner.setBounds(386, 602, 46, 20);
		fruitPanel.add(lemonSpinner);
		
		JLabel label_9 = new JLabel("kg");
		label_9.setBounds(439, 605, 46, 14);
		fruitPanel.add(label_9);
		
		JSpinner bananaSpinner = new JSpinner();
		bananaSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		bananaSpinner.setBounds(116, 602, 46, 20);
		fruitPanel.add(bananaSpinner);
		
		JLabel label_6 = new JLabel("kg");
		label_6.setBounds(169, 605, 46, 14);
		fruitPanel.add(label_6);
		
		JButton bananaButton = new JButton("Add to Cart");
		bananaButton.setFont(new Font("Calibri", Font.BOLD, 18));
		bananaButton.setBounds(87, 570, 119, 24);
		fruitPanel.add(bananaButton);
		
		JLabel lblBanana = new JLabel("Banana");
		lblBanana.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-21-300x300.jpg"));
		lblBanana.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBanana.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanana.setFont(new Font("Calibri", Font.BOLD, 24));
		lblBanana.setBounds(29, 343, 246, 216);
		fruitPanel.add(lblBanana);
		
		JPanel vegetablesPanel = new JPanel();
		vegetablesPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Vegetables", null, vegetablesPanel, null);
		vegetablesPanel.setLayout(null);
		
		JLabel lblCucumber = new JLabel("Cucumber");
		lblCucumber.setBounds(897, 11, 244, 216);
		lblCucumber.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-34-300x300.jpg"));
		lblCucumber.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCucumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblCucumber.setFont(new Font("Calibri", Font.BOLD, 24));
		vegetablesPanel.add(lblCucumber);
		
		JButton cucumberButton = new JButton("Add to Cart");
		cucumberButton.setBounds(962, 237, 119, 31);
		cucumberButton.setFont(new Font("Calibri", Font.BOLD, 18));
		vegetablesPanel.add(cucumberButton);
		
		JLabel label_11 = new JLabel("kg");
		label_11.setBounds(1058, 282, 11, 14);
		vegetablesPanel.add(label_11);
		
		JSpinner cucumberSpinner = new JSpinner();
		cucumberSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		cucumberSpinner.setBounds(1008, 279, 40, 20);
		vegetablesPanel.add(cucumberSpinner);
		
		JLabel lblTomato = new JLabel("Tomato");
		lblTomato.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-38-300x300.jpg"));
		lblTomato.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTomato.setHorizontalAlignment(SwingConstants.CENTER);
		lblTomato.setFont(new Font("Calibri", Font.BOLD, 24));
		lblTomato.setBounds(608, 8, 254, 216);
		vegetablesPanel.add(lblTomato);
		
		JButton tomatoButton = new JButton("Add to Cart");
		tomatoButton.setFont(new Font("Calibri", Font.BOLD, 18));
		tomatoButton.setBounds(683, 234, 119, 31);
		vegetablesPanel.add(tomatoButton);
		
		JSpinner tomatoSpinner = new JSpinner();
		tomatoSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		tomatoSpinner.setBounds(729, 276, 40, 20);
		vegetablesPanel.add(tomatoSpinner);
		
		JLabel label_12 = new JLabel("kg");
		label_12.setBounds(779, 279, 11, 14);
		vegetablesPanel.add(label_12);
		
		JLabel lblPurpleOnion = new JLabel("Purple Onion");
		lblPurpleOnion.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-6-300x300.jpg"));
		lblPurpleOnion.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPurpleOnion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPurpleOnion.setFont(new Font("Calibri", Font.BOLD, 24));
		lblPurpleOnion.setBounds(314, 8, 254, 216);
		vegetablesPanel.add(lblPurpleOnion);
		
		JButton purpleOnionButton = new JButton("Add to Cart");
		purpleOnionButton.setFont(new Font("Calibri", Font.BOLD, 18));
		purpleOnionButton.setBounds(389, 234, 119, 31);
		vegetablesPanel.add(purpleOnionButton);
		
		JSpinner purpleOnionSpinner = new JSpinner();
		purpleOnionSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		purpleOnionSpinner.setBounds(435, 276, 40, 20);
		vegetablesPanel.add(purpleOnionSpinner);
		
		JLabel label_13 = new JLabel("kg");
		label_13.setBounds(485, 279, 11, 14);
		vegetablesPanel.add(label_13);
		
		JLabel lblOnion = new JLabel("Onion");
		lblOnion.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-7-300x300.jpg"));
		lblOnion.setHorizontalTextPosition(SwingConstants.CENTER);
		lblOnion.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnion.setFont(new Font("Calibri", Font.BOLD, 24));
		lblOnion.setBounds(10, 11, 278, 216);
		vegetablesPanel.add(lblOnion);
		
		JButton onionButton = new JButton("Add to Cart");
		onionButton.setFont(new Font("Calibri", Font.BOLD, 18));
		onionButton.setBounds(101, 234, 119, 31);
		vegetablesPanel.add(onionButton);
		
		JSpinner onionSpinner = new JSpinner();
		onionSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		onionSpinner.setBounds(147, 276, 40, 20);
		vegetablesPanel.add(onionSpinner);
		
		JLabel label_14 = new JLabel("kg");
		label_14.setBounds(197, 279, 11, 14);
		vegetablesPanel.add(label_14);
		
		JLabel lblSweetPotato = new JLabel("Sweet Potato");
		lblSweetPotato.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-10-300x300.jpg"));
		lblSweetPotato.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSweetPotato.setHorizontalAlignment(SwingConstants.CENTER);
		lblSweetPotato.setFont(new Font("Calibri", Font.BOLD, 24));
		lblSweetPotato.setBounds(897, 333, 244, 216);
		vegetablesPanel.add(lblSweetPotato);
		
		JButton sweetPotatoButton = new JButton("Add to Cart");
		sweetPotatoButton.setFont(new Font("Calibri", Font.BOLD, 18));
		sweetPotatoButton.setBounds(962, 559, 119, 31);
		vegetablesPanel.add(sweetPotatoButton);
		
		JSpinner sweetPotatoSpinner = new JSpinner();
		sweetPotatoSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		sweetPotatoSpinner.setBounds(1008, 601, 40, 20);
		vegetablesPanel.add(sweetPotatoSpinner);
		
		JLabel label_15 = new JLabel("kg");
		label_15.setBounds(1058, 604, 11, 14);
		vegetablesPanel.add(label_15);
		
		JLabel lblWhiteCabbage = new JLabel("White Cabbage");
		lblWhiteCabbage.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-20-300x300.jpg"));
		lblWhiteCabbage.setHorizontalTextPosition(SwingConstants.CENTER);
		lblWhiteCabbage.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhiteCabbage.setFont(new Font("Calibri", Font.BOLD, 24));
		lblWhiteCabbage.setBounds(618, 320, 244, 229);
		vegetablesPanel.add(lblWhiteCabbage);
		
		JButton whiteCabbageButton = new JButton("Add to Cart");
		whiteCabbageButton.setFont(new Font("Calibri", Font.BOLD, 18));
		whiteCabbageButton.setBounds(683, 559, 119, 31);
		vegetablesPanel.add(whiteCabbageButton);
		
		JSpinner whiteCabbageSpinner = new JSpinner();
		whiteCabbageSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		whiteCabbageSpinner.setBounds(729, 601, 40, 20);
		vegetablesPanel.add(whiteCabbageSpinner);
		
		JLabel label_16 = new JLabel("kg");
		label_16.setBounds(779, 604, 11, 14);
		vegetablesPanel.add(label_16);
		
		JLabel lblEggplant = new JLabel("Eggplant");
		lblEggplant.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-24-300x300.jpg"));
		lblEggplant.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEggplant.setHorizontalAlignment(SwingConstants.CENTER);
		lblEggplant.setFont(new Font("Calibri", Font.BOLD, 24));
		lblEggplant.setBounds(324, 320, 244, 229);
		vegetablesPanel.add(lblEggplant);
		
		JButton eggplantButton = new JButton("Add to Cart");
		eggplantButton.setFont(new Font("Calibri", Font.BOLD, 18));
		eggplantButton.setBounds(389, 559, 119, 31);
		vegetablesPanel.add(eggplantButton);
		
		JSpinner eggplantSpinner = new JSpinner();
		eggplantSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		eggplantSpinner.setBounds(435, 601, 40, 20);
		vegetablesPanel.add(eggplantSpinner);
		
		JLabel label_17 = new JLabel("kg");
		label_17.setBounds(485, 604, 11, 14);
		vegetablesPanel.add(label_17);
		
		JLabel lblCorn = new JLabel("Corn");
		lblCorn.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-71-300x300.jpg"));
		lblCorn.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCorn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorn.setFont(new Font("Calibri", Font.BOLD, 24));
		lblCorn.setBounds(35, 327, 267, 229);
		vegetablesPanel.add(lblCorn);
		
		JButton cornButton = new JButton("Add to Cart");
		cornButton.setFont(new Font("Calibri", Font.BOLD, 18));
		cornButton.setBounds(113, 559, 119, 31);
		vegetablesPanel.add(cornButton);
		
		JSpinner cornSpinner = new JSpinner();
		cornSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		cornSpinner.setBounds(159, 601, 40, 20);
		vegetablesPanel.add(cornSpinner);
		
		JLabel label_18 = new JLabel("kg");
		label_18.setBounds(209, 604, 11, 14);
		vegetablesPanel.add(label_18);
	}
}
