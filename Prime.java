import java.util.Scanner;

class Prime
{	
	public static void main(String[] args)
	{
		//Prime Number or Not
		//getting number from user;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		//assuming number is prime
		boolean res = true;
		
		//checking number if devisible from 2 to number/2
		for (int i = 2; i<= num/2; i++) 
		{
			if (num%i==0)
			{
				//ohh no its not prime
				res = false;
				break;
			}
		}
		
		//printing result to user
		if (res)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}
	}
}