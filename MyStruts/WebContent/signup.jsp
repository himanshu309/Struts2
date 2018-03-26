<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="/struts-tags" prefix="S" %>


<S:form action="signup">
<S:textfield name="uname" label="Enter Name "></S:textfield><br />
<S:fielderror fieldName="uname"></S:fielderror>

<S:password name="pwd" label="Enter Password "></S:password><br />
<S:fielderror fieldName="pwd"></S:fielderror>

Enter Email :<S:textfield name="email" label="Enter Email :"></S:textfield><br />
<S:fielderror fieldName="email"></S:fielderror>

<S:radio list="{'Male','Femail'}" name="gender" label="Choose Gender :"></S:radio><br /><br />
<S:submit value="Sign-Up"> </S:submit><br />
</S:form>

<S:include value="login"></S:include>

</body>
</html>