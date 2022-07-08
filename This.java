class This
{
    This()
    {
        System.out.println("This is Constructor");
    }
    int a = 10;
    
    public void display(int a)
    {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args)
    {
        This s = new This();
        s.display(15);

    }
}