package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * 평균 구하기
 * 
문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
입출력 예
arr	return
[1,2,3,4]	2.5
[5,5]	5
 */

public class Programmers12944 {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,4};
		double tmp = solution(a);
		/*
		 * for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		 */
		
		System.out.println(tmp);
		
		
		
	}
	
	public static double solution(int[] num) {
		double result = 0;
		for(int i=0; i<num.length; i++) {
			result += num[i];
		}
		
		return result/num.length;
	}
}
