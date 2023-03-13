package batch3ust.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class Employeetest{
	
	@Test
	public void test() {
		Employee e = new Employee("Aysha",22,"Trainee");
		
		Assert.assertEquals(e.getName(), "Aysha");
		Assert.assertEquals(e.getAge(), 22);
		Assert.assertEquals(e.getDepartment(), "Trainee");
	}

}
