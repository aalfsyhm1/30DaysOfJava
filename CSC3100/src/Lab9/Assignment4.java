package Lab9;
import java.util.Scanner;

public class Assignment4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		//initializing the variables
		int Package, i=1;
		double minutes,charge=0, Tminutes=0, Total=0;
		char user = 'y';
		
		System.out.println("///////////////////////////////////////////////////");
		System.out.println("WELCOME TO PUTRATEL, NO. 1 TELCO IN MALAYSIA");
		
		//repetition for the users
		while (user != 'n')
		{
			System.out.println("\n--------------------------------------------------");
			System.out.println("= Welcome customer " + i + ", we are here to assist you! =");
			System.out.println("--------------------------------------------------");
			
			System.out.println("\n\nPlease enter the number of your package (1/2) : ");
			Package = sc.nextInt();
			
			System.out.println("Please enter the minutes : ");
			minutes = sc.nextDouble();
			
			//calculations to determine the charge based on package and minutes
			if (Package == 1)
				if (minutes <= 1000)
					charge = 50;
				else 
					charge = 1000 * 0.18 + (minutes - 1000) * 0.35;
			else if (Package == 2)
				if (minutes <= 1000)
					charge = minutes * 0.18;
				else
					charge = 1000 * 0.18 + (minutes - 1000) * 0.55;
			else
			{
				System.out.println("Invalid Package number entered!");
				break;
			}
			//total for all the customers
			Tminutes = Tminutes + minutes;
			Total = Total + charge;
			
			//output for each customer
			System.out.println("\n\tWOW! You've spent " + minutes + " minutes on the phone!");
			System.out.printf("\tSadly it's not free for you, please pay RM%.2f" , charge);
			System.out.println("\n\tHopefully you enjoyed using Package " + Package);
			
			//for more than one customer
			System.out.println("\n\nMore customers? (y/n) : ");
			user = sc.next().charAt(0);
			
			i++;
			
	
		}
		
		//output for all customers in total
		System.out.println("\n" + Tminutes + " minutes spent on the phone by all the customers!");
		System.out.println("Total : RM" + Total);
		
		
	}
}
