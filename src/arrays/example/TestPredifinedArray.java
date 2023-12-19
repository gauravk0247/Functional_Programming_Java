package arrays.example;

class Prodcut{
	private int productId;
	private String productName;
	private double productPrice;
	public Prodcut(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Prodcut [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
}

public class TestPredifinedArray {

	public static void main(String[] args) {
		Prodcut[] products = new Prodcut[4];
		products[0] = new Prodcut(101, "Moible", 234567.89);
		products[1] = new Prodcut(11, "TV", 34567.89);
		products[2] = new Prodcut(303, "Watch", 5967.89);
		products[3] = new Prodcut(41, "SmartWatch", 94567.89);
		for(Prodcut pp:products) {
			System.out.println(pp);
		}
	}
}