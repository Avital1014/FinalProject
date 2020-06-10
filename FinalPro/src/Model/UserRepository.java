package Model;

import java.util.List;
import java.util.Set;

public interface UserRepository {

	void addNewUser(MarkoliaUser user)throws Exception;
	
	MarkoliaUser findUser(String user_id) throws Exception ;
	
	Set<MarkoliaUser> findAllUsers();
	
	Set<MarkoliaUser> findByname(String userName);
}
