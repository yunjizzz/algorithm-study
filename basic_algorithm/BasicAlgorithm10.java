package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm10 {
	
	/*	
	 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요
	 * 예를들어 135 이면 3을 출력 12345 이면 5를 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a = in.nextInt();
		int i=0;
		do {
			a /= 10;
			i++;
		}while(a>0);
		
		System.out.println("입력한 자릿수는 " + i + "입니다.");
	}
	


}
