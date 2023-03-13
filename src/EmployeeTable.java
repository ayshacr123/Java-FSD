/**
 * 
 */
package batch3ust.Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Administrator
 *
 */
public class EmployeeTable {

	/**
	 * @param args
	 */
		   static final String DB_URL = "jdbc:mysql://localhost/";
		   static final String USER = "root";
		   static final String PASS = "pass@word1";

		   public static void main(String[] args) {
		      // Open a connection
		      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
//		         String sql = "CREATE DATABASE Company";
//		         stmt.executeUpdate(sql);
//		         System.out.println("Database Company created successfully...");   	  
		      } catch (SQLException e) {
		         e.printStackTrace();
		      
	}

}
}
