package MarkoliaPackage;

import java.io.File;
import java.io.IOException;

public class MarkoliaModel {
	public void checkk() {
		 
		    try {
		      File myObj = new File("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  
	}
}
