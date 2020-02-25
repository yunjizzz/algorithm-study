package test;

import java.util.ArrayList;
import java.util.Arrays;



/*
 * 
 * 나누어 떨어지는 숫자 배열

 * 
 문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
입출력 예
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
입출력 예 설명
입출력 예#1
arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.

입출력 예#2
arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.

입출력 예#3
3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.

 
 */

public class Programmers12910 {

	public static void main(String[] args) {
		
		
		int[] arr =  {5,9,7,10};
		int divisor = 5;
		System.out.println(solution(arr,divisor));
	}
	
	public static int[] solution(int[] arr,int divisor) {
		// 먼저 오름차순으로 정렬
		Arrays.sort(arr);
		
		//나누는 수가 1이면 그대로 return
		if(divisor==1){
			return arr;
		}
		ArrayList<Integer> lists = new ArrayList<Integer>();

		// 나누어 지는 거만 추가하기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				lists.add(arr[i]);
			} else {
				continue;
			}
		}

		// 나누어 지는게 없으면 -1 리턴
		if (lists.size() == 0) {
			return new int[] { -1 };
		} else {
			// 아닐 경우는 set만큼 배열 만든 후 남아서 리턴
			int[] retArr = new int[lists.size()];
			int count = 0;
			for (int num : lists) {
				retArr[count++] = num;
			}
			// 끝~~~!
			return retArr;
		}
	}
}
