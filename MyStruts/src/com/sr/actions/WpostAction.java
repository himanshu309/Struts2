package com.sr.actions;

public class WpostAction {

	String msg,name;

	
	public String getMsg() 
	{
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
public String execute() 
{
	int k=WpostData.wpost(this);
	if(k>0)
	{
		return "success";
	}
	else
	{
		return "error";
	}
}

}

