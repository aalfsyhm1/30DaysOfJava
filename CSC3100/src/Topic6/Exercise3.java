package Topic6;
import java.util.Scanner;

public class Exercise3 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int num=1, total=0;
		
		while (num != 0)
		{
			System.out.println("Enter No : ");
			num = sc.nextInt();
			
			total = total + num;

			
		}
		System.out.println("The sum is " + total);
	}
}
