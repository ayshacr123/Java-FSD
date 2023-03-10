/**
 * 
 */
package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import java.time.LocalDate;
import java.util.*;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TesttextileSales {
		public static  List<String> item(LocalDate in) {
			List<String>l1=Arrays.asList("50","t-shirt","5000");
			List<String>l2=Arrays.asList("30","shirt","3000");
			List<String>l3=Arrays.asList("20","jeans","2000");
			List<String>l4=Arrays.asList("40","j-shirt","4000");
			LocalDate d1=LocalDate.of(2023, 2, 1);
			LocalDate d2=LocalDate.of(2023, 3, 1);
			LocalDate d3=LocalDate.of(2023, 4, 1);
			LocalDate d4=LocalDate.of(2023, 5, 1);
			Map<LocalDate,List> map= new HashMap<LocalDate,List>();
			map.put(d1, l1);
			map.put(d2, l2);
			map.put(d3, l3);
			map.put(d4, l4);
		  boolean t= map.containsKey(in);
		  if(t==true)
		  {
			 return(map.get(in));

		  }
		  return null;

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
					
			
			LocalDate in=LocalDate.of(2023, 2, 1);
			List ll=item(in);
			System.out.println(ll);
			
		}

	}



