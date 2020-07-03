package Model;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public interface managerRepository {
	public void exportUsersList();

	void exportUsersList(File path);
	
	Set<products> getProductsList();
	
	void writeToFIleproductslist(Set<products>productslist) throws FileNotFoundException, IOException;
	
	public void writeToObjectFile() throws IOException;

	void writeOrder(String name, String user_id, String emailUser, String value) throws IOException;

	void writeToObjectFile(List list) throws IOException;
	
	void exportOrderToTXT(File path);
}
