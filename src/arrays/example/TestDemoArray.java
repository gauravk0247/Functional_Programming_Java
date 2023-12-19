package arrays.example;

import java.util.Arrays;

public class TestDemoArray {

	public static void main(String[] args) {
		int[] a = {1, 78, 90, 34, 5, 7};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int key = Arrays.binarySearch(a, 90);
		System.out.println(key);
		System.out.println("after sorting "+" "+Arrays.toString(a));
		
		int[] resultArrays = Arrays.copyOf(a, 3);
		System.out.println("After copying "+" "+Arrays.toString(resultArrays));
		
		int[] copyRange = Arrays.copyOfRange(a, 2, a.length);
		System.out.println(Arrays.toString(copyRange));
		
		Arrays.fill(a,  0);
		System.out.println(Arrays.toString(a));
		System.out.println(a);
		
		Arrays.fill(a, 3,5,9);
		System.out.println(Arrays.toString(a));
	}
}