/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Lucky {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int flag1=0;
		int flag2=0;
		int flag3=0;
		int digit=0;
		System.out.println("Enter the pin number :");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0) {
			digit=num%10;
			if(digit==3) {
				flag1=1;
			}
			if(digit==6) {
				flag2=1;
			}
			if(digit==9) {
				flag3=1;
			}
		num=num/10;
		}
		if ((flag1==1) && (flag2==1) && (flag3==1)) {
			System.out.println("The number is lucky");
		}
		else {
			System.out.println("The number is not lucky");
		}
		}
}
					
		


