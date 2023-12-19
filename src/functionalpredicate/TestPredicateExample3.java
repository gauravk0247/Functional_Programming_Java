package functionalpredicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestPredicateExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> predicate = (name)->{
			if(name.equalsIgnoreCase("Cyber")) {
				return true;
			}
			return false;
		};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name");
		String uname=sc.next();
		if(predicate.test(uname)) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("Login Failed");
		}
	}
}