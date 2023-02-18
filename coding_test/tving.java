package coding_test;

import java.util.TreeSet;

public class tving {

    public static void main(String[] args) {
        int[][] office = {{1, 0, 0, 0}, {0, 0, 0, 1}, {0, 0, 1, 0}, {0, 1, 1, 0}};
        int k = 2;
        System.out.println(solution(office, k));

    }

    public static int solution(int[][] office, int k) {

        TreeSet<Integer> set = new TreeSet<>();
        int count = office.length - k + 1;
        for(int start=0; start < count; start++){
            for(int repeat=0; repeat <= count; repeat++){
                int sum =0;
                for (int i = start; i < start+k; i++) {
                    int n = start;
                    for (int j = 0; j < count; j++) {
                        sum += office[i][j];
                    }
                }
                System.out.println("sum ========================= " + sum);
                set.add(sum);
            }
        }
        return set.last();
    }
}