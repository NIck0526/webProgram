package vo.login;



public class LoginVO {
	private String userNumber;
	private String userId;
	private String userPass;
	
	
	public LoginVO(String userNumber, String userId, String userPass) {
		super();
		this.userNumber = userNumber;
		this.userId = userId;
		this.userPass = userPass;
	}


	public String getUserNumber() {
		return userNumber;
	}


	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPass() {
		return userPass;
	}


	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}


	@Override
	public String toString() {
		return "LoginVO [userNumber=" + userNumber + ", userId=" + userId + ", userPass=" + userPass + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
