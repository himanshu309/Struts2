<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="/struts-tags"  prefix="S"%>
<h1>Login Successful</h1>

<S:a href="welcome.jsp">Home</S:a>
<S:a href="friends">Friends</S:a>
<S:a href="profile">Edit Profile</S:a>
<S:a href="login.jsp">Logout</S:a>
<br /><br />

<S:form action="post">
<S:textarea name="msg"></S:textarea>
<S:textfield name="name"></S:textfield>
<S:submit value="Post"></S:submit>
</S:form>

<S:a href="wposts">Click here to your Wposts</S:a>
<S:actionerror />  
   <S:form action="userImage" method="post" enctype="multipart/form-data">  
    <S:file name="userImage" label="Image" />  
   <S:submit value="Upload" align="center" />  
</S:form>  


</body>
</html>