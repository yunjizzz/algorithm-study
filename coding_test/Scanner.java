package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 코딩테스트 시 입출력 받는 코딩 테스트 많음!! 
 * 참고
 * 
 */
public class Scanner {
    public static void main(String[] args) throws IOException {
        
        // 입력 첫째줄에 무게와 주얼리 개수가 주어지고
        // 다음 입력부터 하나씩 파싱해서 작업해야 할 떄 
        // 100 2
        // 90 1
        // 70 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int total = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
        	st = new StringTokenizer(br.readLine(), " ");
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
        }
    }
    
}
