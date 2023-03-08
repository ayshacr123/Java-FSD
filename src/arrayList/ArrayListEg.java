/**
 * 
 */
package arrayList;

import java.util.*;


/**
 * @author Administrator
 *
 */
public class ArrayListEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(13);
		list.add(15);
		list.add(20);
		
		
		for( int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++) 
			{ 	
				if(list.get(i)+list.get(j)==25)
				{
					System.out.printf("  Target values : " +list.get(i));
					System.out.printf("  Target values : " +list.get(j));
					System.out.println(" ");
				}
			}
		
		}
	}

}
