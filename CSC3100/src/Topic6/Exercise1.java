package Topic6;
import java.util.Scanner;

public class Exercise1 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int i = 0, total = 0, Total = 0;
		
		while (i < 100)
		{
			int number = (int) (Math.random()*100);
			System.out.println(number);
			
			if (number > 50)
				total++;
			if (number <= 50)
				Total++;
			i++;
		}
		System.out.println("Greater than 50 : " + total);
		System.out.println("Less than and equals 50 : " + Total);
		
	}
}
