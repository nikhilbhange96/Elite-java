import java.sql.Connection;
import java.sql.PreparedStatement;

public class PrepareDemo {
    public static void main(String[] args) {

        String sql = "INSERT INTO cust (id, cname, city) VALUES (?, ?, ?)";

        try {
            Connection conn = JdbcFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, Integer.parseInt(args[0]));
            stmt.setString(2, args[1]);
            stmt.setString(3, args[2]);

            stmt.executeUpdate();

            System.out.println("Record Inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}