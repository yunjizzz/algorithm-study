package study;

import java.util.*;

public class Programmers42586 {

    public static void main(String[] args) {

        solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});

    }

    public static int[] solution(int[] progresses, int[] speeds){

        Queue<Integer> queue = new LinkedList<Integer>();
        List<Integer> releaseCount = new ArrayList<Integer>();

        for(int i=0; i < progresses.length; i++){
            int day = 1;

            //기준일자
            int value = progresses[i] + speeds[i];

            //개발완료(100%)까지 몇일이 걸리는지 계산
            while(value < 100){
                day++;
                value = progresses[i] + (speeds[i] * day);
            }

            // 큐에 데이터가 없으면 해당 일 적재
            if(queue.size() == 0){
                queue.add(day);
            }else{
                if(queue.peek() > day){
                    //처음 적재된 날보다 적게 걸리는 경우, 배포시 기능 추가
                    queue.add(day);
                }else{
                    //처음 적재일 보다 오래 걸리는 경우,
                    //지금까지 쌓인 배포기능 배포 후 다음 배포 준비
                    releaseCount.add(queue.size());
                    queue.clear();
                    queue.add(day);
                }
            }
        }
        //큐에 마지막 배포할 거 남았으면, 해당 배포기능 추가 후 종료
        if(queue.size() != 0) releaseCount.add(queue.size());

        //지금까지 배포 list -> 배열로 변경 후 결과리턴
        int[] result = new int[releaseCount.size()];
        for(int i=0; i < releaseCount.size(); i++){
            result[i] = releaseCount.get(i);
        }
        return result;
    }
}
