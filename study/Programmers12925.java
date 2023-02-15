package study;

import java.util.ArrayList;

/*
 * 
 * 수박수박수박수박수박수?
 * 
문제 설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, 
solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	수박수
4	

 */

public class Programmers12925 {

	public static void main(String[] args) {
		
		
		int a = 4;
		int b = 5;
		String tmp = solution(b);
		System.out.println(tmp);
	}
	
	public static String  solution(int a) {
		int count = 0;
		int tmp = 0;
		String renStr ="";
		String[] waterMelon = {"수","박"};
		 
		do{	 renStr+= waterMelon[tmp];
			if(tmp == 0) tmp = 1;
			else tmp = 0;
			
			count++;
		}while(count<a);
		
		return renStr;
	}
}
