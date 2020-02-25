package test;

public class Codility2 {


	public static void main(String[] args) {
		
		
		String size = "baaabbabbb";
		
		//int result = solution(size);

		//System.out.println(result);
	}
	/*
	 * public static int solution(String N) { String binary =
	 * Integer.toBinaryString(N);
	 * 
	 * System.out.println(binary);
	 * 
	 * if(binary.indexOf('1')== -1){ return 0; }
	 * 
	 * int num = 0; int compareNum =0;
	 * 
	 * for(int i=binary.indexOf('1')+1; i < binary.length(); i++){
	 * System.out.println(i+"num"+num+",compareNum"+compareNum);
	 * if(binary.charAt(i)=='1'){ if(binary.lastIndexOf('1')==i){ return compareNum
	 * > num ? compareNum : num ; }else{ compareNum = (compareNum > num ? compareNum
	 * : num); num= 0; } }else{ num++; } } return compareNum; }
	 */
	
}
