package Session;

import java.util.Scanner; //Importing Scanner class.

public class Assignment1 
{

	public static void main(String arg[])
	{
		int num1, num2, sum; //Declaring required variables.
		Scanner sc=new Scanner(System.in); //Using object of class Scanner for input from user.
		System.out.println("Enter first integer:  "); 
	num1=sc.nextInt(); // Getting value for first integer.
	System.out.println("Enter second integer:  ");
	num2=sc.nextInt(); // Getting value for second integer.
	sum=num1-(-num2);
	System.out.println("Sum of "+num1+" and "+num2+" is "+sum); //Printing sum of both integer numbers.
		
	}
}