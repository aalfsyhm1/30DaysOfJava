package Lab12;
import java.util.Scanner;

public class Q1 
{
	static Scanner sc = new Scanner(System.in);
	static int countA=0,countB=0,countC=0,countD=0;
	static double TotWeight=0;
	
	
	public static void main(String[]args) 
  	{
    	
	    
	    double[] weight= new double[3];
	    String[] grade = new String[weight.length];
	    
	    for(int i=0; i<weight.length; i++) 
		{
	    	getGrade(weight, grade, i);
	    	TotWeight += weight[i];
	    	CountGrade(grade, i);
		}
	    System.out.println("Total weight for all the eggs is " + TotWeight + "g");
	    
	   displayReport(countA, countB, countC, countD);

  	}
	
	public static void getGrade(double weight[], String grade[], int i)
	{

			System.out.println("Enter the weight of the egg " + (i+1) + " :");
		    weight[i]=sc.nextDouble();
		    
		    if (weight[i] > 44.0)
		    	grade[i]="A";
		    else if (weight[i] >= 30.0)
		    	grade[i]="B";
		    else if (weight[i] >= 25.0)
		    	grade[i]="C";
		    else if (weight[i] < 25)
		    {
		    	grade[i]="D";
		    	System.out.println("Rejected");
		    }
	}
	
	public static void CountGrade(String grade[], int i)
	{
		if (grade[i].equals("A"))
	    	countA++;
	    if (grade[i].equals("B"))
	    	countB++;
	    if (grade[i].equals("C"))
	    	countC++;
	    if (grade[i].equals("D"))
	    	countD++;
	    
	}
	
	public static void displayReport(int countA, int countB, int countC, int countD)
	{
		System.out.println("Grade A: " + countA);
		System.out.println("Grade B: " + countB);
		System.out.println("Grade C: " + countC);
		System.out.println("Grade D: " + countD);
	}
  
}