package test;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		
		
		int[] ints =  {5, 3, 9, 13};
		int size = 8;
		solution(ints,size);
	}
	
	public static boolean solution(int[] arr, int n) {
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] < n) {
					System.out.println(arr[i]+arr[j]);
					continue;
				}else if(arr[i]+arr[j] == n ){
					System.out.println(arr[i]+arr[j]);
					return true;
				}
				
			}
			
		}
		return false;
	}
	
}
