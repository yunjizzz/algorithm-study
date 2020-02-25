package test;

import java.util.ArrayList;

/*
 * 
 * 소수 찾기
 * 
문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

 */

public class Programmers12921 {

	public static void main(String[] args) {
		
		
		String a = "a234";
		int b = 10;
		int tmp = solution(b);
		System.out.println(tmp);
	}
	
	public static int solution(int n) {
		
		// n+1만큼 할당
		ArrayList<Integer> primeList = new ArrayList<Integer>(n+1);
		int count = 0;
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(1);
		primeList.add(1);
		
		  // 2~ n 까지 소수로 설정
		for(int i=2; i<=n; i++ ) 
			primeList.add(i, 0);
		 

		// 2 부터  ~ i*i <= n
		// 각각의 배수들을 지워간다.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)==0){
				for(int j = i*2; j<=n; j+=i) {
					primeList.set(j, 1);
				}
				//i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
			}
		}
		
		for(int i=0; i<primeList.size();i++) {
			if(1 !=primeList.get(i)) {
				count++;
			}
		}
		
		return count;
	}
}
