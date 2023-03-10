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
public class TestCountwords {



/**
 * Unit test for simple App.
 */

	
	@Test
	public void countofnames(){
		
		List<String> names=Arrays.asList("sharath","kumar","sharath","sharath","sharath","sharath");
		String targetname="sharath";
		long expected=5;
		long actual=WordsrepeatationCount.countname(names,targetname);
		assertEquals(expected,actual);
		
		
	}
}
