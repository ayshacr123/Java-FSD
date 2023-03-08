/**
 * 
 */
package linkedList;

import java.util.LinkedList;

/**
 * @author Administrator
 *
 */
public class Addlinkedlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		LinkedList <Integer> l1 = new LinkedList<>();
		LinkedList <Integer> l2 = new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(60);
		
		for(int i=1;i<5;i++) {
		
			 sum=sum+ l1.get(i)+l2.get(i);
			
			 System.out.println(" Sum is :" +sum);
			}
		}

	}


