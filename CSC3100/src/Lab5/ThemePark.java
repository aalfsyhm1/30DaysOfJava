package Lab5;
import java.util.Scanner;

public class ThemePark 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String park;
		int age;
		double price=0;
		
		
		
		System.out.println("Welcome to UPM Theme Park!!");
		System.out.println("************************");
		System.out.println("TP - ThemePark");
		System.out.println("WP - WaterPark");
		System.out.println("BP - Both Park");
		System.out.println("************************");
		
		System.out.print("\nPlease input the code for the ticket that you would like to purchase : ");
		park = sc.next();
		
		System.out.print("Please state your age : ");
		age = sc.nextInt();
		
		if (age<3)
		{
			if (park.equals("TP"))
				price = 0;
			else if (park.equals("WP"))
				price = 7;
			else if (park.equals("BP"))
				price = 5;
			else
				System.out.println("Invalid Ticket!");
		}
		else if (age <= 12)
		{
			if (park.equals("TP"))
				price = 10;
			else if (park.equals("WP"))
				price = 15;
			else if (park.equals("BP"))
				price = 20;
			else
				System.out.println("Invalid Ticket!");
		}
		else if (age <= 20)
		{
			if (park.equals("TP"))
				price = 20;
			else if (park.equals("WP"))
				price = 25;
			else if (park.equals("BP"))
				price = 40;
			else
				System.out.println("Invalid Ticket!");
		}
		else if (age <= 54)
		{
			if (park.equals("TP"))
				price = 25;
			else if (park.equals("WP"))
				price = 30;
			else if (park.equals("BP"))
				price = 45;
			else
				System.out.println("Invalid Ticket!");
		}
		else
		{
			if (park.equals("TP"))
				price = 10;
			else if (park.equals("WP"))
				price = 15;
			else if (park.equals("BP"))
				price = 20;
			else
				System.out.println("Invalid Ticket!");
		}
		
		System.out.printf("\nThe Ticket price costs RM%.2f" , price);
		System.out.println("\nThank you for coming!");
		
		
	}
}
