package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUser {
	public static void main(String[] args) {
		// spl문을 데이터베이스에 보내기 위한 객체 생성
		Connection conn = null;
		PreparedStatement pstmt = null;
		String driver = "com.mysql.jdbc.Driver";
		
		String url = "jdbc:mysql://localhost:3306/userdb";
		String id = "hr";
		String pwd = "hr";
		
		String sql = "insert into user(user_id, pwd)" 
				+ "values(?, ?)";
		
		try {
			// JDBC 드라이버 로딩
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pwd);
			// PreParedStatement 객체 생성,
			// 객체생성시 sql문을 저장
			
			pstmt.setString(1, "zzpp");
			pstmt.setString(2, "rrrr");
			// 쿼리를 실행하고 결과를 리턴한다.
			// sql을 실행 후 변경된 row수 int type리턴
			int result = pstmt.executeUpdate();
			System.out.println("변경된 row : " + result);
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		
	}
}
