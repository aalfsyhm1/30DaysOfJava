package Lab10;
import java.util.Scanner;

public class Try {
    
    static int EV=0, OD=0, total, i=0;
    static double average=0;
    
    //main body
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int  i=0, number=0;
        double av;
        
        System.out.println("Enter integer: ");
        
        //repetition to get the input, calculate total and average.
        do
        {
            number = readNumber(sc);
            determineOddEven(number);    
            addToTotal(number);
            i++;
        }
        while(number!=0);
        
        av = calculateAverage(i);
        printResult(av);
    }

    public static int readNumber(Scanner sc)
    {
        return sc.nextInt();
    }

    //input and to determine odd and even number
    public static void determineOddEven(int number)
    {
        if (number % 2 == 0)
            EV = EV + 1;
        else
            OD = OD + 1;
    }

    //calculation
    public static void addToTotal(int number)
    {
        total = total + number;
    }

    //average
    public static double calculateAverage( int i)
    {
        average = (double)total/--i;
        return average;
    }

    
    //print stuff
    public static void printResult(double average)
    {
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Even: " + EV + " and Odd: " + OD );
    }
    
}