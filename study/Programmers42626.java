package study;

import java.util.SortedSet;
import java.util.TreeSet;

public class Programmers42626 {

    public static void main(String[] args) {

        int[] value = {1,2,3,9,10,12};

        System.out.println(solution(value,7));

    }

    private static int solution(int[] scoville, int K) {
        int count=0;

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for(int i : scoville){
            if(i < K){
                treeSet.add(i);
            }else {
                break;
            }
        }

        while(treeSet.first() < K){
            if(treeSet.size() < 2) return -1;
            int a = treeSet.pollFirst();
            int b = treeSet.pollFirst();

            treeSet.add(a + (b*2));
            count++;
        }

        return count;
    }


}
