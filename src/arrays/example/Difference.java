package arrays.example;

import java.util.Arrays;

public class Difference {
	static int cal(int[]arr) {
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		int diff=max-min;
		return diff;
	}
	public static void main(String[] args) {
		int[] ar = {70, 1, 800, 900, 57, 78};
		int cal2=Difference.cal(ar);
		System.out.println(cal2);
	}
}