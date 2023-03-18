/**
 * 
 */
package batch3ust.Jdbc;

import java.sql.*;
import java.time.LocalDate;

public class KSRTCReservationSystem {
    public static void main(String[] args) throws SQLException {
        // Connect to the database
        String url = "jdbc:mysql://localhost:3306/ksrtc";
        String username = "root";
        String password = "pass@word1";
        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a new bus
        Bus bus = new Bus("Bangalore", "Mysore", LocalDate.of(2023, 3, 20), "KA-01-F-1234", 40, 500.0);

        // Insert the bus into the database
        String insertSql = "INSERT INTO buses (start_city, end_city, travel_date, bus_number, available_seats, fare) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
        
        insertStatement.setString(1, bus.getStartCity());
        insertStatement.setString(2, bus.getEndCity());
        insertStatement.setDate(3, Date.valueOf(bus.getTravelDate()));
        insertStatement.setString(4, bus.getBusNumber());
        insertStatement.setInt(5, bus.getAvailableSeats());
        insertStatement.setDouble(6, bus.getFare());
        insertStatement.executeUpdate();

        // Get the generated id
        ResultSet generatedKeys = insertStatement.getGeneratedKeys();
        if (generatedKeys.next()) {
            int id = generatedKeys.getInt(1);
            bus.setId(id);
        }

        // Print the inserted bus details
        System.out.println("Inserted bus:");
        System.out.println(bus);

        // Update the available seats for the bus
        int newAvailableSeats = 35;
        bus.setAvailableSeats(newAvailableSeats);
        String updateSql = "UPDATE buses SET available_seats = ? WHERE id = ?";
        PreparedStatement updateStatement = connection.prepareStatement(updateSql);
        updateStatement.setInt(1, newAvailableSeats);
        updateStatement.setInt(2, bus.getId());
        updateStatement.executeUpdate();

        // Print the updated bus details
        System.out.println("Updated bus:");
        System.out.println(bus);

        // Close the resources
        updateStatement.close();
        insertStatement.close();
        connection.close();
    }
}
