/**
 * 
 */
package interfaceOO;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Currentaccount extends Account implements Maintanenceclass{
	public Currentaccount(String accountNum, String customerName, double balance) {
		super(accountNum, customerName, balance);
		
	}

	@Override
	public float Calculatemaintanencecharge(float noOfYears) {
		float n= noOfYears;
		System.out.println("Enter the base charge per year : ");
		Scanner sc =new Scanner(System.in);
		float m = sc.nextInt();
		float maintanenceCharge = (m * n)+50;
		return maintanenceCharge;
	}
	

}
