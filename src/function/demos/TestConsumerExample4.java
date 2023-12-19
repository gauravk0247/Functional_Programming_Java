package function.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class TestConsumerExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("how many salary of employees do you want to save");
		int nos = sc.nextInt();
		for(int i=0;i<nos;i++) {
			double sal = sc.nextDouble();
			list.add(sal);
		}
		// Foreach (Consumer consumer)
		Consumer<Double> con = (salary)->{
			System.out.println("The salary amount is "+" "+salary);
		};
		for(Double d:list) {
			if(d>=10000.00) {
				con.accept(d);
			}
		}
	}

}
