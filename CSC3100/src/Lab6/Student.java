package Lab6;
import java.util.Scanner;

public class Student 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		char major, student;
		String Major = "", Student = "";
		
		System.out.println("Enter two characters: ");
		Major = sc.next();
		major = Major.charAt(0);
		student = Major.charAt(1);
		
		
		
		if (major == 'I')
			Major = "Information Management";
		else if (major == 'C')
			Major = "Computer Science";
		else if (major == 'A')
			Major = "Accounting";

		
		if (student == '1')
			Student = "Freshman";
		else if (student == '2')
			Student = "Sophomore";
		else if (student == '3')
			Student = "Junior";
		else if (student == '4')
			Student = "Senior";
		
			
			
		System.out.println(Major + " " + Student);
	}
}
