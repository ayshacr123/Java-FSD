/**
 * 
 */
package hashcode;

import java.util.HashMap;


/**
 * @author Administrator
 *
 */
public class Employeee {
	
	

	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		HashMap<Integer,Cons> set= new HashMap<Integer,Cons>(); 
		Cons c1 = new Cons(33,"Ayy",89,"eee");
		Cons c2 = new Cons(44,"Stu",98,"iii");
		Cons c3 = new Cons(55,"Tyo",45,"uuu");
		set.put(1,c1);
		set.put(2,c2);
		set.put(3,c3);
		
		int Hashcode1 = c1.hashCode();
		int Hashcode2 = c2.hashCode();
		int Hashcode3 = c3.hashCode();
		
		System.out.println(" Hashcode of c1,c2,c3 : "+Hashcode1+" " +Hashcode2+" "+Hashcode3);
		
		
		
		
	}

}
