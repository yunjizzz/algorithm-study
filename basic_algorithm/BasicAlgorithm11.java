package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm11 {

	/*
	 * 2자리의 양수를 입력받습니다.(10~99) 1자리나 3자리는 출력하지않습니다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a;

		do {
			System.out.println("숫자를 입력하세요");
			a = in.nextInt();

		} while (a < 10 || a > 99);

		System.out.println("입력한 수는 " + a + "입니다.");
	}

}
