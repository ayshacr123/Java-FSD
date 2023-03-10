/**
 * 
 */
package interfaceOO;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Userinterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		System.out.println("Enter your choice:");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		System.out.println("Enter the account number ");
		int ac=s.nextInt();
		System.out.println("Enter Customer Name: ");
		String name= s.next();
		System.out.println("Enter the balance amount");
		int am=s.nextInt();
		Savingsaccount sa = new Savingsaccount("aggs","gsyuuywhj", 1234.0);
		System.out.println(sa.Calculatemaintanencecharge(2));
	}

}
