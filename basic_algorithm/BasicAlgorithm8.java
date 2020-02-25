package basic_algorithm;

import java.util.Scanner;

public class BasicAlgorithm8 {
	

	/*	
	 * do while 사용예시 0보다 큰값을 입력했을 때만
	 * 1-n까지의 합을 구한다.
	 */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구함");
		
		do {
			System.out.println("n의값");
			n = in.nextInt();
		}while(n<=0);
		
		int sum=0;
		for(int i=1; i<=n; i++)
			sum+=i;
		
		System.out.println("1부터"+n+"까지의 합은" + sum + "입니다.");
	}
	


}
