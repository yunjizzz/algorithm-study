package basic_algorithm;

public class algoriTest1 {
public static void main(String[] args) {
	
		int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
		int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
		
		System.out.print("답은" + solution(arr1,arr2));
		
		
		int[][] result =solution(arr1,arr2);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(result[i][i]);
		}
		
		
		
		
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		 int[][] result = new int[arr2.length][arr1.length];
		 
		 int total = 0;
		 
		 for(int cnt=0; cnt<result.length;cnt++) {
			 for(int i=0; i<arr1[cnt].length; i++) {
				 for(int j=0; j<arr2[i].length; j++) {
					 total += (arr1[cnt][j] * arr2[j][i]);
					 
				 }
				 result[cnt][i] = total;  
				 total = 0;
			 }
		 }
		return result;
	}
	
}
