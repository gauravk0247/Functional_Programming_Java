package function.demos;

import java.util.function.Supplier;

public class TextSupplierExample {

	public static void main(String[] args) {
		Supplier<String> supplier = ()->{
			return "Welcome to cyber success";
		};
		String msg = supplier.get();
		System.out.println(msg);
	}
}