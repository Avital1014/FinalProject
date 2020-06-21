package View;
import java.util.ArrayList;
import java.util.HashMap;
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

public class Shopping_cart extends JFrame {

	private JPanel contentPane;
	private JTextField pineappleCost;
	private String pineapple_spinner_value;
	private String strawberries_spinner_value;
	private String melon_spinner_value;
	private String watermelon_spinner_value;
	private String banana_spinner_value;
	private String lemon_spinner_value;
	private String peachPita_spinner_value;
	private String pinkLady_spinner_value;
	HashMap<String, String> cart_productsHashMap= new HashMap<String, String>();
	//ArrayList<String> productCartArrayList = new ArrayList<String>();
	private JTextField strawberriesCost;
	private JTextField melonCost;
	private JTextField watemelonCost;
	private JTextField bananaCost;
	private JTextField lemonCost;
	private JTextField pinkLadyCost;
	private JTextField peachPitaCost;
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
		fruitPanel.setBorder(null);
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
		watermelonButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cart_productsHashMap.put("Watermelon", watermelon_spinner_value);

			}
		});
		watermelonButton.setFont(new Font("Calibri", Font.BOLD, 18));
		watermelonButton.setBounds(933, 291, 146, 24);
		fruitPanel.add(watermelonButton);
		
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
				cart_productsHashMap.put("Melon", melon_spinner_value);
			}
		});
		melonButton.setFont(new Font("Calibri", Font.BOLD, 18));
		melonButton.setBounds(637, 291, 146, 24);
		fruitPanel.add(melonButton);
		
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
				cart_productsHashMap.put("Pineapple", pineapple_spinner_value);
				//System.out.printf("The value= %s", pineapple_spinner_value );
				
				
			}
		});
		pineappleButton.setFont(new Font("Calibri", Font.BOLD, 18));
		pineappleButton.setBounds(373, 291, 146, 24);
		fruitPanel.add(pineappleButton);
		
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
					cart_productsHashMap.put("Strawberries", strawberries_spinner_value);
				}
			});
			strawberriesbButton.setFont(new Font("Calibri", Font.BOLD, 18));
			strawberriesbButton.setBounds(87, 291, 145, 24);
			fruitPanel.add(strawberriesbButton);
			
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
			
			JButton peachPitaButton = new JButton("Add to Cart");
			peachPitaButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cart_productsHashMap.put("Peach Pita", peachPita_spinner_value);
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
			
			JButton pinkLadyButton = new JButton("Add to Cart");
			pinkLadyButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cart_productsHashMap.put("Pink Lady Apple", pinkLady_spinner_value);
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
			
			JButton lemonButton = new JButton("Add to Cart");
			lemonButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cart_productsHashMap.put("Lemon", lemon_spinner_value);
				}
			});
			lemonButton.setFont(new Font("Calibri", Font.BOLD, 18));
			lemonButton.setBounds(361, 600, 147, 24);
			fruitPanel.add(lemonButton);
			
			JButton bananaButton = new JButton("Add to Cart");
			bananaButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cart_productsHashMap.put("Banana", banana_spinner_value);
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
			
			JLabel label_3 = new JLabel("\u20AA");
			label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_3.setBounds(510, 267, 35, 17);
			fruitPanel.add(label_3);
			
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
			
			JLabel label_10 = new JLabel("\u20AA");
			label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_10.setBounds(231, 267, 35, 17);
			fruitPanel.add(label_10);
			
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
			
			JLabel label_19 = new JLabel("\u20AA");
			label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_19.setBounds(781, 267, 35, 17);
			fruitPanel.add(label_19);
			
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
			
			JLabel label_21 = new JLabel("\u20AA");
			label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_21.setBounds(1078, 267, 35, 17);
			fruitPanel.add(label_21);
			
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
			
			JLabel label_22 = new JLabel("\u20AA");
			label_22.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_22.setBounds(231, 572, 35, 17);
			fruitPanel.add(label_22);
			
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
			
			JLabel label_23 = new JLabel("\u20AA");
			label_23.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_23.setBounds(505, 572, 35, 17);
			fruitPanel.add(label_23);
			
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
			
			JLabel label_24 = new JLabel("\u20AA");
			label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_24.setBounds(781, 572, 35, 17);
			fruitPanel.add(label_24);
			
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
		
		JButton cucumberButton = new JButton("Add to Cart");
		cucumberButton.setBounds(962, 237, 148, 31);
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
		tomatoButton.setBounds(683, 234, 148, 31);
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
		purpleOnionButton.setBounds(389, 234, 148, 31);
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
		onionButton.setBounds(101, 234, 148, 31);
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
		sweetPotatoButton.setBounds(962, 559, 148, 31);
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
		whiteCabbageButton.setBounds(683, 559, 148, 31);
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
		eggplantButton.setBounds(389, 559, 148, 31);
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
		cornButton.setBounds(101, 559, 148, 31);
		vegetablesPanel.add(cornButton);
		
		JSpinner cornSpinner = new JSpinner();
		cornSpinner.setModel(new SpinnerListModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7"}));
		cornSpinner.setBounds(159, 601, 40, 20);
		vegetablesPanel.add(cornSpinner);
		
		JLabel label_18 = new JLabel("kg");
		label_18.setBounds(209, 604, 11, 14);
		vegetablesPanel.add(label_18);
		
		JButton finishShopButton = new JButton("Finish the shopping,\r\nand proceed to Summary");
		finishShopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(cart_productsHashMap);
			}
		});
		finishShopButton.setFont(new Font("Calibri", Font.BOLD, 18));
		finishShopButton.setBounds(389, 684, 401, 61);
		vegetablesPanel.add(finishShopButton);
		
		JPanel summaryPanel = new JPanel();
		tabbedPane.addTab("Summary", null, summaryPanel, null);
		
		JList summaryList = new JList();
		summaryList.setValueIsAdjusting(true);
		summaryList.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		summaryPanel.add(summaryList);
	}
}
