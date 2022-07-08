class Parent
{
    int a = 10;
}

class Child extends Parent
{
    public void display()
    {
        int a = 5;
        System.out.println("value of a in Child Class : "+a); //5
        System.out.println("Value of a in Parent Class : " + super.a); //10
    }
    public static void main(String[] args)
    {
        new Child().display();
    }
}