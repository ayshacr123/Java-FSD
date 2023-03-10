/**
 * 
 */
package ustbatchno3.junit5testcases;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class Frequencycount {

	public static long count(List<String> names, String targetname) {
		// TODO Auto-generated method stub
		return names.stream().filter(n->n.equalsIgnoreCase(targetname)).count();
	}

}
