package bank;

public class Customer {
	private int customerId;
	private String customerName;
	private String emailId;
	
	public Customer (int customerId, String customerName, String emailId) {
		this.customerId=customerId;
		this.customerName=customerName;
		this.emailId=emailId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customerName;
	}
	public void setCustomername(String customername) {
		this.customerName = customername;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
