/**
 * 
 */
package javalearning;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public  class Stringreverse {
	public static int Stringreverse(String S) {
		char reverse = ' ';
		
			for(int j=S.length()-1;j>=0;j--) {
				reverse =S.charAt(j);
				System.out.print(reverse);
				
				
				
			}
			return reverse;
		}
	
	





	/**
	 * @param args
	 * @param String 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String S= sc.next();
		Stringreverse(S) ;
		
			
		
		
		

	}
}


