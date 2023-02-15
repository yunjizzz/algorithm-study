package study;

/*
 */
public class Programmers12924 {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}


	public static int solution(int n) {
		int count=1;

		for(int i=1; i < n ; i++){
			int sum = i;
			for(int j=i+1; j < n; j++){
				sum = sum+j;
				if(sum > n){
					break;
				}
				if(sum == n){
					count++;
				}
			}
		}
		return count;
	}
}
