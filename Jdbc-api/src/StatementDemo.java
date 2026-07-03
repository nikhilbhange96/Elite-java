import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) throws SQLException{
		
		String sql = "INSERT INTO cust VALUES (15, 'Nikhil', 'Pune')";
		
		try {
			Connection conn=JdbcFactory.getConnection();
			
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
