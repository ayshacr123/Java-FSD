/**
 * 
 */
package array;

//import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Arraymax {

	/**
	 * @param args
	 * @return 
	 * @return 
	 */
	public static void main (String[] args) {
		int array[] = {10,5,3,8,1,7,2,19};
		int max = array[0];
		//int arraysize = array.length;
		for(int i=1; i < array.length; i++ )
		{
			if (array[i]>max) {
				max = array[i];
				
			}
		
		

	}
		System.out.println(max);
		

	}

}
