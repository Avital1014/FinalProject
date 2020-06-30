package Model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class products implements Serializable {
	 
//	private Set<products> productsList = new HashSet<products>() ; //Wont return duplicate names
	String productName;
	String productPrice;
	int quantity;
	
	
	
	public products(String productName, String productPrice, int spinner_value) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public products(String productName, String productPrice) {
				
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}	
	

	public String toString() {

		 return "product [name=" + productName + ", price=" + productPrice + "]";
		 		
	}
	public String printProducts() {

		 return "product [name=" + productName + ", Product quantity= " + quantity +  ", price=" + productPrice + "]" + "\n";
		 		
	}

	public String getProductName() {
		return productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(String productPrice) {
		System.out.println("new price is " + productPrice);
		this.productPrice = productPrice;
	}
	
}


