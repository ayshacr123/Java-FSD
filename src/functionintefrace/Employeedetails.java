//Constructor for creating objects for the employee details;


package functionintefrace;

/**
 * @author Administrator
 *
 */
public class Employeedetails {

	public String empId;
	public String empName;
	private double salary;
	
	public Employeedetails(String empId, String empName, double salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employeedetails [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]\n\b"; 
	}

	
}

