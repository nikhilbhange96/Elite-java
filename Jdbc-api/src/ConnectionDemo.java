import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		Connection conn = JdbcFactory.getConnection();
		System.out.println("Connection successful!");
		
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB Name: " + meta.getDatabaseProductName());
		System.out.println("DB Ver: " + meta.getDatabaseProductVersion());
		System.out.println("Driver Name: " + meta.getDriverName());
		System.out.println("Driver Ver: " + meta.getDriverVersion());
		
	}

}
