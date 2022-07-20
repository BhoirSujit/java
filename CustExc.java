class InvalidAgeException extends Exception
{
    public InvalidAgeException()
    {
        super("Invalid age");
    }
}

class CustExc
{
    public static void main(String[] args)
    {
        int age = 10;
        try
        {
            if (age > 18) 
            {
                System.out.println("You are eligible");
            }
            else
            {
                throw new InvalidAgeException();
            }
        }
        catch(Exception i)
        {
            System.out.println("Exception is : "+ i);
        }
    }
}