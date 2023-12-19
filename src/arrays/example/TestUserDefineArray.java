package arrays.example;

import java.util.Scanner;

class Product{
	private int productId;
	private String productName;
	private double productPrice;
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}	
}
public class TestUserDefineArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many prducts do you want.");
		int nop = sc.nextInt();
		Product[] products = new Product[nop];
		for(int i=0;i<nop;i++) {
			System.out.println("Enter productID");
			int pid = sc.nextInt();
			System.out.println("Enter productName");
			String pname = sc.next();
			System.out.println("Enter productPrice");
			double pprice = sc.nextDouble();
			Product pobj = new Product(pid,pname, pprice);
			products[i] = pobj;
		}
//		for(int i=0;i<products.length;i++) {
//			System.out.println(products[i]);
//		}
		for(Product pp:products) {
			System.out.println(pp);
		}
	}
}