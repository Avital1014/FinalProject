package Model;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.File;


public class MarkoliaUser implements Serializable{
	
	@Override
	public String toString() {
		return "MarkoliaUser [user_id=" + user_id + ", fullName=" + fullName + ", emailUser="
				+ emailUser + ", passwordUser=" + passwordUser + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailUser == null) ? 0 : emailUser.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((passwordUser == null) ? 0 : passwordUser.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		if (emailUser == null) {
			if (other.emailUser != null)
				return false;
		} else if (!emailUser.equals(other.emailUser))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (passwordUser == null) {
			if (other.passwordUser != null)
				return false;
		} else if (!passwordUser.equals(other.passwordUser))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}


	private static final long serialVersionUID= 1L; 
	
	private String user_id;
	private String fullName;
	private String emailUser;
	private String passwordUser;
	

	
	public MarkoliaUser(String user_id) {
		super();
		this.user_id = user_id;
	}
	public MarkoliaUser(String name, String user_id, String emailUser, String passwordUser) {
		super();
		this.fullName = name;
		this.user_id = user_id;
		this.emailUser = emailUser;
		this.passwordUser = passwordUser;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
