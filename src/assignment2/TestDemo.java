package assignment2; //package declaration is compulsory.

import java.util.Scanner;
/*
This program will help you to master the following concepts:
Loops and Conditional statements
Operators
 */
public class TestDemo 
{
	
	public static void main(String args[])
	
	{
		//Declaration of variables
		int num;
		Scanner input = new Scanner(System.in); // scanner to take input from the user.
		System.out.println("Enter the number :"); 
		num=input.nextInt(); //Initializing the number
		
		//logic to accept number and print whether it's positive,negative or zero along with it's ACSII value
		if (num==0)
		{
			System.out.println("You Have Entered Zero, ASCII value of number is : "+(char)num);
		}
		else if(num > 0)
		{
			System.out.println("You Have Entered Positive value, ASCII value of number is : "+(char)num);
		}
		else
		{
			System.out.println("You Have Entered Negative value, ASCII value of number is : "+(char)num);
		}
		
				input.close();
	}

}

