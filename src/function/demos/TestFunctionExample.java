package function.demos;

import java.util.function.Function;

public class TestFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> fun = (para)->{
			return "Product code is "+" "+para;
		};
		String res = fun.apply(123);
		System.out.println(res);
	}

}
