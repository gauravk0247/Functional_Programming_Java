package method.reference.demos;

interface Generator{
	String generate(String str);
}

class PasswordGenerator{
	static String generatePassword(String str) {
		String s1 = str.substring(3, 4);
		int i1 = str.indexOf(str.charAt(str.length()-6));
		String s2 = str.substring(4, 5);
		String s3 = String.valueOf(i1);
		return "cyber"+s1+s2+s3;
	}
}

class OtpGenerator{
	static String generateOtp(String str) {
		int index1 = str.indexOf(str.charAt(0));
		int index2 = str.indexOf(str.substring(0, 5));
		int index3 = str.indexOf(str.substring(2, 4));
		int index4 = str.indexOf(str.charAt(3));
		return String.valueOf(index1).
				concat(String.valueOf(index2)).concat(String.valueOf(index3)).concat(String.valueOf(index4));
	}
}
public class TestMethodReferenceDemo2 {

	public static void main(String[] args) {
//		Generator g = PasswordGenerator::generatePassword;
//		String msg = g.generate("Ravi Kumar");
//		System.out.println(msg);
		
		
		Generator g1 = OtpGenerator::generateOtp;
		String res = g1.generate("Hii Welcome");
		System.out.println(res);
	}
}