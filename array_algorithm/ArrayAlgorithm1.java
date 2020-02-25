package array_algorithm;

public class ArrayAlgorithm1 {

	public static void main(String[] args) {
		
		int[] hegiht = {172,153,192,140,165};
		
		
		System.out.println(solution(hegiht));
		
	}
	/*
	 
	 배열의 최대값을 구하는 메서드
	전달받은 배열에서 최대값을 return 하랏!
	
	*/
	public static int solution(int[] arr) {
		int result = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(result < arr[i]) result = arr[i];
		}
		return result;
	}
}
