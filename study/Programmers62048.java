package study;

/*멀쩡한 사각형
문제 설명
가로 길이가 Wcm, 세로 길이가 Hcm인 직사각형 종이가 있습니다. 종이에는 가로, 세로 방향과 평행하게 격자 형태로 선이 그어져 있으며,
모든 격자칸은 1cm x 1cm 크기입니다. 이 종이를 격자 선을 따라 1cm × 1cm의 정사각형으로 잘라 사용할 예정이었는데,
누군가가 이 종이를 대각선 꼭지점 2개를 잇는 방향으로 잘라 놓았습니다. 그러므로 현재 직사각형 종이는 크기가 같은 직각삼각형 2개로 나누어진 상태입니다.
새로운 종이를 구할 수 없는 상태이기 때문에, 이 종이에서 원래 종이의 가로, 세로 방향과 평행하게 1cm × 1cm로 잘라 사용할 수 있는 만큼만 사용하기로 하였습니다.
가로의 길이 W와 세로의 길이 H가 주어질 때, 사용할 수 있는 정사각형의 개수를 구하는 solution 함수를 완성해 주세요.

제한사항
W, H : 1억 이하의 자연수
입출력 예
W	H	result
8	12	80
입출력 예 설명
입출력 예 #1
가로가 8, 세로가 12인 직사각형을 대각선 방향으로 자르면 총 16개 정사각형을 사용할 수 없게 됩니다.
원래 직사각형에서는 96개의 정사각형을 만들 수 있었으므로,96 - 16 = 80 을 반환합니다.

 */

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class Programmers62048 {

	/**
	 * 유클리드 호제법에 의한 최대 공약수로 응용 계산!
	 * 너무 어려워서 다른 분들 푸신 법 참고해따... 부족부족..
	 * 채점을 시작합니다.
	 * 정확성  테스트
	 * 테스트 1 〉	통과 (0.03ms, 51.7MB)
	 * 테스트 2 〉	통과 (0.04ms, 53.2MB)
	 * 테스트 3 〉	통과 (0.02ms, 52.2MB)
	 * 테스트 4 〉	통과 (0.04ms, 53MB)
	 * 테스트 5 〉	통과 (0.03ms, 52.4MB)
	 * 테스트 6 〉	통과 (0.05ms, 51.9MB)
	 * 테스트 7 〉	통과 (0.03ms, 52.4MB)
	 * 테스트 8 〉	통과 (0.03ms, 52.9MB)
	 * 테스트 9 〉	통과 (0.05ms, 53MB)
	 * 테스트 10 〉	통과 (0.04ms, 53.1MB)
	 * 테스트 11 〉	통과 (0.04ms, 51.9MB)
	 * 테스트 12 〉	통과 (0.03ms, 53.1MB)
	 * 테스트 13 〉	통과 (0.04ms, 52.5MB)
	 * 테스트 14 〉	통과 (0.04ms, 52.4MB)
	 * 테스트 15 〉	통과 (0.04ms, 52.5MB)
	 * 테스트 16 〉	통과 (0.05ms, 53MB)
	 * 테스트 17 〉	통과 (0.04ms, 52.1MB)
	 * 테스트 18 〉	통과 (0.04ms, 52.7MB)
	 */
	public long solution(long w,long h) {
		long origin = w*h;
		long gcf = GCF(Math.max(w,h),Math.min(w,h));
		return origin - ((w/gcf)+(h/gcf)-1) * gcf;
	}

	public long GCF(long x, long y){
		if(y==0) return x;
		return GCF(y,x%y);
	}

	/**
	 * 한 수 배우는 다른 사람 코드..!
	 */
	public long solution_other(long w, long h){
		long totalCount = (long) w * (long) h;
		long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();

		return totalCount - diagonalCount;
	}


	@Test
	public void checkResult() {
		Assert.assertEquals(80, solution(8, 12));
		Assert.assertEquals(80, solution(12, 8));
		Assert.assertEquals(12, solution(4, 4));
	}
}
