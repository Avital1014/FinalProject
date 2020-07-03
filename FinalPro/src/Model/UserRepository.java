package Model;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface UserRepository {
	

	boolean addNewUser(customer user)throws Exception;
	
	boolean userLoging(String iDString, String passString);
	
	boolean findUser(String user_id) throws Exception ;
	
	void printAllUser();
	
	Set<MarkoliaUser> findAllUsers();
	
	Set<MarkoliaUser> findByname(String userName);
	
	public String findEmailById(String idString);
	
	public String toString(MarkoliaUser user);
	
	String findNameById(String idString);
	
	boolean findID(String id);
	
	boolean changePass(String id, String newPass) throws IOException;
	
	void writeToFile() throws IOException;
	
	String forgotPassword(String qustion, String answer, String id) throws IOException;
	
}
