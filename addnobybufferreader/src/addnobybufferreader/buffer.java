package addnobybufferreader;

import java.io.*;

public class buffer {
	public static void main(String s[]) throws Exception{
		
		int a,b,c;
		
		BufferedReader enter = new BufferedReader( new InputStreamReader (System.in)); 
		
		System.out.println("Enter the first number: ");
		a = Integer.parseInt(enter.readLine());
		
		System.out.println("Enter the second number: ");
		b = Integer.parseInt(enter.readLine());
				
		c= a+b;
		
		System.out.print("Sum of two numbers is " +c);
	}
}
