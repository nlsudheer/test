package learn_java;

import java.util.Scanner;
/*
 * http://www.freejavaguide.com/javasource1.htm
 * 
 * 
 */

public class ReverseNumber {

	public static void Reverse(int n) {
		int remainder=0,result=0;
		
		while(n>0) {
		
		remainder=n%10;
		result = result*10+remainder;
		n/=10;
				
	}
		System.out.println("Reversed the given number	" +result);
	}
	
	public static void main (String []args) {
		
		System.out.println("Enter teh number to ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int N = Integer.valueOf(str);
			
		System.out.println("Reverse the given number	"+N);
		Reverse(N);
		
	}
}
