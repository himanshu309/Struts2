package com.sr.actions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginData 
{
	public static boolean LoginValidator(String email,String pwd)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			PreparedStatement pst=con.prepareStatement("Select email,password from StrutsLogin where email=? and password=?");
			pst.setString(1,email);
			pst.setString(2,pwd);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
			return true;
			}
			return true;
			}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
