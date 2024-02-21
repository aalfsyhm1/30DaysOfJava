package Lab5;
import java.util.Scanner;

public class ParkingFees 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//declaring the variables
		int vehicle;
		double fees=0, hour;
		
		//info for the users of the vehicle keywords
		System.out.println("Welcome to UPM!");
		System.out.println("************************");
		System.out.println("(1) - for car");
		System.out.println("(0) - for motorcycle");
		System.out.println("************************");
		
		System.out.println();
		
		//users input their vehicle type
		System.out.print("Enter vehicle type : ");
		vehicle = sc.nextInt();
		
		//users input their parking hours
		System.out.print("Enter total parking hours : ");
		hour =  sc.nextDouble();
		
		System.out.println();
		
		//calculations for the fees depending on the hours parked
		System.out.println("************************");
		if (vehicle == 1)
		{
			System.out.println("You're driving a car!");
			if (hour <= 3)
				fees = 2;
			else
				fees = 2 + (hour - 3) * 0.5;
		}
		else if (vehicle == 0)
		{
			System.out.println("You're riding a motorcycle!");
			fees = 1;
		}
		else
			System.out.println("Invalid vehicle type!");
		System.out.println("************************");
		
		//the amount to pay by the users
		System.out.printf("\nYou have to pay RM%.2f" , fees);
		System.out.println("\nThank you and please come again!");
		
	}
}
