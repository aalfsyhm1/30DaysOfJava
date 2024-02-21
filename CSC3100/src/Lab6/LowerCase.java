package Lab6;
import java.util.Scanner;

public class LowerCase 
{
	public static void main (String [] args)
	{
	
		int Letter =(int) (97 + Math.random() * 26);
		char character = (char) Letter;
		System.out.println("A random lowercase letter is " + character);
	}
}
