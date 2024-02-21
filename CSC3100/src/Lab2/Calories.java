package Lab2;
import java.util.Scanner;

public class Calories 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int age;
		double inches, pounds, cm, kg, female, male;
		final double PKG = 0.454, ICM = 2.54;
		char gender;
		
		System.out.println("Enter your height in inches : ");   //user input their height in inches
		inches = sc.nextDouble();
		
		System.out.println("Enter your weight in pounds : ");   //user input their weight in pounds
		pounds = sc.nextDouble();
		
		System.out.println("Enter your gender (F/M) : ");       //user input their gender
		gender = sc.next().charAt(0);
		
		System.out.println("Enter your age : ");                //user input their age
		age = sc.nextInt();
		
		//calculations
		cm = inches * ICM;
		kg = pounds * PKG;
		female = 655.1 + (9.563 * kg) + (1.850 * cm) - (4.676 * age);
		male = 66.5 + (13.75 * kg) + (5.003 * cm) - (6.75 * age);
		
		System.out.println(pounds + " pounds is " + kg + " kilograms and " + inches + " inches = " + cm + " cm" );
		
		if (gender == 'F')
			System.out.println("Your daily calories is " + female);        //this will print out if the user is female
		else if ( gender == 'M')
			System.out.println("Your daily calories is " + male);          //else if the user is male
		else
			System.out.println("Invalid gender! Your calories cannot be displayed");   //is the user type in an invalid input
		
		
		
	}
}
