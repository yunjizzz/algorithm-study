package study;

import java.util.ArrayList;

/*
소수 찾기
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

public class Programmers12921_1 {

	public static void main(String[] args) {
		

		int n = 5;
		int tmp = solution(n);
		System.out.println(tmp);
	}
	/*
	* 효율성 개선된건가..?
	* 아 소수 찾기 어렵다.
	* 에라토스테네스의 체 참고.. 참고해도 잘 모르게따 수학 공부하자.
	*정확성  테스트
테스트 1 〉	통과 (0.03ms, 53.4MB)
테스트 2 〉	통과 (0.08ms, 52.2MB)
테스트 3 〉	통과 (0.13ms, 52.3MB)
테스트 4 〉	통과 (0.30ms, 52.2MB)
테스트 5 〉	통과 (0.21ms, 52.8MB)
테스트 6 〉	통과 (1.71ms, 51.7MB)
테스트 7 〉	통과 (0.96ms, 52MB)
테스트 8 〉	통과 (2.24ms, 52.4MB)
테스트 9 〉	통과 (2.79ms, 52MB)
테스트 10 〉	통과 (40.89ms, 54.1MB)
테스트 11 〉	통과 (180.23ms, 53MB)
테스트 12 〉	통과 (52.19ms, 53.4MB)
효율성  테스트
테스트 1 〉	통과 (197.63ms, 52.2MB)
테스트 2 〉	통과 (188.89ms, 52.4MB)
테스트 3 〉	통과 (195.12ms, 52.8MB)
테스트 4 〉	통과 (189.47ms, 52.7MB)
	* */
	public static int solution(int n) {
		// 소수의 정의
		// 0,1 은 소수가 아니다.
		// 2는 소수다.
		// 그 이외의 1과 자기자신으로만 나눌 수 있는 수를 소수라고 한다.
		int result = 0;
		for(int i=2; i<=n; i++) {
			if (isPrimeNumber(i)) {
				result++;
			}
		}
		return result;
	}
	public static boolean isPrimeNumber(int number){
		// 제곱근 함수 : Math.sqrt()
		if(number == 2) {
			return true;
		}else{
			for (int i = 2; i <= Math.sqrt(number); i++) {
				// 소수가 아닐경우 종료
				if (number % i == 0) {
					return false;
				}
			}
		}
		// 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
		return true;
	}
}
