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



import java.lang.Exception;

public class UserRepositoryImple implements UserRepository {

	
	
	private final String fILENAME= "Users";
	private Set<MarkoliaUser> users = new HashSet<MarkoliaUser>() ; //Wont return duplicate names
	
	
	@SuppressWarnings("unchecked")
	public UserRepositoryImple() {
		try {
			//System.out.println("into class");
			@SuppressWarnings("resource")
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fILENAME));
			this.users = (Set<MarkoliaUser>) objectInputStream.readObject();
			//System.out.println("size = "+users.size());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	@Override
	public boolean addNewUser(MarkoliaUser user) throws Exception {
		int flag = 0;
		if (user == null) {			
			throw new Exception("User must have a value");		
		}
		if ( users.contains(user.getUser_id())) {
			throw new Exception("This User already exists");
		}
		this.users.add(user);		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream(fILENAME))) {	
			objectOutputStream.writeObject(users);
			
		}
		return true;	
	}

	@Override
	public boolean findUser(String user_id) throws Exception {
		
		if(users.contains(new MarkoliaUser(user_id))) {
			for(MarkoliaUser user: users) {
				System.out.println(user.getUser_id());
				if(user.getUser_id()==user_id)
			//		System.out.println("user found");
					return true;
			}
		}
		else {
			throw new Exception("User not found");
		}
		return true; 
		
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