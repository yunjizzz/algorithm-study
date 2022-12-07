package study;

import java.util.Arrays;

/**
 * 피보나치 수열
 */
public class Programmers12945 {

	public static void main(String[] args) {


		System.out.println(solution(5));
	}

	public static int solution(int n) {
		if(n == 1 || n ==0){
			return n;
		}
		n = Pnum(n);

		return n ;
	}

	public static int Pnum(int n) {
		int first = 0;
		int last = 1;
		int sum = first + last;
		for(int i = 2; i <= n; i++){
			first = last;
			last = sum;
			sum = (first + last)/1234567;
		}
		return n;
	}
}
