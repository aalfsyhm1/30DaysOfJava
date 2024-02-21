package Lab8;

import java.util.Scanner;

public class Question2 {
	public static void main (String[] args)
	{
		double quantity=0, totquantity=0, unitprice=0, price=0, subtotal=0, tax, servicecharge, total=0, afterdiscount=0;
		int item;
		//create a scanner object

		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		System.out.printf("\n******************************************");
		System.out.printf("\n*             	 Welcome	     	 *");
		System.out.printf("\n******************************************");
		
		//input from user
		
		System.out.print("\nItem : 1\n");
		
		do {
			
			System.out.print("Product : ");
			String product = in.nextLine();
			System.out.print("Quantity: ");
			quantity = input.nextDouble();
			System.out.print("Unit price: RM ");
			unitprice = input.nextDouble();
			
			//calculate total price for item
			price=unitprice*quantity;
			subtotal+=price;
			System.out.printf("Price item: RM %.2f\n", price);
			
			System.out.printf("\n_________________________________________________");
			
			System.out.print("\nEnter (-9999) to stop adding another item.");
			System.out.print("\nItem : ");
			item=input.nextInt();
			
		}while(item!=-9999);
		
		//calculate for receipt details
		if(subtotal<50)
		{
			afterdiscount=subtotal;
		}
		else if(subtotal<200 && subtotal>=50)
		{
			afterdiscount=subtotal-(subtotal*0.05);
		}
		else
		{
			afterdiscount=subtotal-(subtotal*0.1);
		}
			
		//calculation for tax, service charge and total
		tax=afterdiscount*0.06;
		servicecharge=afterdiscount*0.1;
		total=afterdiscount+tax+servicecharge;
		
		//display output
		System.out.printf("Subtotal: RM %.2f\n", subtotal);
		System.out.printf("After discount: RM %.2f\n", afterdiscount);
		System.out.printf("Government tax: RM %.2f\n", tax);
		System.out.printf("Service charge: RM %.2f\n", servicecharge);
		System.out.printf("\n=========================================");
		System.out.printf("\nTotal: RM %.2f", total);
		System.out.printf("\n=========================================");
		
		System.out.printf("\n\n*  Thank you for buying  *");
		System.out.printf("\nPlease come again");
	}

}
