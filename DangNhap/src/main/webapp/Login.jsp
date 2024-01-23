<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	//lấy dữ liệu gửi từ người dùng
	String tenDN = request.getParameter("uname");
	String mk = request.getParameter("upass");
	//Xử  lý
	if (tenDN.equals("ABC") && mk.equals("MMK"))
		response.sendRedirect("UserProfile.html");
	else
		response.sendRedirect("Login.html");
%>
</body>
</html>