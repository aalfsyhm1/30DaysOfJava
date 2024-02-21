package Exercise;
import java.util.Scanner;

public class SwithstatTest 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		char code;
		String spec="";
		
		System.out.println("Input the code for the specialization: ");
		code = sc.next().charAt(0);
		
		switch(code)
		{
			case 'A' : case 'a' : spec = "Multimedia";				
					   	break;
			case 'B' : case 'b' : spec = "Computer System";
						break;
			case 'C' : case 'c' : spec = "Software Engineering";
						break;
			case 'D' : case 'd' : spec = "Computer Network";
						break;
			default : System.out.println("Invalid code");
		
		
		}
		System.out.println(spec);
	}
}
