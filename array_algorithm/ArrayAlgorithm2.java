package array_algorithm;

public class ArrayAlgorithm2 {

	
	/*
	 배열숭서를 바꾸어보아라
	{1,2,3,4,5,6,7,8,9} 라면
	{9,8,7,6,5,4,3,2,1} 로 바꾸기
	
	*/
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
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
