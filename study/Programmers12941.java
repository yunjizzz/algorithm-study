package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 */
public class Programmers12941 {

	public static void main(String[] args) {

		int[] a = {1, 4, 2};
		int[] b = {5, 4, 4};

		System.out.println(solution(a, b));
	}

	public static int solution(int[] arrA, int[] arrB) {
		int sumA = 0;
		int sumB = 0;
		int minus = arrA.length - 1;

		Arrays.sort(arrA);
		Arrays.sort(arrB);

		//arrA = sort(arrA);
		//arrB = sort(arrB);

		for (int i = 0; i < arrA.length; i++) {
			sumA += arrA[i] * arrB[minus - i];
			sumB += arrB[i] * arrA[minus - i];
		}

		return Math.min(sumA, sumB);
	}

	//정렬하는거 구현
	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (num > a[j]) {
					a[i] = a[j];
					a[j] = num;
					break;
				}
			}
		}
		return a;
	}
}
