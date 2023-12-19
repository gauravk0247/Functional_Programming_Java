package function.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionalExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<List<String>, String> fun1 = (param)->{
			int maleCounter=0;
			int femaleCounter = 0;
			for(int i=0;i<param.size();i++) {
				if(param.get(i).startsWith("Mr.")) {
					maleCounter++;
				}
				else {
					femaleCounter++;
				}
			}
			return "The number of male candiate is "+maleCounter +" "+"The number of female candiate is "+" "+femaleCounter; 
		};
		List<String> list = new ArrayList();
		list.add("Mr.A");
		list.add("Mrs.B");
		list.add("Mr.T");
		list.add("Mrs.V");
		list.add("Mr.G");
		String msg = fun1.apply(list);
		System.out.println(msg);
	}

}
