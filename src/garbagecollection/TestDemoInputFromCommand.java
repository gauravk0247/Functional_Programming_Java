package garbagecollection;

public class TestDemoInputFromCommand {

	public static void main(String[] abc) {
		int id = Integer.parseInt(abc[0]);
		String name = abc[1];
		double sal = Double.parseDouble(abc[2]);
		System.out.println(id+" "+name+" "+sal);
	}
}