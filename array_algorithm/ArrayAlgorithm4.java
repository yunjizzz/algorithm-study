package array_algorithm;

public class ArrayAlgorithm4 {

	
	/*
	 모든 배열의 요소를 더하는 메소드를 작성하라!!
	 1+2+3+4+5 이런순서로
	
	*/
	public static void main(String[] args) {
		
		int[] arr = {5,6,10,2,4,1};
		
		
		System.out.println(solution(arr));
		
		
	}
	
	
	// 모든 배열요소를 더하라
	// 초~간단
	public static int solution(int[] arr) {
		int rtn =0; 
		
		for(int i=0; i < arr.length; i++) {
			rtn += arr[i];
		}
		
		return rtn;
	}
}
