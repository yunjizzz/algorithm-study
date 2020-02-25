package test;

/*
 * 
 * 직사각형 별찍기
 * 
문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

제한 조건
n과 m은 각각 1000 이하인 자연수입니다.
예시
입력

5 3
출력

*****
*****
*****

 */

public class Programmers12969 {

	public static void main(String[] args) {
		
		
		int a = 3;
		int b = 5;
		  solution(a,b);
		
		//for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		
		
	}
	
	public static void solution(int a, int b) {
		//if(a<-10000000 || a > 10000000) return new long[0];
		
		for(int i=0; i<a;i++) {
			for(int j=0; j<b;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//return result;
	}
}
