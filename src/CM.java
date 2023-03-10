/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class CM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int length = s.nextInt();
		
		
		int []array= new int[length];
		int []cm=new int[length];
		
		
		int sum=0;
		
		System.out.println("Enter the elements of the array");
		for (int i=0; i<length;i++)
		{
			array[i]=s.nextInt();
			sum=sum+array[i];
			cm[i]=sum;
			
		}
		System.out.println("The final result is:");
		for(int i=0;i<length;i++) {
			System.out.println(cm[i]);
		}
		
		
	}

}
