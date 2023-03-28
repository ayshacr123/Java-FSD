package batch3ust.JavaLearning;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s =sc.nextLine();
		int i=0,count=0;
//		System.out.println(s.charAt(i));
//		System.out.println(s.charAt(s.length()-1));
//			while(s.charAt(i)!=s.charAt(s.length()-i)) {
				while(i<s.length()-1/2) {
				if(s.charAt(i)==s.charAt(s.length()-i-1)) {
					count=count+1;
				}
				else {
					count=count-1;
					
				}
				i++;
				}
		if(count==s.length()-1/2) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("No palindrome");
		}

	}

}
