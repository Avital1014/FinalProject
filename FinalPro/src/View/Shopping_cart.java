package View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import javax.xml.catalog.Catalog;
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
import com.sun.source.doctree.SummaryTree;


import java.awt.Window.Type;
import java.awt.Frame;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.util.List;
public class Shopping_cart extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final JTextArea Cart_list = null;
	private JPanel contentPane;
	private JTextField pineappleCost;
	private double pineappleCost_int;
	private String pineapple_spinner_value;
	private String strawberries_spinner_value;
	private String melon_spinner_value;
	private String watermelon_spinner_value;
	private String banana_spinner_value;
	private String lemon_spinner_value;
	private String peachPita_spinner_value;
	private String pinkLady_spinner_value;
	private String onion_spinner_value;
	private String purpleOnion_spinner_value;
	private String tomato_spinner_value;
	private String cucumber_spinner_value;
	private String corn_spinner_value;
	private String eggplant_spinner_value;
	private String whiteCabbage_spinner_value;
	private String sweetPotato_spinner_value;
	private static String productName;
	private static String spinnerValue;
	private static double productPrice;
	
	HashMap<String, productType> cart_productsHashMap= new HashMap<String, productType>();
	List items = new ArrayList();
	private JTextField strawberriesCost;
	private double strawberriesCost_int;
	private JTextField melonCost;
	private double melonCost_int;
	private JTextField watemelonCost;
	private double watermelonCost_int;
	private JTextField bananaCost;
	private double bananaCost_int;
	private JTextField lemonCost;
	private double lemonCost_int;
	private JTextField pinkLadyCost;
	private double pinkLadyCost_int;
	private JTextField peachPitaCost;
	private double peachPitaCost_int;
	private JTextField onionCost;
	private double onionCost_int;
	private JTextField textField;
	private double purpleOnionCost_int;
	private JTextField tomatoCost;
	private double tomatoCost_int;
	private JTextField cucumberCost;
	private double cucumberCost_int;
	private JTextField cornCost;
	private double cornCost_int;
	private JTextField eggplantCost;
	private double eggplantCost_int;
	private JTextField whiteCabageCost;
	private double whiteCabbageCost_int;
	private JTextField sweetPotatoCost;
	private double sweetPotatoCost_int;
	/**
	 * Launch the application.
	 */
	
	private static class productType{
		productType(String name, String value, double watermelonCost_int){
			 productName = name;
			 spinnerValue = value;
			 productPrice = watermelonCost_int;
		}
	}
	  
	
	
	public static String getProductName(String keyString) {
		return productName;
	}

	public static String getSpinnerValue(String keyString) {
		return spinnerValue;
	}

	public static double getProductPrice(String keyString) {
		return productPrice;
	}

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
		fruitPanel.setBorder(null);
		fruitPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Fruits", null, fruitPanel, null);
		fruitPanel.setLayout(null);
		
		/**
		 * Watermelon- Button 
		 */
		
		JLabel lblNewLabel = new JLabel("Watermelon");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\download.jpg"));
		lblNewLabel.setBounds(875, 8, 226, 216);
		fruitPanel.add(lblNewLabel);
		
		JButton watermelonButton = new JButton("Add to Cart");
		watermelonButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("00", new productType("Watermelon", watermelon_spinner_value, watermelonCost_int));

			}
		});
		watermelonButton.setFont(new Font("Calibri", Font.BOLD, 18));
		watermelonButton.setBounds(933, 291, 146, 24);
		fruitPanel.add(watermelonButton);
		
		
		/**
		 * Melon- Button
		 */ 
		
		JLabel label = new JLabel("Melon");
		label.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-34-300x300.jpg"));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.BOLD, 24));
		label.setBounds(579, 8, 237, 216);
		fruitPanel.add(label);
		
		JButton melonButton = new JButton("Add to Cart");
		melonButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("01", new productType("Melon", melon_spinner_value,melonCost_int));
			}
		});
		
		melonButton.setFont(new Font("Calibri", Font.BOLD, 18));
		melonButton.setBounds(637, 291, 146, 24);
		fruitPanel.add(melonButton);
		
		/**
		 * Pineapple- Button 
		 */
		
		JLabel label_2 = new JLabel("Pineapple");
		label_2.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-12-300x300.jpg"));
		label_2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Calibri", Font.BOLD, 24));
		label_2.setBounds(337, 3, 182, 227);
		fruitPanel.add(label_2);
		
		JButton pineappleButton = new JButton("Add to Cart");
		pineappleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("02", new productType("Pineapple", pineapple_spinner_value,pineappleCost_int));
				
			}
		});
		pineappleButton.setFont(new Font("Calibri", Font.BOLD, 18));
		pineappleButton.setBounds(373, 291, 146, 24);
		fruitPanel.add(pineappleButton);
		
		/**
		 * Pineapple- Spinner 
		 */
		
		JSpinner pineappleSpinner = new JSpinner();
		pineappleSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 pineapple_spinner_value =  (String) pineappleSpinner.getValue();
				
			}
		});
		
			pineappleSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
			pineappleSpinner.setModel(new SpinnerListModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
			pineappleSpinner.setBounds(373, 256, 56, 28);
			fruitPanel.add(pineappleSpinner);
			
			/**
			 * Strawberries- Button
			 */
			
			JLabel label_4 = new JLabel("Strawberries");
			label_4.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\strawberry-300x300.jpg"));
			label_4.setHorizontalTextPosition(SwingConstants.CENTER);
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setFont(new Font("Calibri", Font.BOLD, 24));
			label_4.setBounds(31, 3, 265, 227);
			fruitPanel.add(label_4);
			
			JButton strawberriesbButton = new JButton("Add to Cart");
			strawberriesbButton.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					cart_productsHashMap.put("03", new productType("Strawberries", strawberries_spinner_value,strawberriesCost_int ));
				}
			});
			strawberriesbButton.setFont(new Font("Calibri", Font.BOLD, 18));
			strawberriesbButton.setBounds(87, 291, 145, 24);
			fruitPanel.add(strawberriesbButton);
			
			/**
			 * Strawberries- Spinner
			 */
			
			JSpinner strwaberriesSpinner = new JSpinner();
			strwaberriesSpinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					strawberries_spinner_value= (String) strwaberriesSpinner.getValue();
				}
			});
			
			strwaberriesSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
			strwaberriesSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
			strwaberriesSpinner.setBounds(87, 255, 56, 28);
			fruitPanel.add(strwaberriesSpinner);
			
			JLabel label_5 = new JLabel("kg");
			label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_5.setBounds(143, 261, 46, 28);
			fruitPanel.add(label_5);
			
			
			
			JLabel lblPeachPita = new JLabel("Peach Pita");
			lblPeachPita.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-17-300x300.jpg"));
			lblPeachPita.setHorizontalTextPosition(SwingConstants.CENTER);
			lblPeachPita.setHorizontalAlignment(SwingConstants.CENTER);
			lblPeachPita.setFont(new Font("Calibri", Font.BOLD, 24));
			lblPeachPita.setBounds(875, 343, 246, 216);
			fruitPanel.add(lblPeachPita);
			
			/**
			 * Peach Pita- Button
			 */
			
			JButton peachPitaButton = new JButton("Add to Cart");
			peachPitaButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cart_productsHashMap.put("04", new productType("Peach Pita", peachPita_spinner_value,peachPitaCost_int));
				}
			});
			peachPitaButton.setFont(new Font("Calibri", Font.BOLD, 18));
			peachPitaButton.setBounds(933, 600, 146, 24);
			fruitPanel.add(peachPitaButton);
			
			
			
			JLabel lblRedApple = new JLabel("Pink Lady Apple");
			lblRedApple.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-54-300x300.jpg"));
			lblRedApple.setHorizontalTextPosition(SwingConstants.CENTER);
			lblRedApple.setHorizontalAlignment(SwingConstants.CENTER);
			lblRedApple.setFont(new Font("Calibri", Font.BOLD, 24));
			lblRedApple.setBounds(579, 343, 246, 216);
			fruitPanel.add(lblRedApple);
			
			/**
			 * Pink Lady Apple-Button
			 */
			
			JButton pinkLadyButton = new JButton("Add to Cart");
			pinkLadyButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cart_productsHashMap.put("05", new productType("Pink Lady Apple", pinkLady_spinner_value,peachPitaCost_int));
				}
			});
			pinkLadyButton.setFont(new Font("Calibri", Font.BOLD, 18));
			pinkLadyButton.setBounds(637, 600, 146, 24);
			fruitPanel.add(pinkLadyButton);
			
			
			JLabel lblLemon = new JLabel("Lemon");
			lblLemon.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-29-300x300.jpg"));
			lblLemon.setHorizontalTextPosition(SwingConstants.CENTER);
			lblLemon.setHorizontalAlignment(SwingConstants.CENTER);
			lblLemon.setFont(new Font("Calibri", Font.BOLD, 24));
			lblLemon.setBounds(299, 343, 246, 216);
			fruitPanel.add(lblLemon);
			

			/**
			 * Lemon- Button
			 */
			
			JButton lemonButton = new JButton("Add to Cart");
			lemonButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cart_productsHashMap.put("06", new productType("Lemon", lemon_spinner_value,lemonCost_int));
				}
			});
			lemonButton.setFont(new Font("Calibri", Font.BOLD, 18));
			lemonButton.setBounds(361, 600, 147, 24);
			fruitPanel.add(lemonButton);
			
			/**
			 * Banana- Button
			 */
			
			JButton bananaButton = new JButton("Add to Cart");
			bananaButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cart_productsHashMap.put("07", new productType("Banana", banana_spinner_value,bananaCost_int));
				}
			});
			bananaButton.setFont(new Font("Calibri", Font.BOLD, 18));
			bananaButton.setBounds(87, 598, 151, 24);
			fruitPanel.add(bananaButton);
			
			JLabel lblBanana = new JLabel("Banana");
			lblBanana.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\frt-21-300x300.jpg"));
			lblBanana.setHorizontalTextPosition(SwingConstants.CENTER);
			lblBanana.setHorizontalAlignment(SwingConstants.CENTER);
			lblBanana.setFont(new Font("Calibri", Font.BOLD, 24));
			lblBanana.setBounds(29, 343, 246, 216);
			fruitPanel.add(lblBanana);
			
			/**
			 * Pineapple-Cost
			 */
			
			pineappleCost = new JTextField();
			pineappleCost.setEditable(false);
			pineappleCost.setForeground(Color.BLACK);
			pineappleCost.setHorizontalAlignment(SwingConstants.CENTER);
			pineappleCost.setBackground(Color.WHITE);
			pineappleCost.setFont(new Font("Calibri", Font.BOLD, 24));
			pineappleCost.setText("49.8");
			pineappleCost.setBounds(439, 255, 69, 29);
			fruitPanel.add(pineappleCost);
			pineappleCost.setColumns(10);
			
			String pineapple_textString = pineappleCost.getText();
			pineappleCost_int = Double.parseDouble(pineapple_textString);
			 
			JLabel label_3 = new JLabel("\u20AA");
			label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_3.setBounds(510, 267, 35, 17);
			fruitPanel.add(label_3);
			
			/**
			 * Strawberries Cost
			 */
			
			strawberriesCost = new JTextField();
			strawberriesCost.setText("9.5");
			strawberriesCost.setHorizontalAlignment(SwingConstants.CENTER);
			strawberriesCost.setForeground(Color.BLACK);
			strawberriesCost.setFont(new Font("Calibri", Font.BOLD, 24));
			strawberriesCost.setEditable(false);
			strawberriesCost.setColumns(10);
			strawberriesCost.setBackground(Color.WHITE);
			strawberriesCost.setBounds(163, 256, 69, 29);
			fruitPanel.add(strawberriesCost);
			strawberriesCost.toString();
			
			String strawberries_textString = strawberriesCost.getText();
			 strawberriesCost_int = Double.parseDouble(strawberries_textString);
			
			JLabel label_10 = new JLabel("\u20AA");
			label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_10.setBounds(231, 267, 35, 17);
			fruitPanel.add(label_10);
			

			/**
			 * Melon- Spinner
			 */
			
			JSpinner melonSpinner = new JSpinner();
			melonSpinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					melon_spinner_value= (String) melonSpinner.getValue();
				}
			});
			melonSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
			melonSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
			melonSpinner.setBounds(639, 256, 56, 28);
			fruitPanel.add(melonSpinner);
			
			JLabel label_1 = new JLabel("kg");
			label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_1.setBounds(694, 261, 46, 28);
			fruitPanel.add(label_1);
			
			/**
			 * Melon- Cost
			 */
			
			melonCost = new JTextField();
			melonCost.setText("7.8");
			melonCost.setHorizontalAlignment(SwingConstants.CENTER);
			melonCost.setForeground(Color.BLACK);
			melonCost.setFont(new Font("Calibri", Font.BOLD, 24));
			melonCost.setEditable(false);
			melonCost.setColumns(10);
			melonCost.setBackground(Color.WHITE);
			melonCost.setBounds(713, 256, 69, 29);
			fruitPanel.add(melonCost);
			
			String melon_textString = melonCost.getText();
			 melonCost_int = Double.parseDouble(melon_textString);
			 
			JLabel label_19 = new JLabel("\u20AA");
			label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_19.setBounds(781, 267, 35, 17);
			fruitPanel.add(label_19);
			
			/**
			 * Watermelon- Spinner
			 */
			
			JSpinner watermelonSpinner = new JSpinner();
			watermelonSpinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					watermelon_spinner_value =  (String) watermelonSpinner.getValue();
				}
			});
			watermelonSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
			watermelonSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
			watermelonSpinner.setBounds(933, 256, 56, 28);
			fruitPanel.add(watermelonSpinner);
			
			JLabel label_20 = new JLabel("kg");
			label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_20.setBounds(988, 261, 46, 28);
			fruitPanel.add(label_20);
			
			/**
			 * Watermelon Cost
			 */
			
			watemelonCost = new JTextField();
			watemelonCost.setText("4.8");
			watemelonCost.setHorizontalAlignment(SwingConstants.CENTER);
			watemelonCost.setForeground(Color.BLACK);
			watemelonCost.setFont(new Font("Calibri", Font.BOLD, 24));
			watemelonCost.setEditable(false);
			watemelonCost.setColumns(10);
			watemelonCost.setBackground(Color.WHITE);
			watemelonCost.setBounds(1010, 256, 69, 29);
			fruitPanel.add(watemelonCost);
			
			String watermelon_textString = watemelonCost.getText();
			 watermelonCost_int = Double.parseDouble(watermelon_textString);
			 
			JLabel label_21 = new JLabel("\u20AA");
			label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_21.setBounds(1078, 267, 35, 17);
			fruitPanel.add(label_21);
			

			/**
			 * Banana- Spinner
			 */
			
			JSpinner bananaSpinner = new JSpinner();
			bananaSpinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					banana_spinner_value =  (String) bananaSpinner.getValue();
				}
				
			});
			bananaSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
			bananaSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
			bananaSpinner.setBounds(87, 560, 56, 28);
			fruitPanel.add(bananaSpinner);
			
			JLabel label_6 = new JLabel("kg");
			label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_6.setBounds(143, 566, 46, 28);
			fruitPanel.add(label_6);
			
			/**
			 * Banana Cost
			 */
			
			bananaCost = new JTextField();
			bananaCost.setText("11.8");
			bananaCost.setHorizontalAlignment(SwingConstants.CENTER);
			bananaCost.setForeground(Color.BLACK);
			bananaCost.setFont(new Font("Calibri", Font.BOLD, 24));
			bananaCost.setEditable(false);
			bananaCost.setColumns(10);
			bananaCost.setBackground(Color.WHITE);
			bananaCost.setBounds(163, 561, 69, 29);
			fruitPanel.add(bananaCost);
			
			String banana_textString = bananaCost.getText();
			 bananaCost_int = Double.parseDouble(banana_textString);
			 
			JLabel label_22 = new JLabel("\u20AA");
			label_22.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_22.setBounds(231, 572, 35, 17);
			fruitPanel.add(label_22);
			

			/**
			 * Lemon- Spinner
			 */
			
			JSpinner lemonSpinner = new JSpinner();
			lemonSpinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					lemon_spinner_value =  (String) lemonSpinner.getValue();
				}
			});
			lemonSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
			lemonSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
			lemonSpinner.setBounds(361, 560, 56, 28);
			fruitPanel.add(lemonSpinner);
			
			JLabel label_9 = new JLabel("kg");
			label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_9.setBounds(417, 566, 46, 28);
			fruitPanel.add(label_9);
			
			/**
			 * Lemon- Cost
			 */
			
			lemonCost = new JTextField();
			lemonCost.setText("14.8");
			lemonCost.setHorizontalAlignment(SwingConstants.CENTER);
			lemonCost.setForeground(Color.BLACK);
			lemonCost.setFont(new Font("Calibri", Font.BOLD, 24));
			lemonCost.setEditable(false);
			lemonCost.setColumns(10);
			lemonCost.setBackground(Color.WHITE);
			lemonCost.setBounds(437, 561, 69, 29);
			fruitPanel.add(lemonCost);
			
			String lemon_textString = lemonCost.getText();
			 lemonCost_int = Double.parseDouble(lemon_textString);
			 
			JLabel label_23 = new JLabel("\u20AA");
			label_23.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_23.setBounds(505, 572, 35, 17);
			fruitPanel.add(label_23);
			

			/**
			 * Pink Lady Spinner
			 */
			
			JSpinner pinkLadySpinner = new JSpinner();
			pinkLadySpinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					pinkLady_spinner_value =  (String) pinkLadySpinner.getValue();
				}
			});
			pinkLadySpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
			pinkLadySpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
			pinkLadySpinner.setBounds(637, 560, 56, 28);
			fruitPanel.add(pinkLadySpinner);
			
			JLabel label_8 = new JLabel("kg");
			label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_8.setBounds(693, 566, 46, 28);
			fruitPanel.add(label_8);
			
			/**
			 * Pink Lady Cost 
			 */
			
			pinkLadyCost = new JTextField();
			pinkLadyCost.setText("18.8");
			pinkLadyCost.setHorizontalAlignment(SwingConstants.CENTER);
			pinkLadyCost.setForeground(Color.BLACK);
			pinkLadyCost.setFont(new Font("Calibri", Font.BOLD, 24));
			pinkLadyCost.setEditable(false);
			pinkLadyCost.setColumns(10);
			pinkLadyCost.setBackground(Color.WHITE);
			pinkLadyCost.setBounds(713, 561, 69, 29);
			fruitPanel.add(pinkLadyCost);
			
			String pinkLadyApple_textString = pinkLadyCost.getText();
			 pinkLadyCost_int = Double.parseDouble(pinkLadyApple_textString);
			 
			JLabel label_24 = new JLabel("\u20AA");
			label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_24.setBounds(781, 572, 35, 17);
			fruitPanel.add(label_24);
			

			/**
			 * Peach Pita Spinner 
			 */
			
			JSpinner peachPitaSpinner = new JSpinner();
			peachPitaSpinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					peachPita_spinner_value =  (String) peachPitaSpinner.getValue();
				}
			});
			peachPitaSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
			peachPitaSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
			peachPitaSpinner.setBounds(933, 560, 56, 28);
			fruitPanel.add(peachPitaSpinner);
			
			JLabel label_7 = new JLabel("kg");
			label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_7.setBounds(989, 566, 46, 28);
			fruitPanel.add(label_7);
			
			/**
			 * Peach Pita Cost 
			 */
			
			peachPitaCost = new JTextField();
			peachPitaCost.setText("18.8");
			peachPitaCost.setHorizontalAlignment(SwingConstants.CENTER);
			peachPitaCost.setForeground(Color.BLACK);
			peachPitaCost.setFont(new Font("Calibri", Font.BOLD, 24));
			peachPitaCost.setEditable(false);
			peachPitaCost.setColumns(10);
			peachPitaCost.setBackground(Color.WHITE);
			peachPitaCost.setBounds(1009, 561, 69, 29);
			fruitPanel.add(peachPitaCost);
			
			String peachPita_textString = peachPitaCost.getText();
			 peachPitaCost_int = Double.parseDouble(peachPita_textString);
			 
			JLabel label_25 = new JLabel("\u20AA");
			label_25.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_25.setBounds(1077, 572, 35, 17);
			fruitPanel.add(label_25);
		
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
		
		JLabel lblTomato = new JLabel("Tomato");
		lblTomato.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-38-300x300.jpg"));
		lblTomato.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTomato.setHorizontalAlignment(SwingConstants.CENTER);
		lblTomato.setFont(new Font("Calibri", Font.BOLD, 24));
		lblTomato.setBounds(608, 8, 254, 216);
		vegetablesPanel.add(lblTomato);
		
		JLabel lblPurpleOnion = new JLabel("Purple Onion");
		lblPurpleOnion.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-6-300x300.jpg"));
		lblPurpleOnion.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPurpleOnion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPurpleOnion.setFont(new Font("Calibri", Font.BOLD, 24));
		lblPurpleOnion.setBounds(314, 8, 254, 216);
		vegetablesPanel.add(lblPurpleOnion);
		
		JLabel lblOnion = new JLabel("Onion");
		lblOnion.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-7-300x300.jpg"));
		lblOnion.setHorizontalTextPosition(SwingConstants.CENTER);
		lblOnion.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnion.setFont(new Font("Calibri", Font.BOLD, 24));
		lblOnion.setBounds(10, 11, 278, 216);
		vegetablesPanel.add(lblOnion);
		
		JLabel lblSweetPotato = new JLabel("Sweet Potato");
		lblSweetPotato.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-10-300x300.jpg"));
		lblSweetPotato.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSweetPotato.setHorizontalAlignment(SwingConstants.CENTER);
		lblSweetPotato.setFont(new Font("Calibri", Font.BOLD, 24));
		lblSweetPotato.setBounds(897, 333, 244, 216);
		vegetablesPanel.add(lblSweetPotato);
		
		JLabel lblWhiteCabbage = new JLabel("White Cabbage");
		lblWhiteCabbage.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-20-300x300.jpg"));
		lblWhiteCabbage.setHorizontalTextPosition(SwingConstants.CENTER);
		lblWhiteCabbage.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhiteCabbage.setFont(new Font("Calibri", Font.BOLD, 24));
		lblWhiteCabbage.setBounds(618, 320, 244, 229);
		vegetablesPanel.add(lblWhiteCabbage);
		
		JLabel lblEggplant = new JLabel("Eggplant");
		lblEggplant.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-24-300x300.jpg"));
		lblEggplant.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEggplant.setHorizontalAlignment(SwingConstants.CENTER);
		lblEggplant.setFont(new Font("Calibri", Font.BOLD, 24));
		lblEggplant.setBounds(324, 320, 244, 229);
		vegetablesPanel.add(lblEggplant);
		
		JLabel lblCorn = new JLabel("Corn");
		lblCorn.setIcon(new ImageIcon("C:\\Users\\avital.abramov\\Desktop\\FinalProject\\veg-71-300x300.jpg"));
		lblCorn.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCorn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorn.setFont(new Font("Calibri", Font.BOLD, 24));
		lblCorn.setBounds(35, 327, 267, 229);
		vegetablesPanel.add(lblCorn);
		
		/**
		 * Finish Button
		 */
		
		JButton finishShopButton = new JButton("Finish the shopping,\r\nand proceed to Summary");
		finishShopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(cart_productsHashMap);
				
				//JPanel newSummaryPanel = new JPanel();
				//newSummaryPanel.add(new JLabel("your summary page"));
				//newSummaryPanel.action(, finishShopButton)
				//tabbedPane.addTab("Summary", newSummaryPanel);
				tabbedPane.setSelectedIndex(2);
				
				
			}
		});
		
		finishShopButton.setFont(new Font("Calibri", Font.BOLD, 18));
		finishShopButton.setBounds(389, 684, 401, 61);
		vegetablesPanel.add(finishShopButton);
		
		/**
		 * Onion-Spinner
		 */
		
		JSpinner onionSpinner = new JSpinner();
		onionSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				onion_spinner_value =  (String) onionSpinner.getValue();

			}
		});
		onionSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		onionSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		onionSpinner.setBounds(81, 237, 56, 28);
		vegetablesPanel.add(onionSpinner);
		
		JLabel label_14 = new JLabel("kg");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_14.setBounds(137, 243, 46, 28);
		vegetablesPanel.add(label_14);
		
		/**
		 * Onion Cost 
		 */
		
		onionCost = new JTextField();
		onionCost.setText("4.8");
		onionCost.setHorizontalAlignment(SwingConstants.CENTER);
		onionCost.setForeground(Color.BLACK);
		onionCost.setFont(new Font("Calibri", Font.BOLD, 24));
		onionCost.setEditable(false);
		onionCost.setColumns(10);
		onionCost.setBackground(Color.WHITE);
		onionCost.setBounds(157, 238, 69, 29);
		vegetablesPanel.add(onionCost);
		
		String onion_textString = onionCost.getText();
		 onionCost_int = Double.parseDouble(onion_textString);
		 
		JLabel label_26 = new JLabel("\u20AA");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_26.setBounds(225, 249, 35, 17);
		vegetablesPanel.add(label_26);
		
		/**
		 * Onion Button
		 */
		
		JButton onionButton = new JButton("Add to Cart");
		onionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("08", new productType("Onion", onion_spinner_value,onionCost_int));
			}
		});
		onionButton.setFont(new Font("Calibri", Font.BOLD, 18));
		onionButton.setBounds(81, 273, 145, 24);
		vegetablesPanel.add(onionButton);
		/**
		 * Purple Onion Button 
		 */
		JButton purpleOnionButton = new JButton("Add to Cart");
		purpleOnionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("15", new productType("Purple Onion", purpleOnion_spinner_value,purpleOnionCost_int));
			}
		});
		purpleOnionButton.setFont(new Font("Calibri", Font.BOLD, 18));
		purpleOnionButton.setBounds(358, 273, 145, 24);
		vegetablesPanel.add(purpleOnionButton);
		
		/**
		 * Purple Onion Spinner 
		 */
		
		JSpinner purpleOnionSpinner = new JSpinner();
		purpleOnionSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				purpleOnion_spinner_value =  (String) purpleOnionSpinner.getValue();
			}
		});
		purpleOnionSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		purpleOnionSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		purpleOnionSpinner.setBounds(358, 237, 56, 28);
		vegetablesPanel.add(purpleOnionSpinner);
		
		JLabel label_13 = new JLabel("kg");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBounds(414, 243, 46, 28);
		vegetablesPanel.add(label_13);
		
		/**
		 * Purple Onion Cost
		 */
		
		textField = new JTextField();
		textField.setText("7.8");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Calibri", Font.BOLD, 24));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(434, 238, 69, 29);
		vegetablesPanel.add(textField);
		
		String purpleOnion_textString = textField.getText();
		 purpleOnionCost_int = Double.parseDouble(purpleOnion_textString);
		 
		JLabel label_27 = new JLabel("\u20AA");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_27.setBounds(502, 249, 35, 17);
		vegetablesPanel.add(label_27);
		
		/**
		 * Tomato Button
		 */
		
		JButton tomatoButton = new JButton("Add to Cart");
		tomatoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("09", new productType("Tomato", tomato_spinner_value,tomatoCost_int));
			}
		});
		tomatoButton.setFont(new Font("Calibri", Font.BOLD, 18));
		tomatoButton.setBounds(652, 272, 145, 24);
		vegetablesPanel.add(tomatoButton);
		

		/**
		 * Tomato Spinner
		 */
		
		JSpinner tomatoSpinner = new JSpinner();
		tomatoSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				tomato_spinner_value =  (String) tomatoSpinner.getValue();
			}
		});
		tomatoSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		tomatoSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		tomatoSpinner.setBounds(652, 236, 56, 28);
		vegetablesPanel.add(tomatoSpinner);
		
		JLabel label_12 = new JLabel("kg");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_12.setBounds(708, 242, 46, 28);
		vegetablesPanel.add(label_12);
		
		/**
		 * Tomato cost 
		 */
		
		tomatoCost = new JTextField();
		tomatoCost.setText("9.8");
		tomatoCost.setHorizontalAlignment(SwingConstants.CENTER);
		tomatoCost.setForeground(Color.BLACK);
		tomatoCost.setFont(new Font("Calibri", Font.BOLD, 24));
		tomatoCost.setEditable(false);
		tomatoCost.setColumns(10);
		tomatoCost.setBackground(Color.WHITE);
		tomatoCost.setBounds(728, 237, 69, 29);
		vegetablesPanel.add(tomatoCost);
		
		String tomato_textString = tomatoCost.getText();
		 tomatoCost_int = Double.parseDouble(tomato_textString);
		 
		JLabel label_28 = new JLabel("\u20AA");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_28.setBounds(796, 248, 35, 17);
		vegetablesPanel.add(label_28);
		
		/**
		 * Cucumber Button
		 */
		
		JButton cucumberButton = new JButton("Add to Cart");
		cucumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("10", new productType("Cucumber", cucumber_spinner_value,cucumberCost_int));
			}
		});
		cucumberButton.setFont(new Font("Calibri", Font.BOLD, 18));
		cucumberButton.setBounds(917, 273, 145, 24);
		vegetablesPanel.add(cucumberButton);
		
		/**
		 * Cucumber Spinner
		 */
		
		JSpinner cucumberSpinner = new JSpinner();
		cucumberSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cucumber_spinner_value =  (String) cucumberSpinner.getValue();
			}
		});
		cucumberSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		cucumberSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		cucumberSpinner.setBounds(917, 237, 56, 28);
		vegetablesPanel.add(cucumberSpinner);
		
		JLabel label_11 = new JLabel("kg");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(973, 243, 46, 28);
		vegetablesPanel.add(label_11);
		
		/**
		 * Cucumber Cost
		 */
		
		cucumberCost = new JTextField();
		cucumberCost.setText("8.8");
		cucumberCost.setHorizontalAlignment(SwingConstants.CENTER);
		cucumberCost.setForeground(Color.BLACK);
		cucumberCost.setFont(new Font("Calibri", Font.BOLD, 24));
		cucumberCost.setEditable(false);
		cucumberCost.setColumns(10);
		cucumberCost.setBackground(Color.WHITE);
		cucumberCost.setBounds(993, 238, 69, 29);
		vegetablesPanel.add(cucumberCost);
		
		String cucumber_textString = cucumberCost.getText();
		 cucumberCost_int = Double.parseDouble(cucumber_textString);
		 
		JLabel label_29 = new JLabel("\u20AA");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_29.setBounds(1061, 249, 35, 17);
		vegetablesPanel.add(label_29);
		
		/**
		 * Corn Button
		 */
		
		JButton cornButton = new JButton("Add to Cart");
		cornButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("11", new productType("Corn", corn_spinner_value,cornCost_int));
			}
		});
		cornButton.setFont(new Font("Calibri", Font.BOLD, 18));
		cornButton.setBounds(81, 597, 145, 24);
		vegetablesPanel.add(cornButton);
		
		/**
		 * Corn Spinner
		 */
		
		JSpinner cornSpinner = new JSpinner();
		cornSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				corn_spinner_value =  (String) cornSpinner.getValue();
			}
			
		});
		cornSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		cornSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		cornSpinner.setBounds(81, 561, 56, 28);
		vegetablesPanel.add(cornSpinner);
		
		JLabel label_18 = new JLabel("kg");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_18.setBounds(137, 567, 46, 28);
		vegetablesPanel.add(label_18);
		
		/**
		 * Corn Cost
		 */
		
		cornCost = new JTextField();
		cornCost.setText("24.8");
		cornCost.setHorizontalAlignment(SwingConstants.CENTER);
		cornCost.setForeground(Color.BLACK);
		cornCost.setFont(new Font("Calibri", Font.BOLD, 24));
		cornCost.setEditable(false);
		cornCost.setColumns(10);
		cornCost.setBackground(Color.WHITE);
		cornCost.setBounds(157, 562, 69, 29);
		vegetablesPanel.add(cornCost);
		
		String corn_textString = cornCost.getText();
		 cornCost_int = Double.parseDouble(corn_textString);
		 
		JLabel label_30 = new JLabel("\u20AA");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_30.setBounds(225, 573, 35, 17);
		vegetablesPanel.add(label_30);
		
		/**
		 * Eggplant- Spinner
		 */
		
		JSpinner eggplantSpinner = new JSpinner();
		eggplantSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				eggplant_spinner_value =  (String) eggplantSpinner.getValue();
			}
		});
		eggplantSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		eggplantSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		eggplantSpinner.setBounds(358, 561, 56, 28);
		vegetablesPanel.add(eggplantSpinner);
		
		JLabel label_17 = new JLabel("kg");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_17.setBounds(414, 567, 46, 28);
		vegetablesPanel.add(label_17);
		
		/**
		 * Eggplant Cost
		 */
		
		eggplantCost = new JTextField();
		eggplantCost.setText("8.8");
		eggplantCost.setHorizontalAlignment(SwingConstants.CENTER);
		eggplantCost.setForeground(Color.BLACK);
		eggplantCost.setFont(new Font("Calibri", Font.BOLD, 24));
		eggplantCost.setEditable(false);
		eggplantCost.setColumns(10);
		eggplantCost.setBackground(Color.WHITE);
		eggplantCost.setBounds(434, 562, 69, 29);
		vegetablesPanel.add(eggplantCost);
		
		String eggplant_textString = eggplantCost.getText();
		 eggplantCost_int = Double.parseDouble(eggplant_textString);
		 
		JLabel label_31 = new JLabel("\u20AA");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_31.setBounds(502, 573, 35, 17);
		vegetablesPanel.add(label_31);
		
		/**
		 * Eggplant - Button
		 */
		
		JButton eggplantButton = new JButton("Add to Cart");
		eggplantButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("12", new productType("Eggplant", eggplant_spinner_value,eggplantCost_int));
			}
		});
		
		eggplantButton.setFont(new Font("Calibri", Font.BOLD, 18));
		eggplantButton.setBounds(358, 597, 145, 24);
		vegetablesPanel.add(eggplantButton);
		
		/**
		 * White Cabbage - Spinner 
		 */
		
		JSpinner whiteCabbageSpinner = new JSpinner();
		whiteCabbageSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				whiteCabbage_spinner_value =  (String) whiteCabbageSpinner.getValue();
			}
		});
		whiteCabbageSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		whiteCabbageSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		whiteCabbageSpinner.setBounds(652, 561, 56, 28);
		vegetablesPanel.add(whiteCabbageSpinner);
		
		JLabel label_16 = new JLabel("kg");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_16.setBounds(708, 567, 46, 28);
		vegetablesPanel.add(label_16);
		
		/**
		 * White Cabage-Cost
		 */
		
		whiteCabageCost = new JTextField();
		whiteCabageCost.setText("5.8");
		whiteCabageCost.setHorizontalAlignment(SwingConstants.CENTER);
		whiteCabageCost.setForeground(Color.BLACK);
		whiteCabageCost.setFont(new Font("Calibri", Font.BOLD, 24));
		whiteCabageCost.setEditable(false);
		whiteCabageCost.setColumns(10);
		whiteCabageCost.setBackground(Color.WHITE);
		whiteCabageCost.setBounds(728, 562, 69, 29);
		vegetablesPanel.add(whiteCabageCost);
		
		String whiteCabbage_textString = whiteCabageCost.getText();
		 whiteCabbageCost_int = Double.parseDouble(whiteCabbage_textString);
		 
		JLabel label_32 = new JLabel("\u20AA");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_32.setBounds(796, 573, 35, 17);
		vegetablesPanel.add(label_32);
		
		/**
		 * White Cabbage Button
		 */
		
		JButton whiteCabbageButton = new JButton("Add to Cart");
		whiteCabbageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("13", new productType("White Cabbage", whiteCabbage_spinner_value,whiteCabbageCost_int));

			}
		});
		
		whiteCabbageButton.setFont(new Font("Calibri", Font.BOLD, 18));
		whiteCabbageButton.setBounds(652, 597, 145, 24);
		vegetablesPanel.add(whiteCabbageButton);
		
		/**
		 * Sweet Potato Spinner
		 */
		
		JSpinner sweetPotatoSpinner = new JSpinner();
		sweetPotatoSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				sweetPotato_spinner_value =  (String) sweetPotatoSpinner.getValue();

			}
		});
		sweetPotatoSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		sweetPotatoSpinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		sweetPotatoSpinner.setBounds(935, 561, 56, 28);
		vegetablesPanel.add(sweetPotatoSpinner);
		
		JLabel label_15 = new JLabel("kg");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_15.setBounds(991, 567, 46, 28);
		vegetablesPanel.add(label_15);
		
		/**
		 * Sweet Potato Cost 
		 */
		
		sweetPotatoCost = new JTextField();
		sweetPotatoCost.setText("16.8");
		sweetPotatoCost.setHorizontalAlignment(SwingConstants.CENTER);
		sweetPotatoCost.setForeground(Color.BLACK);
		sweetPotatoCost.setFont(new Font("Calibri", Font.BOLD, 24));
		sweetPotatoCost.setEditable(false);
		sweetPotatoCost.setColumns(10);
		sweetPotatoCost.setBackground(Color.WHITE);
		sweetPotatoCost.setBounds(1011, 562, 69, 29);
		vegetablesPanel.add(sweetPotatoCost);
		
		String sweetPotato_textString = sweetPotatoCost.getText();
		 sweetPotatoCost_int = Double.parseDouble(sweetPotato_textString);
		 
		JLabel label_33 = new JLabel("\u20AA");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_33.setBounds(1079, 573, 35, 17);
		vegetablesPanel.add(label_33);
		
		/**
		 * Sweet Potato Button
		 */
		
		JButton sweetPotatoButton = new JButton("Add to Cart");
		sweetPotatoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("14", new productType("Sweet Potato", sweetPotato_spinner_value,sweetPotatoCost_int));

			}
		});
		
		sweetPotatoButton.setFont(new Font("Calibri", Font.BOLD, 18));
		sweetPotatoButton.setBounds(935, 597, 145, 24);
		vegetablesPanel.add(sweetPotatoButton);
		JPanel Summary_Panel = new JPanel();
		tabbedPane.addTab("Summaryy", null, Summary_Panel, null);
		Summary_Panel.setLayout(null);
		
		JTextArea Cart_list = new JTextArea();
		Cart_list.setBounds(311, 83, 532, 251);
		Summary_Panel.add(Cart_list);
		Cart_list.setLineWrap(true);
		Cart_list.setWrapStyleWord(true);
		Cart_list.setEditable(false);
		tabbedPane.setBackgroundAt(2, Color.WHITE);
		for (String keyString : cart_productsHashMap.keySet()) {
			Cart_list.append("Product:" + keyString + "\n");
			items.add(getProductName(keyString));
			Cart_list.append("Name:" + getProductName(keyString) + "Proce:" + getProductPrice(keyString) + "Value:" + getSpinnerValue(keyString));
		}
		//setResizable(false);
	   // setVisible(true);
	}
}
