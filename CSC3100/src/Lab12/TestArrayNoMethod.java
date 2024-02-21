package Lab12;
import java.util.Scanner;
public class TestArrayNoMethod 
{
	public static void main(String[]args) 
	{
		final int TOTAL_NUMBERS = 6;
		int[]numbers = new int[TOTAL_NUMBERS];
    
		//
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter " + numbers.length + " integer numbers: ");
    
		for(int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = sc.nextInt();
		}
	  
		int max = numbers[0];
		for(int i = 1; i <numbers.length; i++) 
		{
			if(numbers[i] > max) 
				max = numbers[i];
		}
		
		int min = numbers[0];
		for(int i = 1; i <numbers.length; i++) 
		{
			if(numbers[i] < min) 
				min = numbers[i];
		}
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i]== max)
				count++;
		}
	  
		System.out.println("Output: ");
		
		System.out.print("The array is ");
		
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.print(numbers[i]+ " ");
		}
		
		System.out.print("\nThe array in reverse is ");
		
		for (int i = numbers.length-1; i >= 0; i--) 
		{
			System.out.print(numbers[i]+ " ");
		}
		
		System.out.println();
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
		
		System.out.println("The occurence count of the largest number " + "is " + count);
	}
}