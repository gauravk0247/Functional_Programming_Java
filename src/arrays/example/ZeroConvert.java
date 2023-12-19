package arrays.example;

import java.util.Arrays;

public class ZeroConvert {
	static int[] convert(int[] ar) {
		Arrays.fill(ar, 0);
		return ar;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(convert(new int[] {1, 4, 5})));
	}
}