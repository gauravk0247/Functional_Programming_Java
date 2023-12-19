package enumpack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

enum SortBy{
	LOWPRICE, HIGHPRICE, NAME;
}
class Product{
	private long productId;
	private String productName;
	private double productPrice;
	public Product(long productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
}
class ProductServices{
	public static List<Product> sortProducts(SortBy sort,List<Product> products)
	{
		// String Name
		List<Product> list = null;
		String ch = sort.name();
		
		//IT RETURNS VALUES ASSOCIATED WITH CONSTANT
		int ch1 = sort.ordinal();
		// enum[] values();
		SortBy[] enumArray = SortBy.values();
		for(SortBy t:enumArray) {
			System.out.println(t);
		}
		
		if(ch.equalsIgnoreCase("LOWPRICE"))
		{
			Comparator<Product> cmp = (p1, p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1;
			list = products.
					stream().
					sorted(cmp).
					collect(Collectors.toList());
		}
		else if(ch.equalsIgnoreCase("HIGHPRICE")) {
			Comparator<Product> cmp = (p1, p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1;
			list = products.
					stream().
					sorted(cmp).
					collect(Collectors.toList());
		}
		else if(ch.equalsIgnoreCase("NAME")) {
			Comparator<Product> cmp = (p1, p2)->p1.getProductName().compareTo(p2.getProductName());
			list = products.
					stream().
					sorted(cmp).
					collect(Collectors.toList());
		}
		return list;
	}
}
public class TestenumDemo2 {
	static List<Product> listOfProducts = new ArrayList();
	static{
		listOfProducts.add(new Product(108, "Laptop", 56782.00));
		listOfProducts.add(new Product(18, "Mobile", 6782.00));
		listOfProducts.add(new Product(8, "Watch", 782.00));
		listOfProducts.add(new Product(1, "TV", 678290.00));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your sorting technique");
		String str = sc.next();
		String str1 = str.toUpperCase();
		SortBy sortBy = SortBy.valueOf(str1);
		
		List<Product> list = ProductServices.sortProducts(sortBy, listOfProducts);
		list.forEach(p->System.out.println(p));
	}
}