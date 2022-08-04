//Multiple catch

class MTC
{
	public static void main(String[] args)
	{
		//Multiple try catch
		int arr[] = {1,3,5,7,9};
		int d = 0;
		try
		{
			int c = arr[5] / d;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exeception occures : "+ e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exeception occures : "+ e);
		}
	}
}