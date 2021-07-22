package array_algorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * 단순 삽입 정렬
 *
 */
public class InsertionSort {

    public static int solution(int a,int b) {
        if( b == 0) return a;
        return solution(b,a%b);
    }

}

