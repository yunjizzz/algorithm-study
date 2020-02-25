package basic_algorithm;

public class BasicAlgorithm22 {
	
	/*	
	 * n단의 피라미드를 출력하는 메서드를 작성하시옹!!!
	 * 예를들어 3단이면 아래와 같이 출력
	 *     1
	 *   2 2 2
	 * 3 3 3 3 3
	 * 
	 */
	public static void main(String[] args) {
		//99까지만하세요오오옹 100부터 또 예외처리추가해야댐
		spira(12);
		
		System.out.println("숫자가 나오는 피라미드를 구현해라잉 끝~~! 진짜쉽죠잉");
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
				System.out.printf(""+(i+1));
				if(i+1>=10) {
					j++;
				}
			}
			System.out.println();
		}
	}
}
