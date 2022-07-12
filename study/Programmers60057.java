package study;

import java.util.*;

public class Programmers60057 {

    public static void main(String[] args) {

        String text = "abcabcabcabcdededededede";
        System.out.println(solution(text));
    }

    static int solution(String text){

        int textLength = text.length()-1;
        int compareLength = textLength/2;
        Queue<String> queue = new LinkedList<>();


        for(int i=2; i < compareLength; i++){
            String compare = "";
            for(int j=0; j < textLength-i; j+=i){
                System.out.println("i" + i + "j" + j + "  " +text.substring(j,j+i));
                queue.add(text.substring(j,j+i));
            }

            compare = queue.poll();

            while(!queue.isEmpty()){
                if(compare.equals(queue.peek())){
                    queue.poll();
                }else{

                }
            }


        }
        return 0;
    }
}
