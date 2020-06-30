package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public interface managerRepository {
	public void exportUsersList();

	void exportUsersList(File path);
	
	Set<products> getProductsList();
	
	void writeToFIleproductslist(Set<products>productslist) throws FileNotFoundException, IOException;
	
}
