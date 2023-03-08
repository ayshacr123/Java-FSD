/**
 * 
 */
package functionintefrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Predicatedemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//squared number
		List<Integer> s=Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer> squarednumber=s.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(squarednumber);
		
		//even number squares
		List<Integer> s1=Arrays.asList(1,2,3,4,5,6,7);
	
		List<Integer> squarednumber1=s1.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
		System.out.println(squarednumber1);
		
		//filter cities starting with T
		List<String> s3=Arrays.asList("Trivandrum","Trissur","Mumbai","Kochi","Banglore","Tailand");
		List<String> filtered=s3.stream().filter(t->t.startsWith("T")).collect(Collectors.toList());
		System.out.println(filtered);
		
		
		//filter price less thsn 10000
		 List<Test> productsList = new ArrayList<Test>();  
		productsList.add(new Test(1,"HP Laptop",25000));  
        productsList.add(new Test(2,"Dell Laptop",300000));  
        productsList.add(new Test(3,"Lenevo Laptop",28000));  
        productsList.add(new Test(4,"Sony Laptop",28000));  
        productsList.add(new Test(5,"Apple Laptop",900000));
		 
        List<Integer> productPriceList2 =productsList.stream().filter(p -> p.price > 10000).map(p->p.price).collect(Collectors.toList()); // collecting as list  
System.out.println(productPriceList2);
		
		}

		
	}


