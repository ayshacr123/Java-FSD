/**
 * 
 */
package linkedList;

import java.util.LinkedList;

/**
 * @author Administrator
 *
 */
public class Middlevalue {

	   
	    
	     
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        /* Start with the empty list. */
	       LinkedList <Integer> list = new LinkedList<>(); 
	    
	        list.add(10);
	        list.addFirst(90);
	        list.addLast(30);
	        list.addLast(80);
	        list.addLast(60);
	        System.out.println("Linked list is " +list);
	        int middle = list.get(list.size()/2);
	        System.out.println(" Middle element is " +middle);
	        
	       
	}
	    }