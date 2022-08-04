//thow exception

import java.util.Scanner;
class TE
{
	public static void checkAge(int age)
	{
		if (age >= 18)
		{
			System.out.println("Valid Age");
		}
		else
		{
			throw new ArithmeticException("Invalid Age");
		}
		
	}

	public static void main(String... args)
	{
		System.out.print("Enter your age : ");
		int a = new Scanner(System.in).nextInt();
		checkAge(a);
	}
}