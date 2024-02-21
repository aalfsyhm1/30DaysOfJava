package Lab8;

import java.util.Scanner; //input values

public class Question1 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		//declaring variables
		double mark1, mark2, mark3, test1, test2, exam;
		double assignment, Test1, Test2, FinalExam, Total;
		String grade;
		char student;
		int i=1;
		
		System.out.println("Would you like to enter Student " + i + " mark (Y/N) : ");
		student = sc.next().charAt(0);
		
		while (student != 'N')
		{	
			
			//input section
			System.out.println("Enter mark for Assignment1: ");
			mark1 = sc.nextDouble(); //assignment1
			
			System.out.println("Enter mark for Assignment2: ");
			mark2 = sc.nextDouble();
			
			System.out.println("Enter mark for Assignment3: ");
			mark3 = sc.nextDouble();
			
			System.out.println();
			
			System.out.println("Enter your Test1 mark: ");
			test1 = sc.nextDouble();
			
			System.out.println("Enter your Test2 mark: ");
			test2 = sc.nextDouble();
			
			System.out.println();
			
			System.out.println("Enter your Final Exam mark: ");
			exam = sc.nextDouble();
			
			System.out.println();
			
			System.out.println("---------------------------------------------------------");
			
			System.out.println();
			
			//calculations
			assignment = (mark1 + mark2 + mark3)/60.0 * 35;
			Test1 = test1/30.0 * 15;
			Test2 = test2/40.0 * 15;
			FinalExam = exam/60.0 * 30;
			Total = assignment + Test1 + Test2 + FinalExam;
			
			//student grades
			if (Total < 40)
				grade = "F";
			else if (Total < 45)
				grade = "D";
			else if (Total < 50)
				grade = "C-";
			else if (Total < 55)
				grade = "C";
			else if (Total < 60)
				grade = "C+";
			else if (Total < 65)
				grade = "B-";
			else if (Total < 70)
				grade = "B";
			else if (Total < 75)
				grade = "B+";
			else if (Total < 80)
				grade = "A-";
			else if (Total <= 100)
				grade = "A";
			else 
				grade = "-unknown-";
			
			
			//output section
			System.out.println("Total mark for CSC3100 is " + Total + " with grade " + grade );
			
			System.out.println("(Assignment: " + assignment + " Test 1: " + Test1 + " Test 2: " + Test2 + " Final: " + FinalExam + ")");
			i++;
			System.out.println("\nWould you like to enter Student " + i + " mark (Y/N) : ");
			student = sc.next().charAt(0);
		}
	}
}
