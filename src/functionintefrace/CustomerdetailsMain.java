/**
 * 
 */
package functionintefrace;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class CustomerdetailsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customerdetails c1=new Customerdetails("12","Appu","123456789","appu@gmail.com","Trissur");
		Customerdetails c2=new Customerdetails("77","Akku","985647883","akku@gmail.com","Trivandrum");
		Customerdetails c3=new Customerdetails("56","Achu","547384658","achu@gmail.com","Kochi");
		Customerdetails c4=new Customerdetails("78","Ammu","744274957","ammu@gmail.com","Kollamr");
		Customerdetails c5=new Customerdetails("90","Annu","214364748","annu@gmail.com","Palakkad");
		Scanner sc= new Scanner(System.in);
		System.out.printf("Enter a Register ID : ");
		String a = sc.next();
		List<Customerdetails> list=Arrays.asList(c1,c2,c3,c4,c5);
		
		//Or we need to string method for this 
		//Customerdetails l2=list.stream().filter(findEmp->a.equals(findEmp.getRegID())).findAny().orElse(null);
		
		//Akhil's method
		List<Customerdetails> l2 =list.stream().filter(t->t.getRegID().equals(a)).collect(Collectors.toList());
        if (l2.isEmpty()) {
        	System.out.println("No records found");
        }
        else {
        	
        	for(Customerdetails cc : l2) {
        		System.out.println(" ID : " + cc.getRegID() +"\n" +" Name : " +cc.getName() +"\n"+" Phone Number : " + cc.getPhoneNum()+"\n" +" Email ID : " +cc.getEmailID()+"\n" + " Location : " +cc.getLocation());
        		
        	}
        }
	
	System.out.println(l2);
	}
	
}
