package study;

import java.util.TreeSet;

public class Programmers86491 {

    public static void main(String[] args) {

        int[][] sizes= {{10, 7}, {12, 3}, {8, 15}, {14, 7},{5,15}};
        System.out.println(solution(sizes));
    }

    static int solution(int[][] sizes){
        TreeSet<Integer> widthSet = new TreeSet<Integer>();
        TreeSet<Integer> heightSet = new TreeSet<Integer>();

        for(int[] i: sizes){
            if(i[0] > i[1]){
                widthSet.add(i[0]);
                heightSet.add(i[1]);
            }else{
                widthSet.add(i[1]);
                heightSet.add(i[0]);
            }
        }
        return widthSet.last() * heightSet.last();
    }
}
