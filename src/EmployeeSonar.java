
package batch_three_ust.sonarqube;


public class EmployeeSonar{
	private String empNumber;
	private String empName;
	private int empAge;
	private int noOfYear;
	private double salary;
	
	
	public EmployeeSonar(String empNumber, String empName, int empAge, int noOfYear, double salary) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.empAge = empAge;
		this.noOfYear = noOfYear;
		this.salary = salary;
	}
	
	

	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getNoOfYear() {
		return noOfYear;
	}

	public void setNoOfYear(int noOfYear) {
		this.noOfYear = noOfYear;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "EmployeeSonar [empnumber=" + empNumber + ", empname=" + empName + ", empage=" + empAge
				+ ", noOfYear=" + noOfYear + ", salary=" + salary + "]";
	}


}