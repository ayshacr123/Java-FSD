/**
 * 
 */
package batch3ust.Jdbc;

import java.time.LocalDate;

public class Bus {
	
    @Override
	public String toString() {
		return "Bus [id=" + id + ", startCity=" + startCity + ", endCity=" + endCity + ", travelDate=" + travelDate
				+ ", busNumber=" + busNumber + ", availableSeats=" + availableSeats + ", fare=" + fare + "]";
	}

	private int id;
    private String startCity;
    private String endCity;
    private LocalDate travelDate;
    private String busNumber;
    private int availableSeats;
    private double fare;

    public Bus(int id, String startCity, String endCity, LocalDate travelDate, String busNumber, int availableSeats, double fare) {
        this.id = id;
        this.startCity = startCity;
        this.endCity = endCity;
        this.travelDate = travelDate;
        this.busNumber = busNumber;
        this.availableSeats = availableSeats;
        this.fare = fare;
    }

    public Bus(String startCity, String endCity, LocalDate travelDate, String busNumber, int availableSeats, double fare) {
        this(0, startCity, endCity, travelDate, busNumber, availableSeats, fare);
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }
}





