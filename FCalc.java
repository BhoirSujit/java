import java.util.Scanner;

public class FCalc {

    public static void main(String [] args) {
        operations();

    }

    public static void operations() {
        System.out.println("""
                Welcome to basic calc program
                1. Factorial
                2. Permutation
                3. Combination
                4. Exit
                """);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the choise of operation : ");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Fatorial");
                System.out.print("Enter number : ");
                int n = sc.nextInt();
                System.out.println("The value of " + n + " Factorial is : "+ fact(n));

            } else if (ch == 2) {
                System.out.println("Permutaion");
                System.out.print("Enter Value of n : ");
                int n = sc.nextInt();
                System.out.print("Enter Value of r : ");
                int r = sc.nextInt();
                System.out.println("The value of " + n + "P" + r + " is : " + p(n, r));

            } else if (ch == 3) {
                System.out.println("Combination ");
                System.out.print("Enter Value of n : ");
                int n = sc.nextInt();
                System.out.print("Enter Value of r : ");
                int r = sc.nextInt();
                System.out.println("The value of " + n + "C" + r + " is : " + c(n, r));
            }else {
                System.out.println("Thank you for using our program ");
                break;
            }
        }
    }

    public static long p(int n,int r){
        long npr = fact(n)/fact(n-r);
        return npr;

    }

    public static long c(int n, int r) {
        Long ncr = fact(n)/(fact(r)*fact(n-r));
        return ncr;
    }

    public static long fact(int n) {
        if (n<= 1 ) {
            return 1;
        }
        return n*fact(n-1);

    }
    
}
