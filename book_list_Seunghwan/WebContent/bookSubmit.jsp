<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" contentType = "text/html; charset=EUC-KR"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>bookSubmit.jsp</title>
</head>
<%
	/**
	201413328 이승환
	10-(2)
	*/
	request.setCharacterEncoding("euc-kr");

	session.setAttribute("bookid",request.getParameter("bookid"));
	session.setAttribute("bookname",request.getParameter("bookname"));
	session.setAttribute("publisher",request.getParameter("publisher"));
	session.setAttribute("price",request.getParameter("price"));
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	Connection dbconn = DriverManager.getConnection(url,"madang","diaak12");
	Statement stmt = dbconn.createStatement();
	
	String bookid = request.getParameter("bookid");
	String bookname = request.getParameter("bookname");
	String publisher = request.getParameter("publisher");
	String price = request.getParameter("price");
	
	String queryString = "insert into book(bookid, bookname, publisher, price)" 
			+" values("+ bookid +", '"+ bookname + "', '"+ publisher + "',"+ price +" )";
	ResultSet rs = null;
	rs = stmt.executeQuery(queryString);
	
	
%>

<body>
<center>
	<HR>
	<%=session.getAttribute("bookid")%>
	<%=session.getAttribute("bookname")%>
	<%=session.getAttribute("publisher")%>
	<%=session.getAttribute("price")%>
	</HR>
</center>
</body>
</html>