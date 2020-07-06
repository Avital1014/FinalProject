package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



import Controller.Controller;


import java.lang.Exception;

public class UserRepositoryImple implements UserRepository {
	
	private final String fILENAME= "Users";
	private static Set<customer> users = new HashSet<customer>() ; //Wont return duplicate names
	
	static ObjectInputStream objectInputStream;
	
	@SuppressWarnings("unchecked")
	public UserRepositoryImple() {

		try {			
		//	@SuppressWarnings("resource")
			objectInputStream = new ObjectInputStream(new FileInputStream(fILENAME));
			this.users = (Set<customer>) objectInputStream.readObject();
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	public static Set<customer> getUsers(){
	
		return users;
			}
		
		
	
	public static ObjectInputStream sendFile() {

	System.out.println("sendfile");
	return objectInputStream;
	}
	
	@SuppressWarnings({ "unlikely-arg-type", "unused" })
	@Override
	public boolean addNewUser(customer user) throws Exception {
		Boolean flag = false;
		if (user == null) {			
			throw new Exception("User must have a value");		
		}
		
		
			for (customer markoliaUser : users) {
				if((markoliaUser.getUser_id()).contains(user.getUser_id())) {
					System.out.println("found");
					System.out.println(markoliaUser.toString());
					flag = true;	
					System.out.println("flag is "+flag);
									
						}					
				}
		if(flag == true) {
			return false;			
		}
			
		if(flag == true)return false;
		else {
		UserRepositoryImple.users.add(user);		
		try {
			writeToFile();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
		return flag;
			
	}

	@Override
	public boolean findUser(String user_id) throws Exception {
		
		if(users.contains(new MarkoliaUser(user_id))) {
			for(customer user: users) {
				System.out.println(user.getUser_id());
				if(user.getUser_id()==user_id)
					return true;
			}
		}
	
			return false; 
			//throw new Exception("User not found");
	}

	@Override
	public boolean userLoging(String iDString, String passString) {
		boolean flag;

	//	System.out.println("infunctino");
	//	for (MarkoliaUser markoliaUser : users) {
		//	System.out.println("inlop");
			//if((markoliaUser.getUser_id()).equals(iDString)) {

		for (customer markoliaUser : users) {
			if((markoliaUser.getUser_id()).equals(iDString)) {
				if((markoliaUser.getPasswordUser()).equals(passString)) {					

					System.out.println("find");
					return true;
				}
			}
				
			}
		System.out.println("false");
		return false;
	}

	@Override
	public String findNameById(String idString) {
		for (MarkoliaUser markoliaUser : users) {
			if(((markoliaUser.getUser_id()).contains(idString)) )	{				
				return markoliaUser.getFullName();	
					}					
			}
		return "Name none avilabile";
	
	}
	
	@Override
	public String findEmailById(String idString) {
		for (MarkoliaUser markoliaUser : users) {
			if(((markoliaUser.getUser_id()).contains(idString)) )	{				
				return markoliaUser.getEmailUser();	
					}					
			}
		return "Name none avilabile";
	
	}
	

	@Override
	public boolean findID(String id) {
		for (MarkoliaUser markoliaUser : users) {
			if(((markoliaUser.getUser_id()).contains(id)) )	{				
				return true;	
					}					
			}
		return false;
	}
	
	
	@Override
	public boolean changePass(String id, String newPass) throws IOException {
		for (MarkoliaUser markoliaUser : users) {
			if(((markoliaUser.getUser_id()).contains(id)) )	{	
				System.out.println("current pass = " + markoliaUser.getPasswordUser());
				markoliaUser.setPasswordUser(newPass);
				System.out.println("new pass = " + markoliaUser.getPasswordUser());
				writeToFile();
				return true;
					}					
			}
		return false;
	}

	
	@Override
	public void printAllUser() {
		for (MarkoliaUser markoliaUser : users) {
		System.out.println(markoliaUser.toString());	
		}
		
	}

	
	@Override
	public void writeToFile() throws IOException {
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream(fILENAME))) {	
			objectOutputStream.writeObject(users);
			
		}
	}

	@Override
	public String forgotPassword(String qustion, String answer, String id) throws IOException {
		for (MarkoliaUser markoliaUser : users) {
			if(((markoliaUser.getUser_id()).contains(id))) {
		
					writeToFile();
					return(markoliaUser.getPasswordUser());										
				}
				
				}					

		return null;
	}

	@Override
	public Set<MarkoliaUser> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<MarkoliaUser> findByname(String userName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString(MarkoliaUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUserInfo() throws IOException {
		for (customer customerToEdit : users) {
			if(((customerToEdit.getUser_id()).contains(Controller.currentUser.getUser_id())) )	{					
				Controller.currentUser.setCreditCard(customerToEdit.getCreditCard());
				Controller.currentUser.setExp(customerToEdit.getExp());
				Controller.currentUser.setCardHolder(customerToEdit.getCardHolder());
				Controller.currentUser.setPhone(customerToEdit.getPhone());
				Controller.currentUser.setCity(customerToEdit.getCity());
				Controller.currentUser.setApartement(customerToEdit.getApartement());
				Controller.currentUser.setZipCode(customerToEdit.getZipCode());
				Controller.currentUser.setAddress(customerToEdit.getAddress());
				writeToFile();				
					}					
			}
		
		
	}

	@Override
	public void saveCurrentTofile() throws IOException {
		for (customer customer : users) {
			if(((customer.getUser_id()).contains(Controller.currentUser.getUser_id()))) {
				customer.setAddress(Controller.currentUser.getAddress());
				customer.setCardHolder(Controller.currentUser.getCardHolder());
				customer.setPhone(Controller.currentUser.getPhone());
				customer.setCreditCard(Controller.currentUser.getCreditCard());
				customer.setCity(Controller.currentUser.getCity());
				customer.setZipCode(Controller.currentUser.getZipCode());
				customer.setApartement(Controller.currentUser.getApartement());
				writeToFile();
															
				}
				
				}				
		
	}





	





}