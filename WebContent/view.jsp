<%@page import="java.util.ArrayList"%>
<%@page import="test.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="cont" method="post">
<input type="text" name="fname"><br>
<input type="text" name="lname"><br>
<input type="submit" name="submit"><br>
</form>

<%
	if(request.getAttribute("model")!=null){
		ArrayList<Person> persons=(ArrayList<Person>)request.getAttribute("model");
		for(Person p:persons)
		out.println(p.getFname()+" "+p.getLname());
	}
%>

</body>
</html>