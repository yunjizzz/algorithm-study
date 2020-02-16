package basic;

public class BasicAlgorithm19 {
	
	/*	
	 * 오른쪽위!!!!!!!
	 * 직각 이등변 삼각형 출력
	 * 이중루프 응용
	 * 직각 이등변 삼각형을 출력하는 부분을 메서드 형식으로 작성하세요!!!
	 * 
	 */
	public static void main(String[] args) {
		
		triangleRU(7);
		
		System.out.println("오른쪽위 직각 삼각형 끝~~! 진짜쉽죠잉");
	}
	
	//오른쪽 위가 직각인 삼각형 만들기
	private static void triangleRU(int n) {
		for(int i=0; i<n; i++) {
			for(int k=0;k<i;k++) {
				System.out.printf(" ");
			}
			for(int j=n; j>i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
