package Lab4 ;
import java.util.Scanner;

public class HealthStat 
{
	public static void main(String[]args) 
    {
      
		Scanner sc = new Scanner(System.in);
      
		//declaring variables
		double BMI, kg, cm, waist;
		String status = "";
		char gender;
		boolean health;
		
		System.out.print("Enter your gender(F/M) : ");
		gender =sc.next().charAt(0);
      
		System.out.print("Enter your height in cm : ");
		cm = sc.nextDouble(); 
      
		System.out.print("Enter your weight in kg : ");
		kg = sc.nextDouble();
		
		System.out.print("Enter your waist size in inches : ");
		waist = sc.nextDouble();
      
		System.out.println();
		
		//calculation
		BMI= (kg / (cm * cm)) * 10000;
		
		if (BMI >= 40)
			status = "Morbidy Obese";
		else if (BMI >= 35)
			status = "Severely Obese";
		else if (BMI >= 30)
			status = "Obese";
		else if (BMI >= 25)
			status = "Overweight";
		else if (BMI >= 18.5)
			status = "Normal";
		
		
		System.out.println("--Health Status--");
		System.out.println("Your BMI status is " + status);
		System.out.println();
		
		
		if (gender == 'F')
			if (waist > 35)
				System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!----");
			else 
				System.out.println("----- GOOD LIFE STYLE!!----");
		else if (gender == 'M')
			if (waist > 40)
				System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!----");
			else 
				System.out.println("----- GOOD LIFE STYLE!!----");
		else
			System.out.println("Your gender is invalid");
    }
}