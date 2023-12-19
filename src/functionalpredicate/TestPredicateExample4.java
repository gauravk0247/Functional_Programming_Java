package functionalpredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicateExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<List<String>> predicate = (user)->{
			String userName = user.get(0);
			String passWord = user.get(1);
			if(userName.equalsIgnoreCase("admin") && passWord.equalsIgnoreCase("admin@123")) {
				return true;
			}
			return false;
		};
		List<String> listName = new ArrayList();
		listName.add("admin");
		listName.add("admin@123");
		if(predicate.test(listName)) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}
	}

}
