import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class guessthenumber 
{
    public static void main(String [] args)
    {
        //creating a random number
        int ranNum = (int) (Math.random()*100);

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Guess the number ");
            int userInt = scanner.nextInt();
        
            switch (userInt)
            {
                case userInt>ranNum :
                System.out.println("Number is smaller than your guess");
                break;

                case userInt<ranNum :
                System.out.println("Number is greater than your guess");
                break;

                default:
                System.out.println("You gussed the exact number");
                
            }

        }
    }
    
}
