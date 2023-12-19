package function.demos;

import java.util.function.Supplier;

class Customer {
	private int customerId;
	private String customerName;
	public Customer(int customerId, String customerName) {
		this.customerId=customerId;
		this.customerName=customerName;
	}
	public String toString() {
		return customerId+" - "+customerName;
	}
}
public class TestSupplierExample2{
	public static void main(String[] args) {
		Supplier<Customer> sup = ()->{
			return new Customer(101, "Gaurav");
		};
		Customer obj1 = sup.get();
		System.out.println(obj1);
	}
}