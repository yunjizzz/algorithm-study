package basic;

import java.util.Scanner;

public class BasicAlgorithm9 {
	

	/*	
	 * 두 수의 차를 구한다.
	 * 첫번째 입력한 수는 두번째 입력한 수보다 무조건 커야한다!!
	 * 굿굿
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a;
		int b;
		System.out.println("a와 b의 합을 구함");
		
		do {
			System.out.println("a의값");
			a = in.nextInt();
		}while(a<=0);
		
		do {
			System.out.println("b의값");
			b = in.nextInt();
		}while(b<=a);
		
		System.out.println("두수의 차는" + (b-a) + "입니다.");
	}
	


}
