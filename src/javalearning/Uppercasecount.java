/**
 * 
 */
package javalearning;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Uppercasecount {

	private static void Uppercasecount(String s) {
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			
			if (s.charAt(i) >='A' && s.charAt(i) <='Z' ) {
				count = count+1;
				
				
		}
		
			
	}
		System.out.println(" Upper case count : " +count);	
		

	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string containing uppercase : ");
		Scanner sc = new Scanner(System.in);
		String S= sc.next();
		Uppercasecount(S);
		

	}


}
