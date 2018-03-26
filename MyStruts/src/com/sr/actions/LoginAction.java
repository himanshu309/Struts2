package com.sr.actions;
import java.util.*;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
public class LoginAction implements SessionAware
{
	SessionMap<String,Object> session;
	String email,pwd;

	public String getPwd() 
	{
	return pwd;	
	} 
	public void setPwd(String pwd) {
		this.pwd=pwd;
		}
public String getEmail()
{
	return email;
} 
public void setEmail(String email)
{
	this.email=email;
	}

public void setSession(Map<String, Object> map) 
{
	session=(SessionMap<String, Object>)map;
}
	public String execute() 
	{
		try 
		{
			if(LoginData.LoginValidator(email,pwd))
				{
				session.put("email",this.email);
				
				return "success";		
				}
			else
			{
				return "error";
			}
				
		}
		catch (Exception e) 
		{
			return "error";
		}	
	}	
}