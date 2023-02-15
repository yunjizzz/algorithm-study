package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm15 {
	
	/*	
	 * 기초기초
	 * 입력한 수를 한변으로 하는 정 사각형을 *기호로 출력하시오
	 * 예) 3
	 * ***
	 * ***
	 * ***
	 * 이런식으로!!
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		int a;
		System.out.println("정사각형 별찍기 시작");
		do {
			System.out.println("숫자를 입력하세요!~");
			a = in.nextInt();
			
		}while(a <0);

		for (int i = 0; i < a; i++) {
			System.out.printf("*");
			for (int j = 1; j < a; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}	
		
		System.out.println("정사각형끝 진짜쉽죠잉");
	}
}
