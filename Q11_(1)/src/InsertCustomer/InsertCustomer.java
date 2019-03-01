package InsertCustomer;

import java.io.*;
import java.sql.*;
import java.sql.CallableStatement;
import java.util.Scanner;
//Ŭ������ import�ϴ� �����̴�. SQL���� Ŭ������ java.sql.*;�� ���ԵǾ� �ִ�.
public class InsertCustomer {
	Connection con;
	//Ŭ���� booklist�� �����Ѵ�. java.sql�� Connection ��ü con�� �����Ѵ�.
	public InsertCustomer() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		String userid = "madang";
		String pwd = "diaak12";
		//���Ӻ����� �ʱ�ȣ �Ѵ�. url�� �ڹ� ����̹� �̸�, DBMS(jdbc:oracle:this:), ȣ��Ʈ��(localhost),
		//������Ʈ��ȣ(1521), �����ͺ��̽� �̸�(orcl)������ �Է��Ѵ�. 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("�����ͺ��̽� ���� �غ�...");
			con=DriverManager  .getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
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
				System.out.println("��ϵǾ����ϴ�. ");
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
