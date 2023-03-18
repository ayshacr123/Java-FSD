/**
 * 
 */
package batch3ust.Jdbc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @param args
 */

/**
 * Hello world!
 *
 */
import java.sql.*;
import java.util.Scanner;
/**
 * @author Administrator
 *
 */
public class MainException {
	    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/batch3ust";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD = "pass@word1";

	    // regular expression for email validation
	    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	    
	    // regular expression for phone number validation
	    private static final String PHONE_REGEX = "^\\d{10}$";

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter empid: ");
	        int empid = scanner.nextInt();

	        System.out.print("Enter name: ");
	        String name = scanner.next();

	        System.out.print("Enter location: ");
	        String location = scanner.next();

	        System.out.print("Enter address: ");
	        String address = scanner.next();

	        System.out.print("Enter salary: ");
	        double salary = scanner.nextDouble();

	        System.out.print("Enter email: ");
	        String email = scanner.next();

	        while (!email.matches(EMAIL_REGEX)) {
	            System.out.print("Invalid email format. Enter a valid email: ");
	            email = scanner.next();
	        }

	        System.out.print("Enter phone number: ");
	        String phone = scanner.next();

	        while (!phone.matches(PHONE_REGEX)) {
	            System.out.print("Invalid phone number format. Enter a 10-digit phone number: ");
	            phone = scanner.next();
	        }

	        Connection dbConnection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            Class.forName(DB_DRIVER);
	            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

	            String insertTableSQL = "INSERT INTO employee"
	                    + "(empid, name, location, address, salary, email, phone) VALUES"
	                    + "(?,?,?,?,?,?,?)";

	            preparedStatement = dbConnection.prepareStatement(insertTableSQL);

	            preparedStatement.setInt(1, empid);
	            preparedStatement.setString(2, name);
	            preparedStatement.setString(3, location);
	            preparedStatement.setString(4, address);
	            preparedStatement.setDouble(5, salary);
	            preparedStatement.setString(6, email);
	            preparedStatement.setString(7, phone);

	            // execute insert SQL statement
	            preparedStatement.executeUpdate();

	            System.out.println("Record is inserted into employee table!");

	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (preparedStatement != null) {
	                    preparedStatement.close();
	                }
	                if (dbConnection != null) {
	                    dbConnection.close();
	                }
	            } catch (SQLException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	    }
	}



//
//	    private static final String NAME_REGEX = "[a-zA-Z\\s]+";
//	    private static final String PHONE_NUMBER_REGEX = "\\d{3}-\\d{3}-\\d{4}";
//	    private static final String LOCATION_REGEX = "[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*";
//	    private static final String EMAIL_REGEX = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";
//	    private static final String ADDRESS_REGEX = "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";
//	    
//	    public static boolean validateName(String name) {
//	        Pattern pattern = Pattern.compile(NAME_REGEX);
//	        Matcher matcher = pattern.matcher(name);
//	        return matcher.matches();
//	    }
//
//	    public static boolean validatePhoneNumber(String phoneNumber) {
//	        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
//	        Matcher matcher = pattern.matcher(phoneNumber);
//	        return matcher.matches();
//	    }
//
//	    public static boolean validateLocation(String location) {
//	        Pattern pattern = Pattern.compile(LOCATION_REGEX);
//	        Matcher matcher = pattern.matcher(location);
//	        return matcher.matches();
//	    }
//
//	    public static boolean validateEmail(String email) {
//	        Pattern pattern = Pattern.compile(EMAIL_REGEX);
//	        Matcher matcher = pattern.matcher(email);
//	        return matcher.matches();
//	    }
//
//	    public static boolean validateAddress(String address) {
//	        Pattern pattern = Pattern.compile(ADDRESS_REGEX);
//	        Matcher matcher = pattern.matcher(address);
//	        return matcher.matches();
//	    }
//
//	    public static void main(String[] args) {
//	        try {
//	            String name = "John Smith";
//	            if (!validateName(name)) {
//	                throw new Exception("Invalid name format");
//	            }
//	            String phoneNumber = "123-456-7890";
//	            if (!validatePhoneNumber(phoneNumber)) {
//	                throw new Exception("Invalid phone number format");
//	            }
//	            String location = "New York";
//	            if (!validateLocation(location)) {
//	                throw new Exception("Invalid location format");
//	            }
//	            String email = "john.smith@example.com";
//	            if (!validateEmail(email)) {
//	                throw new Exception("Invalid email format");
//	            }
//	            String address = "123 Main St";
//	            if (!validateAddress(address)) {
//	                throw new Exception("Invalid address format");
//	            }
//	            // all inputs are valid
//	            System.out.println("User input is valid");
//	        } catch (Exception e) {
//	            System.out.println("Error: " + e.getMessage());
//	        }
//	    }
		