package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.Document;

public class managerRepositoryImple implements managerRepository{
	
	private final String fILENAME= "Users";
	private final String fileListNme = "productList";
	//String eXPORT_FILE_NAME = "C:\\Users\\eladb\\Desktop\\elad.txt";
	private Set<customer> users = new HashSet<customer>();
	//private Set<products> productsList = new HashSet<products>();
	private Set<products> productslist = new HashSet<products>();
	static ObjectInputStream objectInputStream1;
		
		@SuppressWarnings("unchecked")
		public managerRepositoryImple() {
			
			this.users = UserRepositoryImple.getUsers();
			try {
				@SuppressWarnings("resource")
				ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream(fileListNme));
				this.productslist = (Set<products>) objectInputStream1.readObject();
			
				
			} catch (Exception e) {
				System.out.println("Failed to read produt");			}		
		}
		
			
	 @Override
		public void exportUsersList(File path) {
		 try {
			 DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			 Calendar calobj = Calendar.getInstance();
			 //System.out.println(df.format(calobj.getTime()));
			 
			 FileWriter myWriter = new FileWriter(path+".txt");
			 myWriter.write("User Lisr for " + df.format(calobj.getTime()) + "\n");
			 for (customer customer : users) {
				 myWriter.write(customer.toString() + "\n");
			}
			 myWriter.write("Total Users = " + users.size());
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    
		      
		} catch (Exception e) {
			 System.out.println("An error occurred.");
		      e.printStackTrace();
		}

		 
		}


	 
	 
	 

	@Override
	public void writeToFIleproductslist(Set<products> productslist) throws FileNotFoundException, IOException {
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream("productList"))) {	
			
			objectOutputStream.writeObject(productslist);
			
		}
		
	}


	@Override
	public Set<products> getProductsList() {
		return this.productslist;
		
	}


	@Override
	public void exportUsersList() {
		// TODO Auto-generated method stub
		
	}


}
