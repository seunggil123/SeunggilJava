package InsertCustomer;

import java.io.*;
import java.sql.*;
import java.sql.CallableStatement;
import java.util.Scanner;
//클래스를 import하는 문장이다. SQL관련 클래스는 java.sql.*;에 포함되어 있다.
public class InsertCustomer {
	Connection con;
	//클래스 booklist를 선언한다. java.sql의 Connection 객체 con을 선언한다.
	public InsertCustomer() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		String userid = "madang";
		String pwd = "diaak12";
		//접속변수를 초기호 한다. url은 자바 드라이버 이름, DBMS(jdbc:oracle:this:), 호스트명(localhost),
		//접속포트번호(1521), 데이터베이스 이름(orcl)순으로 입력한다. 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("데이터베이스 연결 준비...");
			con=DriverManager  .getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void sqlRun(int custid, String name, String address, int phone) {
		try {
			CallableStatement cstmt = con.prepareCall("{call insertCustomer(?, ?, ?, ?)}");
				cstmt.setInt(1, custid);
				cstmt.setString(2, name);
				cstmt.setString(3, address);
				cstmt.setInt(4, phone);
				cstmt.executeQuery();
				System.out.println("등록되었습니다. ");
				cstmt.close();
				con.close();
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		InsertCustomer cu = new InsertCustomer();
		Scanner input = new Scanner(System.in);
		int custid = Integer.parseInt(input.nextLine());
		String name = input.nextLine();
		String address= input.nextLine();
		int phone = Integer.parseInt(input.nextLine());
		cu.sqlRun(custid,name,address,phone);
	}

}
