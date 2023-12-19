package method.reference.demos;

interface A{
	void displaygreetingMsg(String str);
}

class AImpl{
	public void displayMsg(String m) {
		String[] str = m.split(" ");
		String s = " ";
		for(String msg: str){
			String m1 = msg.substring(0, 1).toUpperCase();
			String m2 = msg.substring(1).toLowerCase();
			s = s+m1+m2+" ";
		}
		System.out.println(s);
	}
}
public class TestMethodRefrenceDemo1 {

	public static void main(String[] args) {
		AImpl obj1 = new AImpl();
		A aobj = obj1::displayMsg;
		aobj.displaygreetingMsg("hii welcome in cyber ");
	}
}