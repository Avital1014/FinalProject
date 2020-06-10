package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Set;



public class UserRepositoryImple implements UserRepository {

	private final String fILENAME= "Users";
	private Set<MarkoliaUser> users; //Wont return duplicate names
	
	 public UserRepositoryImple() throws IOException, ClassNotFoundException {
		 try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fILENAME))){
				this.users= (Set<MarkoliaUser>)objectInputStream.readObject();
			
				}
	}
	
	@Override
	public void addNewUser(MarkoliaUser user) throws Exception {
		if (user == null) {
			throw new Exception("User must have a value");
		}
		if ( this.users.contains(user)) {
			throw new Exception("This User already exists");
		}
		this.users.add(user);
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream(fILENAME))) {
			objectOutputStream.writeObject(users);
		}
		
	}

	@Override
	public MarkoliaUser findUser(int user_id) throws Exception {
		
		if(this.users.contains(new MarkoliaUser(user_id))) {
			for(MarkoliaUser user: users) {
				if(user.getUser_id()==user_id)
					return user;
			}
		}
		else {
			throw new Exception("User not found");
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



}
