package Model;



public class userBuilder {
	
	
	private String user_id;
	private String fullName;
	private String emailUser;
	private String passwordUser;
	private String qustionString;
	private String answerString;
	private String customerOrder;
	private String address;
	private String cardHolder;
	private String creditCard;
	private String exp;
	private String phone;
	private String city;
	private String zipCode;
	private String apartement;

	
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
	public userBuilder address(String address) {
		this.address = address;
		return this;
	}
	public userBuilder cardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
		return this;
	}
	public userBuilder creditCard(String creditCard) {
		this.cardHolder = creditCard;
		return this;
	}
	public userBuilder exp(String exp) {
		this.exp = exp;
		return this;
	}
	public userBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public userBuilder city(String city) {
		this.city = city;
		return this;
	}
	public userBuilder zipCode(String zipCode) {
		this.zipCode = zipCode;
		return this;
	}
	public userBuilder apartement(String apartement) {
		this.apartement = apartement;
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
		user.setCreditCard(this.creditCard);
		user.setAddress(this.address);
		user.setCardHolder(this.cardHolder);
		user.setExp(this.exp);
		user.setPhone(this.phone);
		user.setCity(this.city);
		user.setZipCode(this.zipCode);
		user.setApartement(this.apartement);
		return user;
	}
}
