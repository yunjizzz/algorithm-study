package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



/*
 * 
 * 문자열 내 마음대로 정렬하기
 * 
문제 설명
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예
strings	n	return
[sun, bed, car]	1	[car, bed, sun]
[abce, abcd, cdx]	2	[abcd, abce, cdx]
입출력 예 설명
입출력 예 1
sun, bed, car의 1번째 인덱스 값은 각각 u, e, a 입니다. 이를 기준으로 strings를 정렬하면 [car, bed, sun] 입니다.

입출력 예 2
abce와 abcd, cdx의 2번째 인덱스 값은 c, c, x입니다. 따라서 정렬 후에는 cdx가 가장 뒤에 위치합니다. abce와 abcd는 사전순으로 정렬하면 abcd가 우선하므로, 답은 [abcd, abce, cdx] 입니다.
 
 */

public class Programmers12911 {

	public static void main(String[] args) {
		
		
		String[] arr =  {"abce", "abcd", "cdx"};
		int index = 2;
		String[] tmp = solution(arr,index);
		System.out.println(tmp[0]+"  /// "+tmp[1]);
	}
	
	public static String[] solution(String[] strings ,int n) {
		
		
		// n번째 index를 기준으로 오름차순으로 정렬하는 비교식 만듬
		Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            	if((o1.charAt(n) - o2.charAt(n)) == 0) {
            		//해당 인덱스의 문자가 같을 경우 사전적으로 비교(전체로)
            		return o1.compareTo(o2);
            	}else {
            		return o1.charAt(n) - o2.charAt(n);
            	}
            }
        };
        //해당 기준으로 정렬
        ArrayList<String> tmp = new ArrayList<>(Arrays.asList(strings));
        Collections.sort(tmp,comparator);
        
		return tmp.toArray(new String[strings.length]);
	}
}
