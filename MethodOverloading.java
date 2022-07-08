//Method Overloading

class M 
{
    public void mul(int a, int b)
    {
        System.out.println(a*b);
    }

    public void mul(int a, int b, int c)
    {
        System.out.println(a*b*c);
    }
}

class Main 
{
    public static void main(String[] args)
    {
        M m = new M();
        m.mul(5,3);
        m.mul(10,2,5);
    }
}