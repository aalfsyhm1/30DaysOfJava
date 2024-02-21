package Lab13;
import java.util.Scanner;

public class GolfClub 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		//create array
		int [] memberId = {10011, 10012, 20011, 20012, 10013, 10014, 20013};
		int [] daysPlayed = readInput();
		double [] Fee = calculateFee (daysPlayed);
		displayOutput(memberId, daysPlayed, Fee);
	}
	
	//method to get input for days from the user
	public static int [] readInput()
	{
		int [] days = new int[7];
		
		for (int i = 0; i<days.length; i++)
		{
			System.out.println("The number of days played for player " + (i+1) + ": ");
			days[i] = sc.nextInt();
		}
		return days;
	}
	
	//method to calculate the price
	public static double [] calculateFee (int[] daysPlayed)
	{
		double [] fee = new double[7];
		for(int i=0; i<fee.length; i++)
		{
			if(daysPlayed[i] <= 5)
				fee[i] = 150 + 100;
			else if(daysPlayed[i] <= 10)
				fee[i] = 150 + 200;
			else if(daysPlayed[i] <= 15)
				fee[i] = 150 + 300;
			else 
				fee[i] = 150 + 500;
		}
		return fee;
	}
	
	//method to print
	public static void displayOutput(int[] memberID, int[] daysPlayed, double[] fee)
	{
		for(int i=0; i<memberID.length; i++)
		{
			System.out.println("\n- Player " + (i+1) + " info -");
			System.out.println("Member ID   : " + memberID[i]);
			System.out.println("Days Played : " + daysPlayed[i]);
			System.out.println("Fee         : RM" + fee[i]);
		}
	}
}
