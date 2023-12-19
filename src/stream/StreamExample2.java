package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
	List<String> phoneNumber = new ArrayList();
	phoneNumber.add("8147117572");
	phoneNumber.add("90876543");
	phoneNumber.add("1323232");
	Predicate<String> pred = (phone)->{
		String regEx = "[6789]{1}[0-9]{9}";
		if(regEx.matches(regEx)) {
			return true;
		}
		return false;
	};
	for(String s:phoneNumber) {
		boolean res = pred.test(s);
		if(res) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not-Valid");
		}
	}
	}
}