package com.sr.actions;

import java.sql.*;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class FetchWpost 
{	ArrayList<WpostAction> list=new ArrayList<WpostAction>();
	
	
	public ArrayList<WpostAction> getList()
	{
		return list;
	}
	public void setList(ArrayList<WpostAction> list)
	{
		this.list=list;
	}
	public String execute(){
		try{
			
		HttpSession s=ServletActionContext.getRequest().getSession();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			PreparedStatement pst=con.prepareStatement("SELECT * FROM STRUTSPOST WHERE EMAIL=?");
			pst.setString(1,s.getAttribute("email").toString());
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				WpostAction wp=new WpostAction();
				wp.setName(rs.getString("name"));
				wp.setMsg(rs.getString("msg"));
				list.add(wp);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
}