package assignment2; //package declaration is compulsory.
import java.util.Scanner;
/*
  This program will accept the marks of three subjects i.e. PCM 
  and will print the GRADE of student as per the average marks.
 */
public class Assignment2_4 
{

	public static void main(String[] args) // Main method starts
	{
		//Declaration of variables
		double P,C,M;
		double average;
		
		Scanner input=new Scanner(System.in); // scanner to take input from the user.
		System.out.println("Enter the Marks for Physics Subject : ");
		P=input.nextDouble(); //Initializing the marks for physics subject
		
		System.out.println("Enter the Marks for Chemistry Subject : ");
		C=input.nextDouble(); //Initializing the marks for chemistry subject
		
		System.out.println("Enter the Marks for Maths Subject : ");
		M=input.nextDouble(); //Initializing the marks for maths subject
		
		input.close();
		
		average=(P+C+M)/3; //calculating the average 
		
		// logic to check the average and print the GRADE of student
		if(average > 70 )
		{
			System.out.print("Student has Grade A");
		}

		else if(average>=61 && average<=70)
		{
			System.out.print("Student has Grade B");
		}
		
		else
		{
			System.out.print("Student has Grade C");
		}
	}

}
