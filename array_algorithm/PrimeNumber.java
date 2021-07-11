package array_algorithm;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 소수 찾기
 * 소수는 1과 자기자신이외에는 나누어 지지 않는 수를 말한다.
 * 1은 소수가 아니고, 2는 소수다.
 */
public class PrimeNumber {

	/**
	 * @param originNum 이하의 소수를 찾는다.
	 * @return
	 */
	public int solution(int originNum) {
		List<Integer> primeList = new ArrayList<>();
		//2,3은 소수이다.
		if(originNum < 2){
			return 0;
		}else if( originNum == 2){
			return 1;
		}
		primeList.add(2);
		primeList.add(3);

		for(int i=5; i <= originNum; i+=2){ // +2 를 한다. 홀수만!
			boolean flag =false;
			for(int j=1; primeList.get(j) * primeList.get(j) <=i; j++){
				if(i % primeList.get(j) == 0){ //나누어 떨어지면 소수가 아니다.
					flag = true;
					break;
				}
			}
			if(!flag){
				primeList.add(i);
			}
		}
		return  primeList.size();
	}
	@Test
	public void checkResult() {
		Assert.assertEquals(168, solution(1000));
		Assert.assertEquals(4, solution(10));
		Assert.assertEquals(1229, solution(10000));
	}
}
