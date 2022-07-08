//Constructor overloading

class Sum
{
    Sum(int a, int b)
    {
        System.out.println(a+b);
    }

    Sum(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Sum a = new Sum(10, 30);
        Sum b = new Sum(1,5,10);
    }
}