package function.demos;

import java.util.function.Consumer;

public class TestConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> con = (value)->{
			System.out.println("The square of no is "+" "+value*value);
		};
		con.accept(100);
	}

}
