/**
 * 
 */
package hashcode;

import java.util.HashMap;

/**
 * @author Administrator
 *
 */
public class Hashlearning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Apple",10);
		map.put("Orange",20);
		map.put("Grape", 30);
		
		int price = map.get("Apple");
		System.out.println("Price of Apple is :" +price);
		
		
		map.remove("Orange");
		
		boolean containsApple = map.containsKey("Grape");
		System.out.println(" Hashmap contains Grape : "+containsApple);
		boolean containsGrape = map.containsKey("Orange");
		System.out.println("Hashmap contains Orange : "+containsGrape);
		
		for (String name : map.keySet()) {
			int value = map.get(name);
			System.out.println(name + " is " + value + " rs ");
		}
	}

}
