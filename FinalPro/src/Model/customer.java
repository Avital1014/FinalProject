package Model;

public class customer extends MarkoliaUser{
	
	/**
	 * 
	 */
	private static MarkoliaUser INSTANCE = null; 
	private static final long serialVersionUID = 1L;
	String qustionString;
	String answerString;
	String customerOrder;
	public customer(String name, String user_id, String emailUser, String passwordUser, String qustion, String answer) {
		
		super(name, user_id, emailUser, passwordUser);
		this.qustionString = qustion;
		this.answerString = answer;
	}
	
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

	

	
}
