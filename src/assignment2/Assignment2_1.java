package assignment2;   //package declaration is necessary
import java.util.Scanner;
/*
 * This class will print the Highest number out of three numbers.
 */
class Assignment2_1
{
	public static void main(String args[])
	{
		// Declare all variables
		int num1,num2,num3; 
		
		Scanner input = new Scanner(System.in);  // Scanner object to take the input from the user.
		System.out.println("Enter First Number:");
		num1=input.nextInt(); // initializing first variable
		
		System.out.println("Enter Second Number:");
		num2=input.nextInt(); // initializing second variable
		
		System.out.println("Enter Third Number:");
		num3=input.nextInt(); // initializing third variable
		
		input.close();
		
		// Logic to check highest number out of three numbers
		
		if (num1>num2 && num1>num3) 
		{
			System.out.println("First Number "+num1+" is highest");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Second Number "+num2+" is highest");
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("Third Number "+num3+" is highest");
		}
		else
		{
			System.out.println("Invalid number");
		}
	}
}