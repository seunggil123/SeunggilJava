<%@ page import="java.sql.*" contentType="text/html;charset=EUC-KR"%>
<%
/*
201413328 이승환
10-(2)
*/
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	/* 11g express edition은 orcl 대신 XE를 입력한다. */
	Connection dbconn = DriverManager.getConnection(url, "madang", "diaak12");
	Statement stmt = dbconn.createStatement();
	ResultSet myResultSet = stmt.executeQuery("SELECT bookname FROM Book");
	String bookid = request.getParameter("bookid");
	String bookname = request.getParameter("bookname");
	int count = 0;
%>
<html>

<head>
<meta http-equiv="content-type" content="text/html; charset=euc-kr">
<title>** BOOK LIST **</title>
</head>

<body bgcolor="white" text="black" link="blue" vlink="purple"
	alink="red">
	<table border="1" cellspacing="0" width="400" bordercolor="#9AD2F7"
		bordercolordark="white" bordercolorlight="#B9E0FA">
		<tr>
			<td width="150" height="20" bgcolor="#D2E9F9">
				<p align="center">
					<span style="font-size: 8pt;"><b>NAME</b></span>
				</p>
			</td>
		</tr>
		<%
			if (myResultSet != null) {
				while (myResultSet.next()) {
					String bookname2 = myResultSet.getString("bookname");
					//    String W_BOOKNAME=myResultSet.getString("bookname");
					//    String W_PUBLISHER=myResultSet.getString("publisher");
					//    String W_PRICE=myResultSet.getString("price");
		%>
		<tr>
			<td width="150" height="20">
				<p>
					<%
						count++;
					%>
					<span style="font-size: 9pt;"><%=bookname2%> <font
						face="돋움체" color="black"> </font> </span>
				</p>
			</td>

		</tr>
		<%
			}
			}
		%>
	</table>
	<table cellpadding="0" cellspacing="0" width="400" height="23">
		<tr>
			<td width="1350">
				<p align="right">
					<b> <font size="1" "face"="돋움체" color="black">LIST</font></a></b>
				<form name="form 1" method="POST" action="bookSubmit.jsp">
					<td width="1350">bookid<input type="text" name="bookid" />
					</td>
					<td width="1350">bookname<input type="text" name="bookname" />
					</td>
					<td width="1350">publisher<input type="text" name="publisher" />
					</td>
					<td width="1350">price <input type="text" name="price" />
					</td>
					<td width="1350"><input type="submit" value="submit" /></td>
				</form>
			</td>
		</tr>
	</table>
	<%
		stmt.close();
		dbconn.close();
	%>
</body>
</html>