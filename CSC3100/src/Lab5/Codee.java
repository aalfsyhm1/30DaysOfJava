package Lab5; 
import java.util.Scanner; 
 
public class Codee 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
   
		//Declaring variables 
		String CodeProgram=""; 
		int NoSem; 
		int CreditHours; 
		int TuitionFees; 
   
		//Users enter the values first 
		System.out.println("Enter your code of the program: "); 
		CodeProgram = sc.nextLine(); 
		System.out.println("Enter your number of your semester: "); 
		NoSem = sc.nextInt(); 
		System.out.println("Enter your credit hours: "); 
		CreditHours = sc.nextInt();   
   
   
		if ( CodeProgram.equals("MCS"))  
			if ( NoSem == '1') 
			{ 
				TuitionFees = ( (250*CreditHours) + 1250); 
				System.out.println("The tuition fees are " + TuitionFees); 
			} 
			else 
			{ 
				TuitionFees = ( (250*CreditHours) + 1000); 
				System.out.println("The tuition fees are " + TuitionFees); 
			} 
  
		else if ( CodeProgram.equals("ME"))  
			if ( NoSem == '1') 
			{ 
				TuitionFees = ( (250*CreditHours) + 1400); 
				System.out.println("The tuition fees are " + TuitionFees); 
			} 
			else 
			{ 
				TuitionFees = ( (250*CreditHours) + 1100); 
				System.out.println("The tuition fees are " + TuitionFees); 
			} 
  
		else if ( CodeProgram.equals("MPM"))  
			if ( NoSem == '1') 
			{ 
				TuitionFees = ( (275*CreditHours) + 1250); 
				System.out.println("The tuition fees are " + TuitionFees); 
			} 
			else
			{
				TuitionFees = ( (275*CreditHours) + 1000); 
				System.out.println("The tuition fees are " + TuitionFees); 
			} 
   
		else if ( CodeProgram.equals("MEOH"))  
			if ( NoSem == '1') 
			{ 
				TuitionFees = ( (350*CreditHours) + 1250); 
				System.out.println("The tuition fees are " + TuitionFees); 
			} 
			else 
			{ 
				TuitionFees = ( (350*CreditHours) + 1000); 
				System.out.println("The tuition fees are " + TuitionFees); 
			} 
  
		else  
			System.out.println("Your Code of program is unvalid! "); 
     } 
 }