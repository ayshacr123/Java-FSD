/**
 * 
 */
package batch3ust.sonarqube;

/**
 * @author Administrator
 *
 */
public class EmployeeSonar {
	private String emp_number;
	private String emp_name;
	private int emp_age;
	private int noOfYear;
	private double salary;
	
	
	public EmployeeSonar(String emp_number, String emp_name, int emp_age, int noOfYear, double salary) {
		super();
		this.emp_number = emp_number;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.noOfYear = noOfYear;
		this.salary = salary;
	}
	
	

	public int getEmp_age() {
		return emp_age;
	}



	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}



	public String getEmp_number() {
		return emp_number;
	}

	public void setEmp_number(String emp_number) {
		this.emp_number = emp_number;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
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
		return "EmployeeSonar [emp_number=" + emp_number + ", emp_name=" + emp_name + ", emp_age=" + emp_age
				+ ", noOfYear=" + noOfYear + ", salary=" + salary + "]";
	}


}