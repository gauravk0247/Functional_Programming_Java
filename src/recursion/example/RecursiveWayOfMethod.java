package recursion.example;

import java.util.Scanner;

public class RecursiveWayOfMethod {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter number");
			int num = s.nextInt();
			int res = 100/num;
			System.out.println(res);
		}catch(ArithmeticException ae) {
			System.out.println("Kindly give number > 0");
			main(null);
		}
	}

}
