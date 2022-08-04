//Nested Try catch

class NTC
{
	public static void main(String[] args)
	{
		//Multiple try catch
		int arr[] = {1,3,5,7,9};
		int d = 0;
		try
		{
			int c = arr[4];
			System.out.println(c);
			
			try
			{
				int div = c / d;
				System.out.println(div);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exeception occures : "+ e);
			}	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exeception occures : "+ e);
		}
	}
}