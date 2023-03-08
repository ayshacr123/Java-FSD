/**
 * 
 */
package functionintefrace;

/**
 * @author Administrator
 *
 */
public class Customerdetails {
	private String regID;
	private String name;
	private String phoneNum;
	private String emailID;
	private String location;
	
	public Customerdetails(String regID,String name, String phoneNum,String emailID,String location) {
		this.regID=regID;
		this.name=name;
		this.phoneNum=phoneNum;
		this.emailID=emailID;
		this.location=location;
	}
	
	public String getRegID() {
		return regID;
	}
	
	public void setRegID(String regID) {
		this.regID=regID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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
//
//	@Override
//	public String toString() {
//		return "Customerdetails [regID=" + regID + ", name=" + name + ", phoneNum=" + phoneNum + ", emailID=" + emailID
//				+ ", location=" + location + "]";
//	}
}
