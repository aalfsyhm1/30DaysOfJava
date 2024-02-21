package Lab10;

import java.io.*;
import java.util.*;

public class FileIO 
{
	public static void main (String[] args)
	{
		
		/*try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\eclipse-workspace\\CSC3100\\src\\Lab2"));
			writer.write("Writing to a file.");
			writer.write("\nHere is another line.");
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			*/
		try 
		{
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\eclipse-workspace\\CSC3100\\src\\Lab2\\Cylinder.java"));
			String line;
			while((line = reader.readLine()) != null)
			{
				reader.readLine();
			}
			
			reader.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
