package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm16 {
	
	/*	
	 * 직각 이등변 삼각형 출력
	 * 이중루프 응용
	 * 왼쪽아래가 직각인 이등변 삼각형을 출력합니다.
	 * 예시 ) 5
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		int a;
		System.out.println("직각삼각형 별찍기 시작");
		do {
			System.out.println("숫자를 입력하세요!~");
			a = in.nextInt();
			
		}while(a <0);

		for (int i = 0; i < a; i++) {
			System.out.printf("*");
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}	
		
		System.out.println("직각 삼각형 끝~~! 진짜쉽죠잉");
	}
}
