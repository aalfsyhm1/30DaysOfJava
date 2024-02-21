package Lab7;
import java.util.Scanner;

public class Assignment_3 
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
		if ((letter == 'A') || (letter == 'a') || (letter == 'B') || (letter == 'b') || (letter == 'C') || (letter == 'c'))
		{
			number = 2;
			System.out.println("The corresponding number is " + number);
		}
		else if ((letter == 'D') || (letter == 'd') || (letter == 'E') || (letter == 'e') || (letter == 'F') || (letter == 'f'))
		{
			number = 3;
			System.out.println("The corresponding number is " + number);
		}
		else if ((letter == 'G') || (letter == 'g') || (letter == 'H') || (letter == 'h') || (letter == 'I') || (letter == 'i'))
		{
			number = 4;
			System.out.println("The corresponding number is " + number);
		}
		else if ((letter == 'J') || (letter == 'j') || (letter == 'K') || (letter == 'k') || (letter == 'L') || (letter == 'l'))
		{
			number = 5;
			System.out.println("The corresponding number is " + number);
		}
		else if ((letter == 'M') || (letter == 'm') || (letter == 'N') || (letter == 'n') || (letter == 'O') || (letter == 'o'))
		{
			number = 6;
			System.out.println("The corresponding number is " + number);
		}
		else if ((letter == 'P') || (letter == 'p') || (letter == 'Q') || (letter == 'q') || (letter == 'R') || (letter == 'r') || (letter == 'S') || (letter == 's'))
		{
			number = 7;
			System.out.println("The corresponding number is " + number);
		}
		else if ((letter == 'T') || (letter == 't') || (letter == 'U') || (letter == 'u') || (letter == 'V') || (letter == 'v'))
		{
			number = 8;
			System.out.println("The corresponding number is " + number);
		}
		else if ((letter == 'W') || (letter == 'w') || (letter == 'X') || (letter == 'x') || (letter == 'Y') || (letter == 'y') || (letter == 'Z') || (letter == 'z'))
		{
			number = 9;
			System.out.println("The corresponding number is " + number);
		}
		else
			System.out.println(letter + " is an invalid input");
		
		
		
	}
}
