package Topic6;
import java.util.Scanner;

public class Exercise2 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int i = 0, min=999999999;
		
		
		while (i < 5)		
		{
			System.out.println("Enter the integer" + (i+1) + " : ");
			int num = sc.nextInt();
			
			if (num < min)
				min = num;
			i++;
		}
		System.out.println("The smallest number is " + min);
		
		

	}
}
