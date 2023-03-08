/**
 * 
 */
package javalearning;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Vowels {
	public static void vowelscount(String s) {
		char[] vow = ('A','E','I','O','U','a','e','i','o','u'];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		vowelscount(s);
		

	}

}
