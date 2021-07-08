package study;

/*
*
3진법 뒤집기
문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
입출력 예
n	result
45	7
125	229
입출력 예 설명
입출력 예 #1

답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
45	1200	0021	7
따라서 7을 return 해야 합니다.
입출력 예 #2

답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
125	11122	22111	229
* */
public class Programmers68935_2 {

    public static void main(String[] args) {

        int a = 45;
        //결과는 7 이어야함 !
        System.out.println(solution(a));
    }

    /*
    *
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (14.04ms, 52.8MB)
테스트 2 〉	통과 (14.47ms, 53.7MB)
테스트 3 〉	통과 (13.91ms, 53.7MB)
테스트 4 〉	통과 (12.93ms, 53.4MB)
테스트 5 〉	통과 (12.54ms, 53.6MB)
테스트 6 〉	통과 (13.55ms, 52.8MB)
테스트 7 〉	통과 (12.93ms, 53.2MB)
테스트 8 〉	통과 (12.72ms, 52.8MB)
테스트 9 〉	통과 (21.22ms, 53MB)
테스트 10 〉	통과 (12.55ms, 52.9MB)
*
    * 다른 사람 코드 중 깔끔한 코드...
    * 근데 효율성은 내 코드가 더 빠름..
    * 깔끔하다고 다 좋은건 아니구낭
     */
    public static int solution(int  n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();

        return Integer.parseInt(a,3);
    }
}
