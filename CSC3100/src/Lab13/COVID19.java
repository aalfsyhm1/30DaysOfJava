//by Alif Syahmi
package Lab13;
import java.util.Scanner;

public class COVID19 
{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args)
	{
		//create array methods for days, states, cases
		String [] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		String [] states = new String[2];
		int [][] cases = new int[2][7];
		
		int overall = 0;
		
		//create for loop to read states, cases
		for (int i = 0; i<cases.length; i++)
		{
			//user enters states
			System.out.print("State [" + (i+1) + "] : ");
			states[i] = sc.next(); 
			
			//user enters cases
			System.out.println("Number of cases a week : ");
			for (int j = 0; j<cases[i].length; j++)
			{
				cases[i][j] = sc.nextInt();		
			}
			System.out.println();
		}
			
		System.out.println("______________________________Covid 19 In a Week______________________________");
		
		System.out.print("Disease\\Day\t");
		
		//create for loop to print the table consists of days, cases, and total
		for(int i = 0; i<days.length; i++)
			System.out.print(days[i] + "\t");
		
		System.out.println("Total");
		
		for(int i = 0; i<cases.length; i++)
		{
			int total = 0;

			System.out.print(states[i] + "\t\t");
			
			for(int j = 0; j<cases[i].length; j++)
			{
				System.out.print(cases[i][j] + "\t");
				//calculate total cases for each state
				total += cases[i][j];
			}
			//calculate the overall total cases
			overall += total;
			System.out.println(total);
		}
		
		System.out.println("______________________________________________________________________________");
		System.out.println("Overall Total\t\t\t\t\t\t\t\t" + overall);
		
		System.out.println("\n\nLine Graph >>>>>>");
		System.out.println();
		
		//create for loop to display the line graph ad percentage
		for(int i = 0; i<cases.length; i++)
		{
			double total = 0;
			System.out.print(states[i] + "\t\t");
			
			for(int j = 0; j<cases[i].length; j++)
			{
				total += cases[i][j];
			}
			
			//calculation for percentage
			double percent = total/overall*100;
			for(double k = 0; k<percent; k++)
			{
				System.out.print("*");
			}
			System.out.printf(" %.2f" , percent);
			System.out.println(" %");
		}
	}
}