package basic_algorithm;

public class BasicAlgorithm6 {
	
	public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(2));
		System.out.println(solution(1));
	}
	
/*	
 * 가우스의 덧셈공식을 사용하여
 * 가우스의 덧셈공식은 나의 블로그를 참고 하도록!!
 * 1-n 까지의 더한값을 구하여라.
 * 
*/	
	public static int solution(int num) {
		return ((num+1)*num)/2;
	}

}
