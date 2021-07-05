package study;

/*
 * 
 * 짝수와 홀수
 * 
정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.

제한 조건
num은 int 범위의 정수입니다.
0은 짝수입니다.
입출력 예
num	return
3	Odd
4	Even
 */

public class Programmers12937 {

	public static void main(String[] args) {
		
		
		int a = 3;
		String tmp = solution(a);
		/*
		 * for(int i =0; i< tmp.length; i++) { System.out.println(tmp[i]); }
		 */
		
		System.out.println(tmp);
		
		
		
	}
	
	public static String solution(int num) {
		String[] arrs = {"Even","Odd"};
		return num%2 ==0 ? arrs[0] : arrs[1];
		
	}
}
