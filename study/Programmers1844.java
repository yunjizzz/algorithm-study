package study;

import java.util.LinkedList;
import java.util.TreeSet;

public class Programmers1844 {

    static int[][] arr = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};


    static int[] yMap = {0,0,-1,+1};
    static int[] xMap = {-1,+1,0,0};

    static int result;
    static TreeSet<Integer> set= new TreeSet<>();


    public static void main(String[] args) {
        int[][] arr = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println( solution(arr));
    }



    public static int solution(int[][] maps){
        // 1 0 1 1 1
        // 1 0 1 0 1
        // 1 0 1 1 1
        // 1 1 1 0 1
        // 0 0 0 0 1
        int[][] visited = new int[maps.length][maps.length];
        visited[0][0] = 1;

        var queue = new LinkedList<int[]>();
        queue.add(new int[]{0,0});

        while(!queue.isEmpty()){
            var current = queue.poll();
            var x = current[0];
            var y = current[1];

            for(int i=0; i <4; i++){
                if(y+yMap[i] < 0 || x+xMap[i] < 0 || y+yMap[i] >= arr.length || x+xMap[i] >= arr.length || arr[x+xMap[i]][y+yMap[i]] == 0
                ){
                    continue;
                }
                if(visited[x+xMap[i]][y+yMap[i]] == 0){
                    visited[x+xMap[i]][y+yMap[i]] = visited[x][y] + 1;
                    queue.add(new int[]{x+xMap[i],y+yMap[i]});
                }
            }
        }


        return  visited[maps.length-1][maps.length-1] == 0 ? -1 : visited[maps.length-1][maps.length-1];
    }
}
