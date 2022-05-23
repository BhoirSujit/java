import java.util.Scanner;

public class Fact {
	
	public static void main(String [] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		long factValue = 1;
		for(int i = 2; i <= number; i++ ) {
			factValue *= i;

		}

		System.out.println(factValue);

	}

}
