/**
 * 
 */
package ustbatchno3.junit5testcases;

//import java.time.LocalDate;
//import java.util.List;
//import java.util.stream.IntStream;



//sir
import java.time.LocalDate;
import java.time.Month;

/**
 * @author Administrator
 *
 */
public class Golscoincount {

	
	


			public String  findgold(LocalDate date) {
				int dayOfYear=date.getDayOfYear();
				
				if (dayOfYear<80 ||dayOfYear>365) {
					return "****";
				}
				else if(dayOfYear>80&&dayOfYear<=172)
				{
					return "***";
				}
				else if(dayOfYear>172&&dayOfYear<=266)
				{
					return"*";
				}
				else if (dayOfYear>265&&dayOfYear<=365)
				{
					return " ";
				}
				return "0";
			
				
			}


	}



//		public static long test(long noOfDaysBetween, IntStream stream) {
//			// TODO Auto-generated method stub
//			return 5;
//		}
//
//		public static long test1(long noOfDaysBetween, IntStream stream1) {
//			// TODO Auto-generated method stub
//			return 3;
//		}
//
//		public static long test2(long noOfDaysBetween, IntStream stream2) {
//			// TODO Auto-generated method stub
//			return 2;
//		}
//
//		public static long test3(long noOfDaysBetween, IntStream stream3) {
//			// TODO Auto-generated method stub
//			return 0;
//		}

	