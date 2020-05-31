package MarkoliaPackage;
//import java.awt.HeadlessException;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class MarkoliaView extends JFrame {

	final JLabel welcomeLabel = new JLabel("Welcome to Markolia");
	private JButton creatNewUser = new JButton("Sign up");
	private JButton signIn = new JButton("Sign in");
	private JLabel image = new JLabel();
	private BufferedImage image1label;

	public MarkoliaView() {

		JFrame MarkoliaFirstView = new JFrame("Login Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarkoliaFirstView.setSize(350, 300);
		welcomeLabel.setForeground(Color.white);
		welcomeLabel.setBounds(100, 10, 200, 50);
		MarkoliaFirstView.add(welcomeLabel);
		creatNewUser.setBounds(50, 50, 100, 50);
		MarkoliaFirstView.add(creatNewUser);
		signIn.setBounds(160, 50, 100, 50);
		MarkoliaFirstView.add(signIn);

		try {
			image1label = ImageIO.read(new File(
					"C:\\Users\\avital.abramov\\eclipse-workspace\\Markolia_final\\src\\MarkoliaPackage\\vegetables.jpg"));
		} catch (IOException ex) {
			System.out.println("not found");
		}
		image = new JLabel(new ImageIcon(image1label));

		image.setBounds(0, 0, 350, 300);

		MarkoliaFirstView.add(image);

		MarkoliaFirstView.setLayout(null);
		MarkoliaFirstView.setVisible(true);

		this.add(MarkoliaFirstView);// must be in the end
	}

	void createNewUSer(ActionListener listenForcreatNewUser) {
		creatNewUser.addActionListener(listenForcreatNewUser);
	}
	
}
