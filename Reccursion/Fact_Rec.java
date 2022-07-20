import java.util.Scanner;

public class Fact_Rec {
	
	public static void main(String [] args) {
		
		int num = getNum();

		long factValue = fact(num);
		System.out.println(factValue);


	}

	public static int getNum() {
		System.out.print("Enter your Number : ");
		return new Scanner(System.in).nextInt();
	}

	public static long fact(int num) {
		if (num <= 1) {
			return num;
		}

		return num*fact(num-1);
	}
		
}
