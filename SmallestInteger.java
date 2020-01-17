/**
Program that reads three non-negative integers and displays the smallest integer.
Author: Daniel Oszczapinski	
Lab Assignment 4
Completed: September 29, 2016
*/
import java.util.Scanner;


public class SmallestInteger
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter three non-negative integers.");
		
		int numberone, numbertwo, numberthree; //Represents each Integer
		numberone = keyboard.nextInt();
		numbertwo = keyboard.nextInt();
		numberthree = keyboard.nextInt();
		 
		 
		if (numberone <= numbertwo && numberone <= numberthree) //When first integer is less than the second and third integer this prints.
		{
			System.out.println("You entered: " + numberone + " " + numbertwo + " " + numberthree);
			System.out.println("The smallest integer is " + numberone);
		}
			else if(numbertwo <= numberone && numbertwo <= numberthree) //When second integer is less than first and third integer this prints.
				{
				System.out.println("You entered: " + numberone + " " + numbertwo + " " + numberthree);
				System.out.println("The smallest integer is " + numbertwo);
				}
			else if(numberthree <= numberone && numberthree <= numbertwo) // When third integer is less than first and second integer this prints.
				{
				System.out.println("You entered: " + numberone + " " + numbertwo + " " + numberthree);
				System.out.println("The smallest integer is " + numberthree);
				}
	}
}