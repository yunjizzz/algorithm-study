package study;

import java.util.Arrays;
import java.util.HashSet;

public class Test4 {

	public static void main(String[] args) {
		
		
		int[] arr =  {1,2,3};
		int size = 8;
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr) {
		int result = 1 ;
		Arrays.sort(arr);
		HashSet<Integer> sets = new HashSet<Integer>();
		
		

		for(int i=0; i<arr.length; i++){
			for(int j=1; j<arr[i]; j++) {
				if(arr[i] % j ==0){
					sets.add(j);
					System.out.println(j);
	            }
			}
		}
		
		
		for(int num : sets) {
			System.out.println(num);
			result*=num; 
		}
		
		
		return result;
	}
	
	
	
	
	
}
