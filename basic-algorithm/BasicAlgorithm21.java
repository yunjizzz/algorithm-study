package basic;

public class BasicAlgorithm21 {
	
	/*	
	 * n단의 피라미드를 출력하는 메서드를 작성하시옹!!!
	 * 예를들어 3단이면 아래와 같이 출력
	 *     *
	 *   * * *
	 * * * * * *
	 * 
	 */
	public static void main(String[] args) {
		
		spira(10);
		
		System.out.println("피라미드를 구현해라잉 끝~~! 진짜쉽죠잉");
	}
	
	//피라미드 별찍이이이이!!!!!
	private static void spira(int n) {
		int tmp= n;
		
		for(int i=0; i<n; i++) {
			for(int k=n-i;k>1;k--) {
				tmp=k;
				System.out.printf(" ");
			}
			for(int j=tmp-1; j<=(i*2)+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
