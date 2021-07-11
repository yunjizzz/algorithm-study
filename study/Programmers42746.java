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

import java.util.*;


public class Programmers42746 {

	// Compator를 모르는 나는 혼자 했던 삽질.........후
	public String solution(int[] numbers) {
		for(int i =0; i < numbers.length-1; i++){
			String a = "" + numbers[i];
			int countMin = i;
			for(int j=i+1;j < numbers.length; j++){
				if( numbers[i] == numbers[j] ) continue;
				String b = "" + numbers[j];
				if(a.charAt(0) < b.charAt(0)){
					countMin = j;
				}else if(a.charAt(0) > b.charAt(0)){
					countMin = i;
				}else if(a.charAt(0) == b.charAt(0)){
					if((""+numbers[countMin]).charAt(0) > b.charAt(0)){
						continue;
					}
					int count = 1;
					while (Math.max(a.length(),b.length()) >= count){
						try {
							if (b.charAt(count) == a.charAt(count)) {
								count++;
								continue;
							} else if (b.charAt(count) > a.charAt(count)) {
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
							}else if(a.length() > b.length()){
								if(a.charAt(count) < b.charAt(count-1)){
									countMin = j;
								}else{
									countMin = i;
								}
							}
							break;
						}
					}
				}

			}
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
	public String solution_other(int[] numbers){
		String answer = "";

		//int 배열을 String 배열로 변환
		String[] arr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			arr[i] = (String.valueOf(numbers[i]));
		}

		//배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2+s1).compareTo(s1+s2);
			}
		});

		//0000 처럼 0으로만 구성되어있으면 0 return
		if (arr[0].equals("0")) return "0";

		//그 외의 경우 순차적으로 연결하여 answer return
		for (int i = 0; i < arr.length; i++) {
			answer+=arr[i];
		}
		return answer;
	}

	/**
	 * 두 수 배우는 다른 사람 코드..!
	 */
	public String solution_other_2(int[] numbers) {
		String answer = "";

		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, (a, b) -> {
			String as = String.valueOf(a), bs = String.valueOf(b);
			return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
		});
		StringBuilder sb = new StringBuilder();
		for(Integer i : list) {
			sb.append(i);
		}
		answer = sb.toString();
		if(answer.charAt(0) == '0') {
			return "0";
		}else {
			return answer;
		}
	}

	@Test
	public void checkResult() {
	//	Assert.assertEquals("6210", solution(new int[]{6, 10, 2}));
		Assert.assertEquals("9534330", solution(new int[]{3, 30, 34, 5, 9}));
	}
}
