package Lab10;

import java.io.*;
import java.util.*;

public class FirstIO 
{
	public static void main (String[] args) throws Exception
	{
		File file = new File("Cylinder.txt"); 
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(file);
		
		double area, radius, volume, length;      //declaring the variables as double
		final double PI = 3.14159;
		
		System.out.println("Enter radius of the cylinder in cm: ");    //input radius
		radius = sc.nextDouble();
		
		System.out.println("Enter length of the cylinder in cm : ");       //input length
		length = sc.nextDouble();
		
		area = radius * radius * PI;
		volume = area * length;
		
		System.out.println("The area of the cylinder in cm : " + area);
		System.out.println("The volume of the cylinder in cm : " + volume);
	}

}
