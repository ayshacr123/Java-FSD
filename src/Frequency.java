/**
 * 
 */
package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Frequency {
	
	@Test
	public void countFrequency() {
		List<String> names =Arrays.asList("sharath","kumar","sharath","sharath","sharath","sharath");
		String targetname = "sharath";
		String targetname1= "kumar";
		long expected = 5;
		long expected1=1;
		long actual = Frequencycount.count(names,targetname);
		assertEquals(expected,actual);
		
		long actual1 = Frequencycount.count(names,targetname1);
		assertEquals(expected1,actual1);
		
		
	}
}
