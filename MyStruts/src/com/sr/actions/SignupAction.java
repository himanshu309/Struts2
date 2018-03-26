package com.sr.actions;
import com.opensymphony.xwork2.ActionSupport;
public class SignupAction extends ActionSupport
{
/**
	 * 
	 */
	private static final long serialVersionUID = 8188018755777256680L;
String uname,pwd,gender,email;

public String getUname()
{
	return uname;
}
public void setUname(String uname) 
{
	this.uname=uname;
}
public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public void validate() {
 
	if(uname.length()<5)
	{
		addFieldError(uname, "Invalid Uname");
	}
	if(pwd.length()<8)
	{
		addFieldError(pwd, "Too small Password");
	}
}

public String execute()
{
	int j=SignupData.save(this);
	if(j>0)
	{
		return "success";
	}
	else 
	{
		return "error";
	}
	}
}
