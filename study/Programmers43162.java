package study;

public class Programmers43162 {

    static boolean [] visited ;
    static int size;
    static int [][] data;
    static int answer = 0;
    public static void main(String[] args) {
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        int n = 3;
        System.out.println(solution(n, computers));
    }

    public static int solution(int n, int[][] computers) {

        visited = new boolean[n];
        size = n;
        data = computers;
        for(int j = 0; j<size ; j++){
            if(!visited[j]){
                search(j);
                answer++;
            }
        }
        return answer;
    }

    public static void search(int i){
        visited[i] = true;

        for(int j=0; j<size ; j++){
            if(i!=j && data[i][j]==1 && !visited[j]){
                search(j);
                System.out.println("오앙?" + j);
            }
        }
    }
}
