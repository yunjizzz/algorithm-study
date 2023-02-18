package study;

public class Programmers43165 {

    static int[] numbers= {1,1,1,1,1};
    static int target = 3;
    static int answer = 0;


    public static void main(String[] args) {
        dfs(0,0);

        System.out.println(answer);
    }
    public static void dfs(int index, int sum){
        // 탈출조건
        if(index == numbers.length){
            if(sum == target) answer++;
            return;
        }
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
}
