package study;

/*
가장 큰 수
문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	"6210"
[3, 30, 34, 5, 9]	"9534330"
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;


public class Programmers42746 {

	public String solution(int[] numbers) {
		char max = 0;
		int tmp = 0;
		ArrayList<Integer> sameNums =new ArrayList<>();

		for(int i =0; i < numbers.length-1; i++){
			int countMin = i;
			String a = ""+numbers[i];
			for(int j=i+1;j < numbers.length; j++){
				String b = "" + numbers[j];
				if(a.charAt(0) < b.charAt(0)){
					countMin = j;
				}else if( a.charAt(0) == b.charAt(0)){
					int count = 1;
					while (Math.max(a.length(),b.length()) >= count){
						try {
							if (b.charAt(count) == a.charAt(count)) {
								count++;
								continue;
							} else if (b.charAt(count) < a.charAt(count)) {
								countMin = j;
								break;
							} else {
								countMin = i;
								break;
							}
						}catch(Exception e){
							if(a.length() < b.length()) {
								if(a.charAt(count-1) > b.charAt(count)){
									countMin = i;
								}else{
									countMin = j;
								}
							}else{
								if(a.charAt(count) < b.charAt(count-1)){
									countMin = j;
								}else{
									countMin = i;
								}
							}
							break;
						}
					}
				}else{
					continue;
				}
			}
			tmp++;
			swap(numbers,countMin,i);
		}
		String result = "";
		for(int i : numbers){
			System.out.println("i="+i);
			result += ""+i;
		}
		return result;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

    /**
     * 한 수 배우는 다른 사람 코드..!
	 */
	public String solution_other(long w, long h){
		return null;
	}


	@Test
	public void checkResult() {
	//	Assert.assertEquals("6210", solution(new int[]{6, 10, 2}));
		Assert.assertEquals("9534330", solution(new int[]{3, 30, 34, 5, 9}));
	}
}
