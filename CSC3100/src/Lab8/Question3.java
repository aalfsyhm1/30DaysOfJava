package Lab8;
import java.util.Scanner; //import scanner from java.util.package

public class Question3 
{
	  public static void main(String[] args) 
	  {
	    
	    //create a scanner object
	    Scanner input = new Scanner(System.in);
	    
	    double Height,Weight,BMI,Size;
	    char Gender, continueLoop='y';
	    
	    while (continueLoop != 'n')
	    {
	      //prompt the user to enter the height in cm
	      System.out.println("Insert your height in cm:");
	      Height=input.nextDouble();
	    
	      //prompt the user to enter the weight in kg
	      System.out.println("Insert your weight in kg:");
	      Weight=input.nextDouble();
	    
	      //prompt the user to enter the waist size in inches
	      System.out.println("Insert your waist size in inches:");
	      Size=input.nextDouble();
	      
	      //prompt the user to enter the gender (F/M)
	      System.out.println("Insert your gender F/M");
	      Gender=input.next().charAt(0);
	      
	      BMI=Weight/(Height*Height)*10000; //compute the BMI
	      
	      System.out.printf("Your BMI:%.2f\n",BMI);
	      
	      if(BMI<25)
	        System.out.println("Weight Category: Normal");
	      else if(BMI<30)
	        System.out.println("Weight Category: Over weight");
	      else if(BMI<35)
	        System.out.println("Weight Category: Obese");
	      else if(BMI<40)
	        System.out.println("Weight Category: Severely obese");
	      else if(BMI<45)
	        System.out.println("Weight Category: Morbidly obese");
	      else 
	        System.out.println("Your BMI is invalid");
	      
	      if(Gender=='F')
	        if(Size>35)
	          System.out.println("Health Status: ***HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!!***");
	        else if(Size<36)
	          System.out.println("Health Status: ***GOOD LIFESTYLE!!!***");
	        else
	          System.out.println("Invalid waist size");
	      else if(Gender=='M')
	        if(Size>40)
	          System.out.println("Health Status: ***HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!!***");
	        else if(Size<41)
	          System.out.println("Health Status: ***GOOD LIFESTYLE!!!***");
	        else
	          System.out.println("Invalid waist size");
	      else
	        System.out.println("Invalid Gender");
	      
	      System.out.print("Enter y to continue or enter n to quit: ");
	      continueLoop = input.next().charAt(0);
	    }
      
	  }

}