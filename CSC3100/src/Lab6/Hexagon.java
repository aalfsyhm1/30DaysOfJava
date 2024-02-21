package Lab6;
import java.util.Scanner ;

public class Hexagon 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
    
		//Declaring variables
		double s,area;
		final double PI = 3.14159; 
    
    
		System.out.print("Enter the side:");
		s = sc.nextDouble();
    
		//calculation
		area = (6 * Math.pow(s,2))/ (4 * Math.tan(Math.PI/6) );
    
		System.out.printf("The area of the hexagon is %.2f" , area); 
  }

}