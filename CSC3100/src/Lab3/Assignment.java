package Lab3;

import java.util.Scanner;

public class Assignment 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		//declaring variables
		int mark1, mark2, mark3, test1, test2, exam;
		double assignment, Test1, Test2, FinalExam, Total;
		
		//input section
		System.out.println("Enter mark for Assignment1: ");
		mark1 = sc.nextInt();
		
		System.out.println("Enter mark for Assignment2: ");
		mark2 = sc.nextInt();
		
		System.out.println("Enter mark for Assignment3: ");
		mark3 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Enter your Test1 mark: ");
		test1 = sc.nextInt();
		
		System.out.println("Enter your Test2 mark: ");
		test2 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Enter your Final Exam mark: ");
		exam = sc.nextInt();
		
		System.out.println();
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println();
		
		//calculations
		assignment = (mark1 + mark2 + mark3)/60.0 * 35;
		Test1 = test1/30.0 * 15;
		Test2 = test2/30.0 * 15;
		FinalExam = exam/60.0 * 30;
		Total = assignment + Test1 + Test2 + FinalExam;
		
		
		//output section
		System.out.println("Total mark for CSC3100 is " + Total );
		
		System.out.println("(Assignment: " + assignment + " Test 1: " + Test1 + " Test 2: " + Test2 + " Final: " + FinalExam + ")");
		
	}
}
