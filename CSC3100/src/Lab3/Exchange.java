package Lab3;
import java.util.Scanner;

public class Exchange 
{
	public static void main(String[]args)
	{
    
	    Scanner sc= new Scanner(System.in);
	    
	    //Declaring the variables
	    int amount, amount1, amount2, amount3 ,amount4 ,amount5 ;
	    int bills50, bills20, bills10, bills5, bills1;
	    
	    System.out.print("Enter Malaysia Ringgit Amount");
	    amount = sc.nextInt();
	    System.out.println();
	    
	    //calculations
	    bills50 = amount/50;
	    amount1 = amount - 50 * bills50;
	    bills20 = amount1/20;
	    amount2 = amount1 - 20 * bills20;
	    bills10 = amount2/10;
	    amount3 = amount2 - 10 * bills10;
	    bills5 = amount3/5;
	    amount4= amount3 - 5 * bills5;
	    bills1 = amount4/1;
	    amount5= amount4 - 1 * bills1;
	    
	    System.out.println("Number of RM50 bills: " + bills50);
	    System.out.println("Number of RM20 bills: " + bills20);
	    System.out.println("Number of RM10 bills: " + bills10);
	    System.out.println("Number of RM5 bills: " + bills5);
	    System.out.print("Number of RM1 bills: " + bills1);
  	}
  

}