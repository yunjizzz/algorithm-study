package array_algorithm;

import java.util.Scanner;

/**
 * intStack 만든 것 이용하는 class
 */
public class IntStackTester {
    public static void main(String[] args) {
        Scanner stackDataIn = new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while(true){
            System.out.println("현재 데이터 수" + stack.size() + "/" + stack.capacity());
            System.out.println("1) push 2) pop 3) peek 4) dump 0) quit");

            int menu = stackDataIn.nextInt();
            if( menu == 0) break;
            int x;

            switch (menu){
                case 1:
                    System.out.print("데이터 : ");
                    x = stackDataIn.nextInt();
                    try{
                        stack.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = stack.pop();
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = stack.peek();
                        System.out.println("피크에 있는 데이터는 "+ x + "입니다");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:
                    stack.dump();
                    break;
            }
        }
    }
}
