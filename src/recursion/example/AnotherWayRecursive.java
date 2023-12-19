package recursion.example;

public class AnotherWayRecursive {
	// the function call itself is called as recursion
	public static void main(int num) {
		if(num==0) {
			return;
		}
		else {
			System.out.println(num);
			main(--num); // calling itself is called recursive function
		}
	}
	public static void main(String[] args) {
		main(10);
	}
}