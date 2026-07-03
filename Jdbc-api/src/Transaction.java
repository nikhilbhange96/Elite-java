import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {

	public static void main(String[] args) {
		
		String sql1="insert into cust values(16,'Nik','Noida')";
		String sql2="update cust set city='madurai' where id=12";
		String sql3="delete from cust where id=13";
		Connection conn= null;
		try {
			conn=JdbcFactory.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt=conn.createStatement();
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			
			conn.commit();
			
			System.out.println("Transaction Completed");
		} catch (SQLException e) {
			System.out.println("Transaction failed");
			try {
				conn.rollback();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
