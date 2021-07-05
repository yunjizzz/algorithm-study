package study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * x만큼 간격이 있는 n개의 숫자
 * 
문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아, 
x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
입출력 예
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]

 */

public class Programmers12954 {

	public static void main(String[] args) {
		
		
		int a = -10000000;
		int b = 10;
		long[] tmp = solution(a,b);
		
		for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		
		
		//System.out.println(tmp);
		
		
		
	}
	
	public static long[] solution(int a, int b) {
		//if(a<-10000000 || a > 10000000) return new long[0];
		
		long[] result = new long[b];
		int count = 0;
		for(long i=1;i<=b; i++) {
			result[count++] = a*i;
		}
		
		return result;
	}
}
