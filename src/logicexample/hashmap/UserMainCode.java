package logicexample.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UserMainCode {
	public static int getAvgOfOdd(HashMap<Integer, Integer> hm) {
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		int add=0;
		while(i.hasNext()) {
			Map.Entry ii = (Map.Entry)i.next();
			Integer ke =(Integer)ii.getKey();
			if(ke%2!=0) {
				Integer val = (Integer)ii.getValue();
				add = (add+val);
			}
		}
//		System.out.println(add);
		return add;
	}
}