package functionalpredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class prac {
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList(); 
			list.add("CHN-BANG-1234");
			list.add("KOL-PUN-1234");
			list.add("CHNDI-BOM-1234");
			list.add("DEL-KOL-1234");
			list.add("123-BANG-1234");
			Predicate<String> predicate=(name)->{
				String regEx = "[A-Z] {3,4}[-] {1}[A-Z] {3,4}[-] {1}[0-9] {4}";
				if(name.matches(regEx)) {	
					return true;
				}
				return false;
//				for(String s:list) {}
			};
			boolean res = predicate.test("CHN-BANG-1234");
			System.out.println(res);
		}
	}