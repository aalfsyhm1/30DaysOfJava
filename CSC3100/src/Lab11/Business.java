package Lab11;
import java.util.Scanner;


public class Business 
{	
	//declare as global variables
	static Scanner sc = new Scanner (System.in);
	static double totalGr=0, donation, percent, NetSale;
	
	public static void main (String[] args)
	{
		
		double Donation=0, Net=0;
		int PkgCode, totalPkg=0, qty=0,Price=0, total = 0;
		
		//info for the users
		System.out.println("Enter '0' as the Package Code to END the programme.");
		System.out.println("\n\tPackage Code  |   Price (MYR) ");
		System.out.println("\t     1        |      50.00    ");
		System.out.println("\t     2        |     100.00    ");
		System.out.println("\t     3        |     200.00    ");
		
		//first input of the code
		System.out.print("\nEnter Package Code: ");
		PkgCode = sc.nextInt();
		
		//loop body until the user enter 0
		while(PkgCode!=0)
		{
			//switch statement to determine the total price for each code
			switch (PkgCode)
			{
				case 1 : 
					qty = inputQuantity(PkgCode);
					Price = qty * 50;
					break;
				case 2 : 
					qty = inputQuantity(PkgCode);
					Price = qty * 100;
					
					break;
				case 3 : 
					qty = inputQuantity(PkgCode);
					Price = qty * 200;
					
					break;
				default : System.out.println("Invalid Package Code!");
				qty = 0;
				Price = 0;
			}

			//updating the total package
			total = total + qty;

			//methods for all the calculations
			totalPkg = calcTotalPackage(qty, totalPkg);
			totalGr = calcGrossSaleAllPackage(Price, total);
			Donation = calcDonation(totalGr);
			Net = calcNetSale(totalGr, Donation);
			
			System.out.println();
			//input for the next code
			System.out.print("Enter the next Package Code: ");
			PkgCode = sc.nextInt();
			
			
			
			
		}
		
		//displaying the output
		System.out.println("\n**The programme has ended**");
		System.out.println();
		System.out.println("----------------------------");
		printInformation(totalPkg, totalGr, Donation, Net);
		System.out.println("----------------------------");
	}
	
	//read quantity
	public static int inputQuantity(int packageCode)
	{
		int quantity;
		System.out.print("Enter quantity for Package " + packageCode + ": ");
		quantity = sc.nextInt();
		return quantity;
	}
	
	//calculate total number package
	public static int calcTotalPackage(int quantity, int totalPackage)
	{
		return totalPackage = totalPackage + quantity;
	}
	
	//calculate total price
	public static double calcGrossSaleAllPackage(double totalPrice, double totalGrossSaleAllPackage)
	{
		return totalGr = totalGr + totalPrice;
	}
	
	//calculate donation
	public static double calcDonation(double totalGrossSaleAllPackage)
	{
		
		if (totalGrossSaleAllPackage>100000)
			percent = 0.15;
		else if (totalGrossSaleAllPackage>10000)
			percent = 0.1;
		else if (totalGrossSaleAllPackage>1000)
			percent = 0.05;
		
		return donation = totalGrossSaleAllPackage * percent;
	}
	
	//calculate net total
	public static double calcNetSale(double totalGrossSaleAllPackage, double donation)
	{
		return NetSale = totalGrossSaleAllPackage - donation;
	}
	
	//print output
	public static void printInformation(int totalPackage, double totalGrossSaleAllPackage, double donation, double netSale)
	{
		System.out.println("Total sold packages : " + totalPackage);
		System.out.println("Total gross sale : " + totalGrossSaleAllPackage);
		System.out.println("Total donation : " + donation);
		System.out.println("Net sale : " + netSale);
	}

}
