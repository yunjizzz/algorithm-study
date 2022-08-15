package study;

import java.util.Arrays;

/*
 */
public class Programmers12953 {

	public static void main(String[] args) {

		int[] arr = {2,6,8,14};
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		Arrays.sort(arr);
		for(int i=arr.length-1; i > 0; i--){
			int gcd = getGCD(arr[i],arr[i-1]);
			arr[i-1] = (arr[i] * arr[i-1])/gcd;
		}
		return arr[0];
	}

	public static int getGCD(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		}
		return getGCD(num2, num1%num2);
	}
}
