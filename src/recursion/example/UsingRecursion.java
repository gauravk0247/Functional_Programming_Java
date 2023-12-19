package recursion.example;

public class UsingRecursion {
	public static void doReverseNumber(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		}
		else {
			System.out.print(num%10);
			doReverseNumber(num/10);
		}
	}
	public static void main(String[] args) {
		doReverseNumber(1234);
	}
}
