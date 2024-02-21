package Lab2;
import java.util.Scanner;

public class GratuityTotal 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		double subtotal, gratuityR, gratuity, total;
		
		System.out.println("Enter subtotal : ");
		subtotal = sc.nextDouble();
		
		System.out.println("Enter gratuity rate : ");
		gratuityR = sc.nextDouble();
		
		gratuity = gratuityR / subtotal;
		total = (gratuityR + 100)/ 100 * subtotal ; 
		
		System.out.println("Gratuity : $" + gratuity);
		System.out.println("Total is $" + total);
		
	}
	
}
