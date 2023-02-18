package coding_test;

import java.util.List;
import java.util.TreeSet;

public class tving2 {

    public static void main(String[] args) {

        int k = 4;
        System.out.println(solution(11));

    }

    public static long solution(long k) {

        TreeSet<Long> set = new TreeSet<>();

        for(int i=0; i <k; i++){
            long value = (long) Math.pow(3,i);
            set.add(value);
            for(int j=0; j < set.size(); j++){
                value += set.iterator().next();
                set.add(value);
            }
        }
        List<Long> list = List.copyOf(set);
        long answer = list.get((int) k);
        return answer;
    }
}