package com.internousdev.webproj4.dto;

public class HelloStrutsDTO {
	private int userId;
	private String userName;
	private String password;
	private String result;

	public int getuserId(){
		return userId;
	}
	public void setUserId(int userId){
		this.userId= userId;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName= userName;
	}
	public String getPassword(){
		return password;
	}
	public String getResult(){
		return result;
	}

	public void setResult(String result){
		this.result=result;
	}
}