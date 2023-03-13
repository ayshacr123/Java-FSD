/**
 * 
 */
package batch3ust.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TableCreation {
   public static void main(String args[]) throws SQLException {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/Company";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "pass@word1");
      //System.out.println("Connection established......");
      //Creating the Statement
      Statement stmt = con.createStatement();
      //Query to create a database
      //String query = "CREATE database MyDatabase";
      //Executing the query
     

//    String sql = "CREATE table employee( name Varchar(10), age INT)";
//            stmt.executeUpdate(sql);
//            System.out.println("table created successfully...");
//            }  

      String query2= "insert into Employee values('Aysha',22)";
     stmt.execute(query2);
   }
}