abstract class demo
{
	public abstract void eat();
}

class Ano extends demo
{
	public static void main(String[] args)
	{
		new Ano().eat();
	}
	
	@Override
	public void eat()
	{
		System.out.println("Why i am eating");
	}
}