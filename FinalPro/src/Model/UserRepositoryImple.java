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
	//	for (customer custo : users) {
		//		System.out.println(custo.toString());
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
		this.users.add(user);		
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
			for(MarkoliaUser user: users) {
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
		System.out.println("infunctino");
		for (MarkoliaUser markoliaUser : users) {
			System.out.println("inlop");
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
		markoliaUser.toString();	
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
			//if(((markoliaUser.getQustion()).contains(qustion)) )	{					
			//	if((markoliaUser.getAnswer()).contains(answer)) {
					writeToFile();
					return(markoliaUser.getPasswordUser());										
				}
				
				}					
			//}
		//}
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





	





}