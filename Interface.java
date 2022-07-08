interface i
{
    void inrMethod();
}

interface j extends i
{
    void inrMethod2();
}

class Main implements j
{
    @Override
    public void inrMethod()
    {
        System.out.println("Method from i");
    }

    @Override
    public void inrMethod2()
    {
        System.out.println("Method from j");
    }

    public static void main(String[] args)
    {
        Main m = new Main();
        m.inrMethod();
        m.inrMethod2();
    }
}
