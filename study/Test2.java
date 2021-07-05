package study;

public class Test2 {

	
	

	public static void main(String[] args) {
		
		
		int[][] ints =  {{1,2},{4,2},{3,1},{4,5}};
		int size = 456789;
		System.out.println(solution(size));
	}
	
	public static int solution(int N) {

		int sum = 0; 

			sum = plus(N);
			while(true) {
				if((sum/10)<1) {
					break;
				}else {
					sum = plus(sum);
				}
			}
			System.out.println(sum);
		for(int i=0; i<(int)Math.log10(N)+1; i*=10) {
			
		}
		return 0;
	}
	private static int plus(int N) {
		int sum = 0;
		while(N!=0){
		    sum += N%10;
		    N /= 10;
		}
		return sum;
	}
	
}
