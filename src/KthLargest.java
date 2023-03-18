// Find out the kth largest number from a linked list
/**
 * 
 */
package batch3ust.Jdbc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author Administrator
 *
 */
public class KthLargest {
	
	public static void kthLargest1(LinkedList<Integer> list, int k) {
	    int list1 =  list.stream()
	               .distinct() // remove duplicates
	               .sorted(Comparator.reverseOrder()) // sort in descending order
	               .skip(k-1) // skip the first k-1 elements
	               .findFirst()// return the first element (i.e., the kth largest)
	               .orElseThrow(() -> new IllegalArgumentException("List has fewer than k elements"));
	    System.out.println(list1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 2, 1, 5, 4));
		kthLargest1(list, 3); // returns 3
		// TODO Auto-generated method stub
		System.out.println();
	}
}
