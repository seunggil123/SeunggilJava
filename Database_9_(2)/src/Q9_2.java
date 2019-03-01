import java.io.*;
import java.sql.*;
import java.sql.CallableStatement;
//Ŭ������ import�ϴ� �����̴�. SQL���� Ŭ������ java.sql.*;�� ���ԵǾ� �ִ�.
public class Q9_2 {
	Connection con;
	//Ŭ���� booklist�� �����Ѵ�. java.sql�� Connection ��ü con�� �����Ѵ�.
	public Q9_2() {
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
			con=DriverManager.getConnection(url, userid, pwd);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//���� ��ü con�� DriverManager.getConnection �Լ��� �����Ѵ�.
	/**
	 * ���ǻ纰�� ���ǻ� �̸��� ������ �Ǹ� �Ѿ��� ���̴� ���α׷��� �ۼ��Ͻÿ�.
	 * 201413328 �̽�ȯ
	 */
	private void sqlRun() {
		String query = "SELECT b.publisher, sum(o.saleprice) "
				+"FROM book b, Orders o "
				+"WHERE b.bookid = o.bookid "
				+"GROUP BY publisher";

				
		//���ڿ� query�� ������ SQL�� �Է�
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("\tPUBLISHER \tPRICE ");
			//SQL ���� ��ü stmt�� �����Ѵ�. stmt ��ü�� executeQuery(query)�� ȣ���Ͽ� ����� 
			//ResultSet�� ��ȯ�Ѵ�. rs�� "SELECT * FROM Book" ���� ����� ������ �ִ�.
			
			while(rs.next()) {
				System.out.print("\t"+rs.getString(1));
				System.out.println("\t\t"+rs.getInt(2));
			}
			//rs��ü�� next()�� �����ϸ� ��� ���̺��� �� �྿ ��ȯ�ȴ�. ��ȯ�� ���� rs.getInt(1)�� �����ϸ�
			//ù° ������ ������ ��ȯ�Ǿ� ��ȯ�ȴ�. ������ �����鵵 getInt�� getString �Լ��� ���� �޴´�.
			
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//������ ������ con.close()�� ������ ���´�.
	public static void main(String args[]) {
		Q9_2 so = new Q9_2();
		so.sqlRun();
	}
}

