package Session;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String arg[])
	{
		int num1, num2, sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first integer:  ");
	num1=sc.nextInt();
	System.out.println("Enter second integer:  ");
	num2=sc.nextInt();
	sum=num1-(-num2);
	System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
		
	}
}