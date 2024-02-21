package Lab6;
import java.util.Scanner;
public class Polygon 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner (System.in);
    
		//Declaring variables
		double area,s;
		final double PI = 3.14159;
		int n;
    
		System.out.print("Enter the number of sides: ");
		n = sc.nextInt();
    
    
		System.out.print("Enter the side: ");
		s = sc.nextDouble();
    
		//calculation
    
		area = (n * Math.pow(s,2)) / (4 * Math.tan(Math.PI/n));
    
		System.out.println("The area of the polygon is "+ area);
    
	}

}