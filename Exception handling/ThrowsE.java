//throws exception

class ThrowsE
{
	public static int getElement(int pos) throws Exception
	{
		int arr[] = {1,3,5,7,9};
		return arr[pos];	
	}

	public static void main(String... args)
	{
		try
		{
			System.out.println(getElement(5));
		}
		catch(Exception e)
		{	
			System.out.println("Execption happen : "+e);
		}
	}
}