import java.io.DataInputStream;
import java.io.IOException;


public class Read {
	public static void main(String s[]) throws NumberFormatException, IOException{
		int a,b,c;
		
		DataInputStream x = new DataInputStream(System.in);
		System.out.println("Enter the first number: ");
		a = Integer.parseInt(x.readLine());
		
		System.out.println("Enter the second number: ");
		b = Integer.parseInt(x.readLine());
		
		c= a+b;
		
		System.out.print("Sum of two numbers is " +c);
	}
}
