package study;

/**
 * 피보나치 수열
 */
public class Programmers12949 {

	public static void main(String[] args) {

//		int[][] arr1 ={{2,3,2},{4,2,4},{3,1,4}};
//		int[][] arr2 ={{5,4,3},{2,4,1},{3,1,1}};
		int[][] arr1 ={{1,4},{3,2},{4,1}};
		int[][] arr2 ={{3,3},{3,3}};


		System.out.println(solution(arr1,arr2));
	}

	public static int solution(int[][] arr1, int[][] arr2) {
		int[][] result = new int[arr1.length][arr2.length];


		for(int k=0; k < arr1.length; k++){
			for(int i=0; i < arr1[0].length; i++){
				for(int j=0; j < arr2[0].length; j++){
					result[k][i] += arr1[i][j] * arr2[j][i];
				}
			}
		}



		return 1;

	}
}
