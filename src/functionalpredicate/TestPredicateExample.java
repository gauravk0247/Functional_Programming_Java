package functionalpredicate;

import java.util.function.Predicate;

public class TestPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = (p1)->{
			if(p1==100) {
				return true;
			}
			return false;
		};
		boolean res = predicate.test(100);
		System.out.println(res);	
	}

}
