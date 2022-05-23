import java.util.Scanner;


public class TableGenrator {
	public static void main(String [] args) {
		
		System.out.print("Enter the number for their table : ");
		int num = new Scanner(System.in).nextInt();

		for (int i = 1; i <= 10; i ++ ) { 
			
			System.out.println(num*i);

		}

	}
}
