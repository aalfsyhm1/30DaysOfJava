//prepared by Alif 
package Lab4;

import java.util.Scanner;

public class Discount 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//declaring the variables
		double Price1, Price2, govTax, charge, total, sub1, sub2, subtotal, discount;
		int qty1, qty2;
		String item1, item2; 
		
		
		//user input the name, quantity and unit price for the items
		System.out.print("Item 1: ");
		item1 = sc.nextLine();
		
		System.out.print("Quantity: ");
		qty1 = sc.nextInt();
		
		System.out.print("Unit Price (RM): ");
		Price1 = sc.nextDouble();
		
		sc.nextLine(); //clear buffer
		
		System.out.print("Item 2: ");
		item2 = sc.nextLine();
		
		System.out.print("Quantity: ");
		qty2 = sc.nextInt();
		
		System.out.print("Unit Price (RM): ");
		Price2 = sc.nextDouble();
		
		System.out.println();
		System.out.println();
		
		//calculating the amount to pay for each item
		sub1 = qty1 * Price1;
		sub2 = qty2 * Price2;
		//calculating the total amount to pay for both items
		subtotal = sub1 + sub2;
		

		//displaying the info for each item
		System.out.println("Item 1: " + item1);
		System.out.println("Quantity: " + qty1);
		System.out.println("Unit Price: RM" + Price1);
		System.out.println("Amount: RM" + sub1);
		
		System.out.println("*****************************");
		
		System.out.println("Item 2: " + item2);
		System.out.println("Quantity: " + qty2);
		System.out.println("Unit Price: RM" + Price2);
		System.out.println("Amount: RM" + sub2);
		
		System.out.println();
		System.out.println();
		
		
		if (subtotal>=200)
			discount = subtotal - (subtotal * 0.1);
		else if (subtotal>=50)
			discount = subtotal - (subtotal * 0.05);
		else
			discount = subtotal;
			
		//government tax for the items purchased
		govTax = discount * 0.06;
		//calculating the service charge for the items purchased
		charge = discount * 0.1;
		//calculating the total amount to pay including the government tax and service charge
		total = discount + govTax + charge;
			
		//displaying the extra charges that should be included
		System.out.println("Subtotal before discount: RM" + subtotal);
		System.out.printf("Government Tax: RM %.2f" , govTax);
		System.out.println();
		System.out.println("Service Charge: RM" + charge);
			
		System.out.println();
		//displaying the amount of money should be paid for the items purchased
		System.out.printf("Total after discount: RM %.2f" , total);
		
		
		
		
	}
}
