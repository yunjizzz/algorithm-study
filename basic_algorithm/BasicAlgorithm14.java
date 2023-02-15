package basic_algorithm;

public class BasicAlgorithm14 {
	
	/*	
	 * 다중 루프!!
	 * 제일제일 초초초초초초기초 문제
	 * 덧셈식을 만드시오.
	 * 곱셈표 응용하기~
	 * 위에 옆에 구분선과 더하는수가 있는 덧셈표를 만드시오.
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("덧셈표 시이이작");
		
		System.out.printf("   | ");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+-----------------------------");


		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d | ", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}	
		System.out.println("덧셈표 끄으으읏!!! 진짜쉽죠잉");
	}
	


}
