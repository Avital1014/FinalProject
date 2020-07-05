package Model;

public class userBuilder {
	
	
	private String user_id;
	private String fullName;
	private String emailUser;
	private String passwordUser;
	private String qustionString;
	private String answerString;
	private String customerOrder;
	

	
	public userBuilder user_id(String user_id) {
		this.user_id = user_id;
		return this;
	}
	
	public userBuilder emailUser(String emailUser) {
		this.emailUser = emailUser;
		return this;
		
	}
		
	public userBuilder fullName(String fullName) {
		this.fullName = fullName;
		return this;
	}
		
	public userBuilder e(String email) {
		return this.email(email);
	}
	
	public userBuilder email(String emailUser) {
		this.emailUser = emailUser;
		return this;
	}
	public userBuilder qustionString(String qustionString) {
		this.qustionString = qustionString;
		return this;
	}
	public userBuilder answerString(String answerString) {
		this.answerString = answerString;
		return this;
	}
	public userBuilder passwordUser(String passwordUser) {
		this.passwordUser = passwordUser;
		return this;
	}
	public userBuilder customerOrder(String customerOrder) {
		this.customerOrder = customerOrder;
		return this;
	}
	
	public customer build() {
		customer user = new customer();
		user.setAnswerString(this.answerString);
		user.setEmailUser(this.emailUser);
		user.setCustomerOrder(this.customerOrder);
		user.setFullName(this.fullName);
		user.setUser_id(this.user_id);
		user.setPasswordUser(this.passwordUser);
		user.setQustionString(this.qustionString);
		return user;
	}
}
