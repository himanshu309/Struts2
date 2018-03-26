package com.sr.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SignupData 
{
public static int save(SignupAction s)
{
	int i;
	try 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		PreparedStatement ps=con.prepareStatement("insert into StrutsLogin values(?,?,?,?)");
		ps.setString(1,s.getUname());
		ps.setString(2,s.getPwd());
		ps.setString(3,s.getEmail());
		ps.setString(4,s.getGender());
		i=ps.executeUpdate();
		return i;	
	}
	
	catch(Exception e)
	{
	return 0;
	}
	
}
}
