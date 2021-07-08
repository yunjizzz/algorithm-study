package study;

import java.util.Stack;

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
public class Programmers68935 {

    public static void main(String[] args) {

        int a = 1;

        System.out.println(solution(a));
    }
/*
* 채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.14ms, 52.4MB)
테스트 2 〉	통과 (0.19ms, 53.7MB)
테스트 3 〉	통과 (0.17ms, 53.2MB)
테스트 4 〉	통과 (0.21ms, 53.9MB)
테스트 5 〉	통과 (0.24ms, 52.2MB)
테스트 6 〉	통과 (0.18ms, 52.3MB)
테스트 7 〉	통과 (0.17ms, 52.3MB)
테스트 8 〉	통과 (0.20ms, 52.7MB)
테스트 9 〉	통과 (0.19ms, 52.8MB)
테스트 10 〉	통과 (0.21ms, 53MB)
*
* 만족.. 효율 굿.
* */
    public static int solution(int a) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        //3보다 작으면 해당 값 return
        if(a<3) return a;
        //3이상이 경우만 처리
        while ( a/3 >= 1){
            if(a/3 < 3){
                stack.push(a%3);
                stack.push(a/3);
                break;
            }
            stack.push(a%3);
            a /= 3;
        }
        int count = stack.size();
        for(int i=0; i<count; i++){
            result += stack.pop() * Math.pow(3,i);
        }
        return result;
    }
}
