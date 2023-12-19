package stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapWithStream {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap();
		map1.put(1,  "Gaurav");
		map1.put(2, "Krushna");
		map1.put(3, "Darshan");
		
		// Technique -1 
//		Set<Integer> setOfKey = map1.keySet();
//		Iterator<Integer> itr = setOfKey.iterator();
//		while(itr.hasNext()) {
//			int key=itr.next();
//			String value=map1.get(key);
//			System.out.println(key+" "+value);
//		}
		
		// Technique - 2
		Set ss = map1.entrySet();
		Iterator ii = ss.iterator();
		while(ii.hasNext()) {
			Map.Entry<Integer, String> mm = (Map.Entry<Integer, String>)ii.next();
			int key = mm.getKey();
			String val = mm.getValue();
			System.out.println(key+" "+val);
		}
		
		
		// Technique - 2
//		Set<Entry<Integer, String>> entries = map1.entrySet();
//		for(Entry<Integer, String> e:entries) {
//			int key=e.getKey();
//			String value=e.getValue();
//			System.out.println(key+" "+value);
//		}
		
		// Technique - 3
//		map1.entrySet().stream().forEach(entry->System.out.println(entry));
	}

}