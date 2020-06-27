package Model;

public class customer extends MarkoliaUser{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String qustionString;
	String answerString;
	
	public customer(String name, String user_id, String emailUser, String passwordUser, String qustion, String answer) {
		
		super(name, user_id, emailUser, passwordUser);
		System.out.println("i am at customer");
		this.qustionString = qustion;
		this.answerString = answer;
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

}
