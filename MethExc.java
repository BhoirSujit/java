class MethExc
{
    public static int divide(int a, int b) throws ArithmeticException, NullPointerException
    {
        return a/b;
    }

    public static void main(String... args)
    {
        try
        {
            System.out.println(divide(5, 0));
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception : "+e);
        }
        catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
        finally
        {
            System.out.println("Finally");
        }
    }
}