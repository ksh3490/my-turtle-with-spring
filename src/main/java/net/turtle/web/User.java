package net.turtle.web;

public class User {
	private String userId;
	private String userPW;
	private String userName;
	private String userEmail;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPassword(String userPassword) {
		this.userPW = userPassword;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPW=" + userPW + ", userName=" + userName + ", userEmail="
				+ userEmail + "]";
	}

	
}
