package Lab10;
import java.util.Scanner;

public class OddEven {
	
	static int EV=0, OD=0, total=0, i=0;
	static double average=0;
	
	//main body
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int  i=0, read=0;
		double av;
		
		System.out.println("Enter integer: ");
		
		//repetition to get the input, calculate total and average.
		do
		{
			read = getNum(sc);	
			calculateTotal(read);
			i++;
		}
		while(read!=0);
		
		av = calculateAverage(i);
		numberofOddEven(av);
	}
	
	
	//input and to determine odd and even number
	public static int getNum(Scanner sc)
	{
		int number = sc.nextInt();
		
		if (number % 2 == 0)
			EV = EV + 1;
		else
			OD = OD + 1;
		
		return number;
	}
	
	
	//calculation
	public static void calculateTotal(int number)
	{
		
		total = total + number;
	}
	
	
	//average
	public static double calculateAverage( int i)
	{
		average = total/--i;
		return average;
	}

	
	//print stuff
	public static void numberofOddEven(double average)
	{
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		System.out.println("Even: " + EV + " and Odd: " + OD );
	}
	
}
