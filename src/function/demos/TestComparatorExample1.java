package function.demos;

import java.util.Comparator;

public class TestComparatorExample1 {

	public static void main(String[] args) {
		Comparator<Integer> cmp = (obj1, obj2)->{
			if(obj1>obj2) {
				return 1;
			}
			else if(obj1==obj2) {
				return 0;
			}
			return -1;
		};
		int status = cmp.compare(10, 5);
		System.out.println(status);
	}
}