/**
 * 
 */
package bank;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c= new Customer(2459,"aysha","ayshaayu17@gmail.com");
		SavingsAccount a = new SavingsAccount(2459,c,2444.44,234.45);
		System.out.println(a.withdraw(235.44));
		
		

	}

	

}
