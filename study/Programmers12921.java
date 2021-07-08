package study;

import java.util.ArrayList;

/*
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


	/*
	* 이건 언제 짠건지 모르겠는.. 효율성 꽝 로직
	* 채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.04ms, 52.7MB)
테스트 2 〉	통과 (0.26ms, 53.1MB)
테스트 3 〉	통과 (0.59ms, 51.7MB)
테스트 4 〉	통과 (0.96ms, 52.1MB)
테스트 5 〉	통과 (0.90ms, 52.9MB)
테스트 6 〉	통과 (10.70ms, 51.8MB)
테스트 7 〉	통과 (2.28ms, 52.1MB)
테스트 8 〉	통과 (5.69ms, 53MB)
테스트 9 〉	통과 (6.16ms, 52.2MB)
테스트 10 〉	통과 (44.93ms, 53.9MB)
테스트 11 〉	통과 (197.77ms, 56.5MB)
테스트 12 〉	통과 (49.86ms, 53.9MB)
효율성  테스트
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	통과 (234.73ms, 55.8MB)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	통과 (231.99ms, 55.6MB)
채점 결과
정확성: 75.0
효율성: 12.5
합계: 87.5 / 100.0
	*
	* */
	public static int solution(int n) {

		ArrayList<Integer> primeList = new ArrayList<Integer>(n+1);
		int count = 0;
		primeList.add(1);
		primeList.add(1);

		for(int i=2; i<=n; i++ ) 
			primeList.add(i, 0);

		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)==0){
				for(int j = i*2; j<=n; j+=i) {
					primeList.set(j, 1);
				}
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
