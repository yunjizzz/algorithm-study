package array_algorithm;

public class ArrayAlgorithm3 {

	
	/*
	 배열요소를  역순으로 바꾸어보아라
	 예시
변경전	 5 10 73 2 -5 42
변경후 	 42 -5 2 73 10 5
	
	*/
	public static void main(String[] args) {
		
		int[] arr = {5,10,73,2,-5,42};
		
		for(int a :solution(arr)) {
			System.out.println(a);
		}
	}
	
	
	// 길이를 2로 나누어서 서로 바꾸기
	public static int[] solution(int[] arr) {
		int [] rtn = arr.clone();
		
		for(int i=0; i < arr.length/2; i++) {
			
			rtn[(arr.length-1)-i] = arr[i];
			rtn[i] = arr[(arr.length-1)-i];
			
		}
		
		return rtn;
	}
}
