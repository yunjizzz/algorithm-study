package basic_algorithm;

public class BasicAlgorithm20 {
	
	/*	
	 * 오른쪽아래 !!!!!!!
	 * 직각 이등변 삼각형 출력
	 * 이중루프 응용
	 * 직각 이등변 삼각형을 출력하는 부분을 메서드 형식으로 작성하세요!!!
	 * 
	 */
	public static void main(String[] args) {
		
		triangleRB(7);
		
		System.out.println("오른쪽아래 직각 삼각형 끝~~! 진짜쉽죠잉");
	}
	
	//오른쪽 아래가 직각인 삼각형 만들기
	private static void triangleRB(int n) {
		for(int i=n-1; i>=0; i--) {
			for(int k=0;k<i;k++) {
				System.out.printf(" ");
			}
			for(int j=n-1; j>=i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
