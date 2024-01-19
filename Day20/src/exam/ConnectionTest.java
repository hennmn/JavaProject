package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		// jdbc : 드라이버종류, ip 포트번호, db명  (url 지정 공식)
	String url = "jdbc:mysql://localhost:3306/userdb";
	String id = "hr";
	String pwd = "hr";
	
	// 자바와 db를 연결하기 위해서 connection 객체를 생성
	Connection conn = null;
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("연결성공");
		// url, id, pw로 Connection 객체를 생성한다.
		conn = DriverManager.getConnection(url, id, pwd);
	} catch (SQLException e) {
		// TODO: handle exception
		System.out.println("연결실패");
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	} finally {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();       
			}
			
		}
	}
	
	
	}
}
