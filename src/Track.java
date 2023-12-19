interface A{
	interface B{
		void m1();
	}
}
public class Track implements A.B{

	public static void main(String[] args) {
		A.B a1 = new Track();
		a1.m1();
	A.B a=	()->System.out.println("hello");
	a.m1();
	}

	@Override
	public void m1() {
		System.out.println("Hii");
	}

}
