package Exercise;
import java.util.Scanner;

public class studentAnswer 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char [][] grade = new char[][];
		/*{
			{'A','B','A','C','C','D','E','E','A','D'},
			{'D','B','A','B','C','A','E','E','A','D'},
			{'E','D','D','A','C','B','E','E','A','D'},
			{'C','B','A','E','D','C','E','E','A','D'},
			{'A','B','D','C','C','D','E','E','A','D'},
			{'B','B','E','C','C','D','E','E','A','D'},
			{'B','B','A','C','C','D','E','E','A','D'},
			{'E','B','E','C','C','D','E','E','A','D'},
		};*/
		
		char [] answer = {'D','B','D','C','C','D','A','E','A','D'};
		
		int count =0;
		
		for (int i = 0; i < grade.length; i++) 
		{
			for (int j = 0; j < grade[i].length; j++) {
				if (grade[i][j] == answer[j]) 
					count++;
			}
			System.out.println("Student " + (i+1) + " : " + count);
			count=0;
		}
	}

}
