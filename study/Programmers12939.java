package study;

import java.util.TreeSet;

public class Programmers12939 {

    public static void main(String[] args) {

        String value = "1 2 3 4";
        String value2 = "-1 -2 -3 -4";

        System.out.println(solution(value2));

    }

    private static String solution(String s) {
        String[] arr = s.split(" ");
        TreeSet<Integer> set = new TreeSet<Integer>();

        for(int i=0; i < arr.length; i++){
            set.add(Integer.parseInt(arr[i]));
        }
        return set.first() + " " +set.last();
    }


}
