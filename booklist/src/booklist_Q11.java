import java.io.*;
import java.sql.*;
import java.sql.CallableStatement;

public class booklist_Q11 {
	Connection con;

	public booklist_Q11() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "madang";
		String pwd = "diaak12";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("DB ���� �غ�..");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("DB ���� ����..");
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

	private void sqlRun() {
		CallableStatement cstmt = null;
		String query = "SELECT * FROM Customer";

		try {
			
			String sql = "{call InsertCustomer(?, ?, ?, ?)}";
			 
			cstmt = con.prepareCall(sql);
			cstmt.setInt(1, 6);
			cstmt.setString(2, "�̽�ȯ");
			cstmt.setString(3, "���ѹα�  ��õ");
			cstmt.setString(4, "010-9327-7086");
			cstmt.execute();
			System.out.println("���ν��� ȣ��...");
			cstmt.close();

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("custid \t name \t address \t phone");
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getString(3));
				System.out.println("\t"+rs.getString(4));
			}
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		booklist_Q11 so = new booklist_Q11();
		so.sqlRun();
	}
}
