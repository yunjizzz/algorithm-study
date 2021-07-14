package array_algorithm;

import java.util.Scanner;

/**
 * intQueue 만든 것 이용하는 class
 */
public class IntQueueTester {
    public static void main(String[] args) {
        Scanner dataIn = new Scanner(System.in);
        IntQueue queue = new IntQueue(64);

        while(true){
            System.out.println("현재 데이터 수" + queue.size() + "/" + queue.capacity());
            System.out.println("1) 인큐 2) 디큐 3) peek 4) dump 0) quit");

            int menu = dataIn.nextInt();
            if( menu == 0) break;
            int x;

            switch (menu){
                case 1:
                    System.out.print("데이터 : ");
                    x = dataIn.nextInt();
                    try{
                        queue.enque(x);
                    }catch (IntQueue.OverflowIntQueueException e){
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = queue.deque();
                    }catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = queue.peek();
                        System.out.println("피크에 있는 데이터는 "+ x + "입니다");
                    }catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 4:
                    queue.dump();
                    break;
            }
        }
    }
}
