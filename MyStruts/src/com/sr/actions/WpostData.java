package com.sr.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class WpostData 
{
	public static int wpost(WpostAction wp)
	{
		HttpSession sec=ServletActionContext.getRequest().getSession();
		int i;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
				PreparedStatement ps=con.prepareStatement("insert into StrutsPost values(?,?,?)");
				ps.setString(1,wp.getName());
				ps.setString(2,sec.getAttribute("email").toString());
				ps.setString(3,wp.getMsg());
				i=ps.executeUpdate();
				return i;
			}
			catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
	}
	
}
