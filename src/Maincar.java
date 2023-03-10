/**
 * 
 */
package ustbatchno3.junit5testcases;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Administrator
 *
 */
public class Maincar {

	

		
		public static List<String> sdataset(String f) {
			
//			Map<String,Map>=new HashMap<>();
//			Map<String,String> ma
//			map1.
			
//			List<String>ls=Arrays.asList("Kerala","Tamilnadu","Punjab");
//			String STE="KE";
//			List<String>S=ls.stream().map(t->t.toUpperCase()).filter(t->t.startsWith(STE)).collect(Collectors.toList());
//			System.out.println(S); 
			
			Map<String,String> map=new HashMap<>() ;
			map.put("KL","kERALA");
			map.put("TN","Tamilnadu");
			map.put("KA","Karnadaka");
		String	DE=f.substring(0,2);
//		System.out.println(DE);
		boolean T=map.containsKey(DE);
		String s1 = null;
		if(T==true) {
			s1=(map.get(DE));
			}
		if(DE.equals("KL"))	{
			Map<String,String> map1=new HashMap<>() ;
				map1.put("05","Kottayam");
				map1.put("07","Ekm");
				map1.put("01","Tvm");
			String	DE1=f.substring(2,4);
			boolean T1=map1.containsKey(DE1);
			String s3 = null;
			if(T1==true) {
				s3=(map1.get(DE1));
				}
		
			List<String> lm=Arrays.asList(s1,s3);
			return lm;
		}
		else if(DE.equals("TN"))	{
			Map<String,String> map2=new HashMap<>() ;
			map2.put("05","KALLAR");
			map2.put("07","OOTY");
			map2.put("01","TALAVOOR");
		String	DE1=f.substring(2,4);
		boolean T1=map2.containsKey(DE1);
		String s3 = null;
		if(T1==true) {
			s3=(map2.get(DE1));
			}

		List<String> lm=Arrays.asList(s1,s3);
		return lm;
	}
		return null;
		
					
			
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(sdataset("TN07BM8989"));
			
			

		}

	}



