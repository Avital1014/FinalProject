package Drive;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Controller.Controller;
import Model.MarkoliaUser;
import Model.Model;
import Model.customer;
import Model.products;
import View.MarkoliaMainView;
import View.SignUpView;





public class MVCdriver {

	private static String fILENAME= "Users";
	

	@SuppressWarnings("unchecked")
	public static void main(String [] args) throws IOException, ClassNotFoundException  {
		Set<products> products = (Set<products>) new HashSet<products>();
		Set<products> products1 = (Set<products>) new HashSet<products>();
		products.add(new products("Strawberries", "9.5"));
		products.add(new products("Pineapple", "49.8"));
		products.add(new products("Melon", "7.8"));
		products.add(new products("Watermelon", "4.8"));
		products.add(new products("Banana", "11.8"));
		products.add(new products("Lemon", "14.8"));
		products.add(new products("Pink Lady Apple", "18.8"));
		products.add(new products("Peach Pita", "18.8"));
		products.add(new products("Onion", "4.8"));
		products.add(new products("Purple Onion", "7.8"));
		products.add(new products("Tomato", "9.8"));
		products.add(new products("Cucumber", "8.8"));
		products.add(new products("Corn", "24.8"));
		products.add(new products("Eggplant", "8.8"));
		products.add(new products("White Cabbage", "5.8"));
		products.add(new products("Sweet Potato", "16.8"));
		
		
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream("productList"))) {
		//	System.out.println("open file in the main");
			objectOutputStream.writeObject(products);
//		}catch (IOException e) {
	//		e.printStackTrace();
		//}
			
			try {			
				//	@SuppressWarnings("resource")
					ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("productList"));
					products1 = (Set<products>) objectInputStream.readObject();
					
				} catch (Exception e) {
					// TODO: handle exception
				}	
			}
		for (@SuppressWarnings("unused") products products2 : products1) {
			System.out.println(products2.toString());
		}
		
		
		
		/**configuration for General   */
		Model general_Model = new Model();
		MarkoliaMainView general_View = new MarkoliaMainView();
		//MarkoliaController general_Controller = new generalController(general_Model, general_View);
		Controller general_Controller = new Controller(general_Model, general_View);
		general_View.setController(general_Controller);
		general_View.start();
		((Window) general_View).setVisible(true);

	//}
	}
}



