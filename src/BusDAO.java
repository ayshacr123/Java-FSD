/**
 * 
 */
package batch3ust.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BusDAO {
    private final String url;
    private final String user;
    private final String password;

    public BusDAO(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public List<Bus> getAvailableBuses(String startCity, String endCity, LocalDate travelDate) {
        List<Bus> buses = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM buses WHERE start_city = ? AND end_city = ? AND travel_date = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, startCity);
            stmt.setString(2, endCity);
            stmt.setObject(3, travelDate);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String busNumber = rs.getString("bus_number");
                int availableSeats = rs.getInt("available_seats");
                double fare = rs.getDouble("fare");

                Bus bus = new Bus(id, startCity, endCity, travelDate, busNumber, availableSeats, fare);
                buses.add(bus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return buses;
    }
}






