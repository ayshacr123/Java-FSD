/**
 * 
 */
package ustbatchno3.junit5testcases;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class WordsrepeatationCount {

	/**
	 * @param args
	 */
	

	public static long countname(List<String> names, String targetname) {
		// TODO Auto-generated method stub
		return names.stream().filter(n->n.equalsIgnoreCase(targetname)).count();
		
	}
}
	
