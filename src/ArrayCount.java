/**
 * 
 */
package array;

/**
 * @author Administrator
 *
 */
public class ArrayCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]= {4,-4,6,8,-9,0,4,-7,5,6};
		int negativeCount=0;
		int positiveCount=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]<0){
				negativeCount=negativeCount+1;
				
			}
			
			else if (array[i]>0){
				positiveCount= positiveCount +1;
			}
			else {
				System.out.println("0 is neutral");
			}
			
		}
		System.out.println("Count of Positive elements :" +positiveCount);
		System.out.println("Count of Negativde elements :" +negativeCount);	
		
		
	}
	

}
