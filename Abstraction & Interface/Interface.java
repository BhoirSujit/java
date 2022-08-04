// Interface

interface Printable
{
    void print();
}

class Main implements Printable
{
    public void print()
    {
        System.out.println("Hello world");
    }

    public static void main(String[] args)
    {
        Main m = new Main();
        m.print();
    }
}