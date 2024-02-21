package Lab7;
import java.util.Scanner;

public class Assignment3 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		//declaring the variables
		char letter;
		int number;
		
		//user input the letter
		System.out.print("Enter a letter: ");
		letter = sc.next().charAt(0);
		
		//determining the output for the letter
		switch (letter)
		{
		case 'A': case 'a':
		case 'B': case 'b':
		case 'C': case 'c':
			number = 2;
			System.out.println("The corresponding number is " + number);
			break;
		case 'D': case 'd':
		case 'E': case 'e':
		case 'F': case 'f':
			number = 3;
			System.out.println("The corresponding number is " + number);
			break;
		case 'G': case 'g':
		case 'H': case 'h':
		case 'I': case 'i':
			number = 4;
			System.out.println("The corresponding number is " + number);
			break;
		case 'J': case 'j':
		case 'K': case 'k':
		case 'L': case 'l':
			number = 5;
			System.out.println("The corresponding number is " + number);
			break;
		case 'M': case 'm':
		case 'N': case 'n':
		case 'O': case 'o':
			number = 6;
			System.out.println("The corresponding number is " + number);
			break;
		case 'P': case 'p':
		case 'Q': case 'q':
		case 'R': case 'r':
		case 'S': case 's':
			number = 7;
			System.out.println("The corresponding number is " + number);
			break;
		case 'T': case 't':
		case 'U': case 'u':
		case 'V': case 'v':
			number = 8;
			System.out.println("The corresponding number is " + number);
			break;
		case 'W': case 'w':
		case 'X': case 'x':
		case 'Y': case 'y':
		case 'Z': case 'z':
			number = 9;
			System.out.println("The corresponding number is " + number);
			break;	
		default : System.out.println(letter + " is an invalid input");
		}
		
		
	}
}
