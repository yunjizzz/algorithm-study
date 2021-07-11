package study;

import org.junit.Assert;
import org.junit.Test;

/**
 * 최대 공약수
 * 최대 공약수는 유클리드 호제법 공식에 의해 많이 사용된다.
 * 줄여서 GCF라고 많이 사용한다.
 * https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95
 *
 */
public class GreatestCommonFactor {

    public static int solution(int a,int b) {
        if( b == 0) return a;
        return solution(b,a%b);
    }

    @Test
    public void 정답() {
        Assert.assertEquals(21, solution(1071, 1029));
        Assert.assertEquals(4, solution(8, 12));
        Assert.assertEquals(4, solution(12, 8));
    }
}

