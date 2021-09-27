package entity;

import java.io.Serializable;

public class Users implements Serializable {
	String LoginId;
	String LoginPwd;
	String Name;
	String Address;
	String Phone;
	String Mail;
	int UserRoleId;
	int UserStateId;
	String getLoginId(){
		return LoginId;
	}
	public void setLoginId(){
		this.LoginId=LoginId;
	}
	String getLoginPwd(){
		return LoginPwd;
	}
	public void setLoginPwd(){
		this.LoginPwd=LoginPwd;
	}
	String getName(){
		return Name;
	}
	public void setName(){
		this.Name=Name;
	}
	String getAddress(){
		return Address;
	}
	public void setAddress(){
		this.Address=Address;
	}
	String getPhone(){
		return Phone;
	}
	public void setPhone(){
		this.Phone=Phone;
	}
	String getMail(){
		return Mail;
	}
	public void setMail(){
		this.Mail=Mail;
	}
	int getUserRoleId(){
		return UserRoleId;
	}
	public void setUserRoleId(){
		this.UserRoleId=UserRoleId;
	}
	int getUserStateId(){
		return UserStateId;
	}
	public void setUserStateId(){
		this.UserStateId=UserStateId;
	}
	
}
