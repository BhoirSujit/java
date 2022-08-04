abstract class cal
{
	public abstract int sqr(int n);
	public abstract int cub(int n);

    public void show()
	{
		System.out.println("Calculator...");
	}
	
}
class abs extends cal
{
	public int sqr(int n)
	{
		return n*n;
	}

	public int cub(int n)
	{
		return n*n*n;
	}
    
	public static void main(String args[])
	{
		abs a=new abs();
        a.show();
		System.out.println(a.sqr(3));
		System.out.println(a.cub(3));
	}
}