package logicexample.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 11);
		hm.put(2, 33);
		hm.put(3, 44);
		hm.put(4, 22);
//		System.out.println(hm);
		int odd = UserMainCode.getAvgOfOdd(hm);
		System.out.println(odd);
	}
}