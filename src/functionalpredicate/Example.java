package functionalpredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList();
		l.add(12);
		l.add(45);
		l.add(45);
		l.add(80);
		l.add(32);
		l.add(8);
		Predicate<Integer> pred = (l1)->{
		if(l1%2==0)
		{
			return true;
		}
		return false;
		};
		int evenCount = (int) l.stream().filter(pred).count();
		int oddCount=(int)l.stream().filter(n->n%2==1).count();
		System.out.println(evenCount + " "+oddCount);
	}

}
