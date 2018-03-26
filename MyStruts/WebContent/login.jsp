<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib uri="/struts-tags" prefix="S"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<S:form action="login">
<S:textfield name="email" label="Enter Email"></S:textfield><br />
<S:password name="pwd" label="Enter Password"></S:password><br />
<S:submit value="Login"></S:submit>
</S:form>
</body>
</html>