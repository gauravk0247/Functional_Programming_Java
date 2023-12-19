package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	private long  productID;
	private String productName;
	private double productPrice;
	public Product(long productID, String productName, double productPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Product(){}
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
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
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
}
class FlipKartServices{
	List<Product> products;
	int i;
	// Add Product
	public void addProductToList(List<Product> products)
	{ 
		this.products=products;
		++i;
		System.out.println(i+" "+"Product Added");
	}
	
	// Sort Product
	public Stream<Product> getSortedProduct()
	{
		Comparator<Product> cmp = (product1, product2)->{
			if(product1.getProductPrice()>product2.getProductPrice()) {
				return 1;
			}
			return -1;
		};	
		Stream<Product> newProduct = products.stream().sorted(cmp);
		return newProduct;
		}
	
	// Search Product
	public Set<Product> serachProduct(String productName){
		return products.stream().filter(p->p.getProductName().equalsIgnoreCase(productName))
		.collect(Collectors.toSet());
	}
	
	// HighestCost
	public Product getProductWithHighestCost()
	{
	return products.stream().max((p1,p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1).
			get();
	}
	
	// LowesttCost
	public Product getProductWithLowesttCost()
	{
	return products.stream().min((p1,p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1).
			get();
	}
	
	public int countNumberOfProduct()
	{
		return (int)products.stream().count();
	}
	
	public double getTotalCost()
	{
	return products.stream().map(p->p.getProductPrice()).
			reduce(0.0,(sum,p1)->sum+p1);

	}
}
public class FlipKart {

	public static void main(String[] args) {
		FlipKartServices FS=new FlipKartServices();
		List<Product> listOfProduct=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many product do you want to add");
		int nop=sc.nextInt();
		for(int i=0; i<nop; i++)
		{
			System.out.println("Enter ProductID ");
			long productID=sc.nextLong();
			
			System.out.println("Enter ProductName");
			String productName=sc.next();
			
			System.out.println("Enter ProductPrice");
			double productPrice=sc.nextDouble();
			
			Product ProductObj=new Product(productID, productName, productPrice);
			listOfProduct.add(ProductObj);
		}
		FS.addProductToList(listOfProduct);
		
		// Sorting
		/*System.out.println("After soring product based on price");
		Stream<Product> resultSortedStream = FS.getSortedProduct();
		resultSortedStream.forEach(p1->System.out.println(p1));
		
		// Searching
		System.out.println("Enter search product");
		String src =sc.next();
		
		// Calling Searched Flights
		Set<Product> serachProduct = FS.serachProduct(src);
		
		serachProduct.forEach(p->System.out.println(p));*/
		
		// getProductWithHighestCost
//		Product p = FS.getProductWithHighestCost();
//		System.out.println(p);
		
		Product p1 = FS.getProductWithLowesttCost();
		System.out.println(p1);
	}
}