class C
{
    C()
    {
        System.out.println("This is Default Constructor");
    }

    C(int a)
    {
        System.out.println("This is Parameterize Constructor");
    }
}

class Constructor
{
    public static void main(String[] args)
    {
        C d = new C();

        C p = new C(10);
    }
}