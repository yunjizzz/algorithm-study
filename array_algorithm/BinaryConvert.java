package array_algorithm;


import org.junit.Assert;
import org.junit.Test;

/**
 * 진수 변환기 10진수를 n진수로 변환
 * 2진수 부터 32진수 까지 !
 */
public class BinaryConvert {

	public String solution(int originNum, int convertType) {
		String d = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		do{
			sb.append( d.charAt(originNum % convertType));
			originNum /= convertType;
		}while (originNum != 0);
		return sb.reverse().toString();
	}
	@Test
	public void checkResult() {
		Assert.assertEquals("1010", solution(10,2));
		Assert.assertEquals("5DC", solution(1500,16));
		System.out.println(solution(10,3));
	}
}
