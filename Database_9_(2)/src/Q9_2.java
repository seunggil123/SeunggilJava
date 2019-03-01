import java.io.*;
import java.sql.*;
import java.sql.CallableStatement;
//클래스를 import하는 문장이다. SQL관련 클래스는 java.sql.*;에 포함되어 있다.
public class Q9_2 {
	Connection con;
	//클래스 booklist를 선언한다. java.sql의 Connection 객체 con을 선언한다.
	public Q9_2() {
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
			con=DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//접속 객체 con을 DriverManager.getConnection 함수로 생성한다.
	/**
	 * 출판사별로 출판사 이름과 도서의 판매 총액을 보이는 프로그램일 작성하시오.
	 * 201413328 이승환
	 */
	private void sqlRun() {
		String query = "SELECT b.publisher, sum(o.saleprice) "
				+"FROM book b, Orders o "
				+"WHERE b.bookid = o.bookid "
				+"GROUP BY publisher";

				
		//문자열 query에 수행할 SQL문 입력
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("\tPUBLISHER \tPRICE ");
			//SQL 실행 객체 stmt를 생성한다. stmt 객체를 executeQuery(query)로 호출하여 결과를 
			//ResultSet에 반환한다. rs는 "SELECT * FROM Book" 실행 결과를 가지고 있다.
			
			while(rs.next()) {
				System.out.print("\t"+rs.getString(1));
				System.out.println("\t\t"+rs.getInt(2));
			}
			//rs객체에 next()를 적용하면 결과 테이블에서 한 행씩 반환된다. 반환된 행을 rs.getInt(1)에 적용하면
			//첫째 열값이 정수로 변환되어 반환된다. 나머지 열값들도 getInt나 getString 함수로 값을 받는다.
			
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//실행이 끝나면 con.close()로 접속을 끊는다.
	public static void main(String args[]) {
		Q9_2 so = new Q9_2();
		so.sqlRun();
	}
}

