package coding_test;

public class dunamu {


    // 방향 동, 남, 서, 북
    static int[] x = {0,+1,0,-1};
    static int[] y = {+1,0,-1,0};

    public static void main(String[] args) {
        int[][] office = {{5,-1,4},{6,3,-1},{2,-1,1}};
        int r = 1;
        int c = 0;
        String[] arr= {"go","go","right","go","right","go","left","go"};
        System.out.println(solution(office,r,c,arr));

    }
    public static int solution(int[][] office, int r, int c, String[] move) {
            // go 바라보고 있는 방향으로 전진, 격자를 벗어나거나 물건이 놓여있으면 다음 명령 수행
            // left 바라보고 있는 방향을 기준 왼쪽
            // right 바라보고 있는 방향을 기준 오른쪽
            // 로봇청소기가 방문한 칸은 먼지의 양이 0
            // -1은 물건이 놓여있어 지나갈 수 없는 칸!
            // 항상 북쪽을 향하고 있음
            // r 북 - 남 방향
            // c 서 - 동 방향

            // 5 -1 4
            // 6  3 -1
            // 2 -1 1
            int sum = 0;

            // 처음 시작 북
            int direction = 3;
            sum += office[r][c]; // 먼지 추가
            office[r][c] = 0; // 청소함

            // 현재 위치
            int nowX = r;
            int nowY = c;

            for(String act : move){
                if("go".equals(act)){
                    if(nowX + x[direction] < 0
                            || nowY + y[direction] < 0
                            || nowX + x[direction] >= office.length
                            || nowY + y[direction] >= office.length
                            || (-1 == office[nowX + x[direction]][nowY + y[direction]])
                    ){
                        // 이동할 수 없는 위치
                        continue;
                    }else{
                        nowX = nowX + x[direction];
                        nowY = nowY + y[direction];
                        sum += office[nowX][nowY];
                        office[nowX][nowY] = 0;
                    }
                }else if("right".equals(act)){
                    direction = direction == 3 ? 0 : direction+1;
                }else if("left".equals(act)){
                    direction = direction == 0 ? 3 : direction-1;
                }
            }

            return sum;
        }
    }