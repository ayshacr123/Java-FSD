/**
 * 
 */
package array;
import java.util.*;

/**
 * @author Administrator
 *
 */

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		int reverse=0,temp,remainder=0;
		temp=num;
		while(num>0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		
		if(reverse==temp) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
		

	}


}
