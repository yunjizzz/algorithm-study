package test;

/*
 * 
 * 자연수 뒤집어 배열로 만들기
 * 
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]

 */

public class Programmers12932 {

	public static void main(String[] args) {
		
		
		int a = 12345;
		int[] tmp = solution(a);
		for(int i =0; i< tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		
	}
	
	public static int[] solution(long a) {
		
		int count = (int)(Math.log10(a)+1);
		int[] arr = new int[count];
		int num = 0;
		
		while(num < count) {
			arr[num]=(int) (a%10);
			a/=10;
			num++;
		}
		
		
		return arr;
	}
}
