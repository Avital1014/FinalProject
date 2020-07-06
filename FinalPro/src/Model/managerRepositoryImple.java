package Model;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import Controller.Controller;





public class managerRepositoryImple implements managerRepository {
	
	private final String fILENAME= "Users";
	private final String fileListNme = "productList";
	private final String orderString = "customersOrder";
	private Set<customer> users = new HashSet<customer>();
	private Set<products> productslist = new HashSet<products>();
	ArrayList<customer> customerOorders = new ArrayList<customer>();
	//private Set<customer> customerOorders = new HashSet<customer>();
	static ObjectInputStream objectInputStream1;
	
		@SuppressWarnings("unchecked")
		public managerRepositoryImple() {
			
			for (customer customer : customerOorders) {
				
				customer.printCustomerOrder();
			}
			
			this.users = UserRepositoryImple.getUsers();
			try {
				@SuppressWarnings("resource")
				ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream(fileListNme));
				this.productslist = (Set<products>) objectInputStream1.readObject();
			
				
			} catch (Exception e) {
				System.out.println("Failed to read produt");			}
			
			
			try {
				@SuppressWarnings("resource")
				
				ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(orderString));
				this.customerOorders = (ArrayList<customer>) objectInputStream2.readObject();
				for (customer customer : customerOorders) {
					System.out.println("1");
					System.out.println(customer.printCustomerOrder());
				}
				
			} catch (Exception e) {
				System.out.println("Failed");			}	
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
	public void exportOrderToTXT(File path) {
		try {
			 DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			 Calendar calobj = Calendar.getInstance();
			 //System.out.println(df.format(calobj.getTime()));
			 
			 FileWriter myWriter = new FileWriter(path+".txt");
			 myWriter.write("User Orders for " + df.format(calobj.getTime()) + "\n");
			 for (customer customer : customerOorders) {
				 myWriter.write(customer.printCustomerOrder() + "\n");
			}
			 myWriter.write("Total Users orders = " + customerOorders.size());
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    
		      
		} catch (Exception e) {
			 System.out.println("An error occurred.");
		      e.printStackTrace();
		}

		
	}


	@Override
	public void exportSpecifcUser(File path, String id) {
		try {
			 DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			 Calendar calobj = Calendar.getInstance();			 
			 FileWriter myWriter = new FileWriter(path+".txt");
			 myWriter.write("User Details update for " + df.format(calobj.getTime()) + "\n");
			 for (customer customer : users) {
				 if(customer.getUser_id().equals(id)) {
				 myWriter.write(customer.toString() + "\n");
				 break;
				 }
			}
			 myWriter.write("Total Users orders = " + customerOorders.size());
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    
		      
		} catch (Exception e) {
			 System.out.println("An error occurred.");
		      e.printStackTrace();
		}

		
	}


	@Override
	public void writeOrder(String name, String user_id, String emailUser, String value) throws IOException {
		/*Builder pattern*/
		customer temp = customer.builder()
				.fullName(name).user_id(user_id).emailUser(emailUser).customerOrder(value)
				.build();
			
		
		boolean Flag = true;
		for (customer customer : customerOorders) {
			if((customer.getUser_id()).equals(user_id)) {
				String string = customer.getCustomerOrder(); 
				double one = Double.parseDouble(string);				
				double two = Double.parseDouble(value);
				double doublevString = one + two;
				customer.setCustomerOrder(String.valueOf(doublevString));
				Flag = false;
			}
		}
		
		if(Flag) {
		customerOorders.add(temp);
		}
		
		writeToObjectFile();
		
		
	
	}


	private userBuilder emailUser(String emailUser) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void writeToObjectFile(List list) throws IOException {
		try(ObjectOutputStream objectOutputStream3 = new ObjectOutputStream (new FileOutputStream(orderString))) {	
			objectOutputStream3.writeObject(list);
			System.out.println("i am here");
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


	@Override
	public void writeToObjectFile() throws IOException {
		try(ObjectOutputStream objectOutputStream3 = new ObjectOutputStream (new FileOutputStream(orderString))) {	
			objectOutputStream3.writeObject(customerOorders);
			for (customer customer : customerOorders) {
				System.out.println("2");
				System.out.println(customer.printCustomerOrder());
			}
			System.out.println("now");
		}
		
	}


	@Override
	public void writeOrder(String name, String user_id, String emailUser, String value, String creditCard, String exp,
			String address, String cardHolder) throws IOException {
		// TODO Auto-generated method stub
		
	}


	}





