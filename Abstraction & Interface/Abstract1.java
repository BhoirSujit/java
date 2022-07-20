abstract class A
{
    abstract void abMethod();
    
    public void pubMethod()
    {
        System.out.println("This is not Abstract Method");
    }
}

class Main extends A
{
    public static void main(String[] args)
    {
        Main m = new Main();
        m.abMethod();
        m.pubMethod();
    }

    @Override
    public void abMethod()
    {
        System.out.println("This is Abstract Method");
    }
}
