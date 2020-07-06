package Model;


public class customer extends MarkoliaUser{
	
	/**
	 * 
	 */
	private static MarkoliaUser INSTANCE = null; 
	private static final long serialVersionUID = 1L;
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
	
	
	public customer(String name, String user_id, String emailUser, String passwordUser, String qustion, String answer) {
		
		super(name, user_id, emailUser, passwordUser);
		this.qustionString = qustion;
		this.answerString = answer;
	}
	
	/*Singelton pattern*/
	public static MarkoliaUser getInstance(String name, String user_id, String emailUser, String passwordUser, String qustion, String answer) {
		if(INSTANCE == null) {
			System.out.println("in instance");
			INSTANCE = new customer(name, user_id, emailUser, passwordUser, qustion, answer);
		}
		return INSTANCE;
	}

	public String printCustomerOrder() {
		return "user_id=" + this.getUser_id() + ", fullName=" + this.getFullName() + ", emailUser="
				+ this.getEmailUser() + ", Total order =" + customerOrder ;
	}
	
	public static userBuilder builder() {
		return new userBuilder();
	}
	
	public customer() {
	
	}
	
	

	@Override
	public String toString() {
		
		return "MarkoliaUser [user_id= " + this.getUser_id() + ", fullName= " + this.getFullName() + ", emailUser="
				+ this.getEmailUser() +  ", Customer Phone- " + this.getPhone() + ", Customer Address- " + this.getAddress() +  ", City- " + this.city + ", Apartment" + this.apartement + ", Zip code- " + this.zipCode +  ", Card holder- " + 
				this.cardHolder + ", Credit Card- " + this.creditCard + "]";
	}

	public String getQustionString() {
		return qustionString;
	}

	public void setQustionString(String qustionString) {
		this.qustionString = qustionString;
	}

	public String getAnswerString() {
		return answerString;
	}

	public void setAnswerString(String answerString) {
		this.answerString = answerString;
	}

	public String getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(String customerOrder) {
		this.customerOrder = customerOrder;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getApartement() {
		return apartement;
	}

	public void setApartement(String apartement) {
		this.apartement = apartement;
	}
	
	

	
}
