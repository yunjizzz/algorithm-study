package basic_algorithm;

public class BasicAlgorithm2 {
	
	public static void main(String[] args) {
		System.out.println(solution(12,4,0,300));
		System.out.println(solution(11,4,9,0));
		System.out.println(solution(12,4,99,12));
		System.out.println(solution(12,4,100,100));
		System.out.println(solution(12,100,0,99));
		System.out.println(solution(12,4,200,300));
	}
	
/*	
 * 네정수의 가장 큰 값 구하기
 * 매-------우 기초
*/	
	public static int solution(int a, int b, int c,int d) {
		int tmp = a;
		
		if(tmp < b) {
			tmp = b;
		}
		if(tmp < c){
			tmp = c;
		}
		if(tmp < d) {
			tmp = d;
		}
		return tmp;
	}

}
