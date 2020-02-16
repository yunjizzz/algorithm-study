package basic;

public class BasicAlgorithm7 {
	
	public static void main(String[] args) {
		System.out.println(solution(3,5));
		System.out.println(solution(1,3));
		System.out.println(solution(6,4));
		System.out.println(solution(1,5));
		System.out.println(solution(1,100));
		System.out.println(solution(2,3));
	}
	
/*	
 * 두 수 a,b 를 포함하여 두수 사이의 모든 수를 더한값을 구하여라
 * 예를들면 3,5 일경우 3+4+5 = 12
 * 
*/	
	public static int solution(int num1,int num2) {
		int result=0;
		
		//a와 b의 대소관계가 정해져 있지 않기 때문에
		//Math를 이용한 최소 최대 값을 구한 후 계산~!아주 쉽죠옹 이렇게 코테나오면 좋겠다.....!
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		for(int i=min; i<=max; i++) {
			result += i;
		}
		return result;
	}

}
