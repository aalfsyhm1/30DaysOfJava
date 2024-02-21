package Lab2;
import java.util.Scanner;

public class Conversion 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double inches, pounds, cm, kg;
		final double PKG = 0.454, ICM = 2.54;
		
		System.out.println("Enter your height in inches : ");   //user input their height in inches
		inches = sc.nextDouble();
		
		System.out.println("Enter your weight in pounds : ");   //user input their weight in pounds
		pounds = sc.nextDouble();
		
		cm = inches * ICM;
		kg = pounds * PKG;
		
		System.out.print(pounds + " pounds is " + kg + " kilograms and " + inches + " inches = " + cm + " cm" );
		
	}
}
