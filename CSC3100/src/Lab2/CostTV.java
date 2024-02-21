package Lab2;

public class CostTV 
{
	public static void main (String[] args)
	{
		double price = 900;            //price before tax
		double total = price * 1.08;    //price after tax
		
		System.out.println("The price of the TV is RM900");
		System.out.println("Sales tax is 8%");
		System.out.printf("The total price including sales tax is RM %.2f" , total );
	}
}
