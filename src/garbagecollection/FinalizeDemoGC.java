package garbagecollection;

public class FinalizeDemoGC {

	@Override
	public void finalize() {
		System.out.println("I am from finalize method block");
	}
	public static void main(String[] args) {
		FinalizeDemoGC obj = new FinalizeDemoGC();
		obj=null;
		// explicitly we can call System.gc() method
//		System.gc();
		
		// called by JVM automatically at runtime
		Runtime.getRuntime().gc();
	}
}