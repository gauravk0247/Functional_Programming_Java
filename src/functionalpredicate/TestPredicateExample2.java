package functionalpredicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestPredicateExample2 {

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
		boolean status = predicate.test(uname);
		if(status) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("Login Failed");
		}
	}
}