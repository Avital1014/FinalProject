package Model;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.File;


public class MarkoliaUser implements Serializable{
	
	@Override
	public String toString() {
		return "MarkoliaUser [user_id=" + user_id + ", fullName=" + fullName + ", userName=" + userName + ", emailUser="
				+ emailUser + ", passwordUser=" + passwordUser + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + user_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarkoliaUser other = (MarkoliaUser) obj;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	private static final long serialVersionUID= 1L; 
	
	private int user_id;
	private String fullName;
	private String userName;
	private String emailUser;
	private String passwordUser;
	

	
	public MarkoliaUser(int user_id) {
		super();
		this.user_id = user_id;
	}
	public MarkoliaUser(int user_id, String fullName, String userName, String emailUser, String passwordUser) {
		super();
		this.user_id = user_id;
		this.fullName = fullName;
		this.userName = userName;
		this.emailUser = emailUser;
		this.passwordUser = passwordUser;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	
	
}
