// Constructor for the Hotel booking for a specific location;


package functionintefrace;

/**
 * @author Administrator
 *
 */
public class Hoteldetails {
 public Hoteldetails(String aadharID, String name, String emailID, String location) {
		
		this.aadharID = aadharID;
		this.name = name;
		this.emailID = emailID;
		this.location = location;
	}
private String aadharID;
 private String name;
 private String emailID;
 private String location;
public String getAadharID() {
	return aadharID;
}
public void setAadharID(String aadharID) {
	this.aadharID = aadharID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
