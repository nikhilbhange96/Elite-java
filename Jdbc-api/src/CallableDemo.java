import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableDemo {

	public static void main(String[] args) throws SQLException {
		
		Connection conn= JdbcFactory.getConnection();
		
		java.sql.CallableStatement stmt=conn.prepareCall("{?= call get_name(?)}");
		
		
		stmt.setInt(2,12);
		stmt.execute();
		
		System.out.println("Name:"+stmt.getString(1));
	}
}
