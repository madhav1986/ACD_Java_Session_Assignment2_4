package assignment2; // package declaration is compulsory.
import java.util.Scanner;
/*
 This program will help you master the concepts of loops and Nested Loops.
 */
public class Assignment2_3 
{
        	public static void main(String[] args) //Main method starts
        	{
        		
        		//Declare variables
        		int rows, columns,length;
        		
        		Scanner input=new Scanner(System.in); // scanner to take input from the user.
        		System.out.println("Enter the length for X pattern");
        		length=input.nextInt(); //Initializing the length for the pattern it should be odd number in order to print correct X pattern
        		
        		input.close();
        		
        		//Logic to print X pattern
        		for (rows = 1; rows <= length; rows++) 
        		{
        			for (columns = 1; columns <= length; columns++) 
        			{
        				if (columns == rows) 
        				{
        					System.out.print("*"); 
        				} 
        				else if (columns == length - (rows - 1)) 
        				{
        					System.out.print("*");
        				} 
        				else 
        				{
        					System.out.print(" ");
        				}
        			}
        			System.out.println();
        		}
        	}
        }