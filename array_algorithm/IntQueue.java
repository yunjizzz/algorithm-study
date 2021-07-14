package array_algorithm;

public class IntQueue {
    //큐의 최대 용량을 저장하는 필드
    private int max;
    //인큐하는 데이터 가운데 첫번째 요소의 인덱스를 저장
    private int front;
    //인큐한 데이터 가운데 맨 나중에 넣은 요소의 하나 뒤의 인덱스를 저장하는 필드
    private int rear;
    //현재 데이터의 수
    private int num;
    //큐로 사용할 배열
    private int[] queue;

    //실행시 예외 : 큐가 비어있을 경우
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){}
    }
    //실행시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException(){}
    }

    //생성자
    public IntQueue(int capacity){
        num = front = rear = 0;
        max = capacity;
        try{
            queue = new int[max]; // 큐 본체용 배열을 생성
        }catch(OutOfMemoryError e){ // 생성실패
            max = 0;
        }
    }

    /**
     * 큐에 데이터 넣기
     * @param x
     * @return
     * @throws OverflowIntQueueException
     */
    public int enque(int x) throws OverflowIntQueueException{
        if(num >= max)
            throw new OverflowIntQueueException();
        queue[rear++] = x;
        num++;
        if(rear == max)
            rear=0;
        return x;
    }

    /**
     *
     * 큐에서 데이터를 디큐하고 그 값을 반환하는 메서드
     * @return
     * @throws EmptyIntQueueException
     */
    public int deque() throws EmptyIntQueueException{
        if(num <=0)
            throw new EmptyIntQueueException();
        int x = queue[front++];
        num--;
        if(front == max)
            front = 0;
        return x;
    }

    /**
     * 큐에서 데이터를 피크
     * @return
     * @throws EmptyIntQueueException
     */
    public int peek() throws EmptyIntQueueException{
        if(num <= 0)
            throw new EmptyIntQueueException();
        return queue[front];
    }

    public int indexOf(int x){
        for(int i =0; i< num; i++){
            int idx = (i+front) % max;
            if(queue[idx] == x)
                return idx; //검색 성공
        }
        return -1; // 검색 실패
    }

    /**
     * 큐를 비움
     */
    public void clear(){
        num = front = rear = 0;
    }

    /**
     * 큐의 용량을 변환
     * @return
     */
    public int capacity(){
        return max;
    }

    /**
     * 큐에 쌓여있는 데이터 수를 반환
     * @return
     */
    public int size(){
        return num;
    }

    /**
     * 큐가 비어있나요?
     * @return
     */
    public boolean isEmpty(){
        return num <= 0;
    }

    /**
     * 큐가 가득 찼나요?
     * @return
     */
    public boolean isFull(){
        return num >= max;
    }

    public void dump(){
        if(num <= 0)
            System.out.println("큐가 비어 있어요");
        else{
            for(int i=0; i <num; i++){
                System.out.println(queue[(i+ front) % max] + "");
            }
        }
    }

}
