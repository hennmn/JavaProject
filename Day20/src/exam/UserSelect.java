package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserSelect {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/userdb";
		String id = "hr";
		String pwd = "hr";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("연결성공");
		
		// Statemanet 객체는 Statement 인터페이스를 구현한 객체를 
		// Connection 클래스의 createStatement(); 메소드를 호출함으로써 얻어진다.
		Statement stmt = conn.createStatement();
		
		String sql = "SECLECT * FROM user";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int num = rs.getInt("num");
			String user_id = rs.getString("user_id");
			String user_pw = rs.getString("user_pw");
			System.out.println(num + " " + user_id + " " + user_pw);
		
		}
		
		
		
	}
}
