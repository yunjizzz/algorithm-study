package basic_algorithm;

public class BasicAlgorithm5 {
	
	public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(2));
		System.out.println(solution(1));
	}
	
/*	
 * 1-n까지의 정수의 합을 구하여라
 * 
*/	
	public static int solution(int num) {
		int tmp=num;
		
		for(int i=0; i<num; i++) {
			tmp += i;
		}
		
		return tmp;
	}

}
