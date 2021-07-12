package array_algorithm;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 스택 구현하기.
 * 후입선출 ( Last In First Out )
 * 쉽게 말하면, 제일 늦게 출근한 사람이 제일 일찍 퇴근하는 것과 같음..
 */
public class IntStack {
	private int max;
	private int pointer;
	private int[] stack;

	public IntStack(int capacity){
		pointer = 0;
		max = capacity;
		try{
			stack = new int[max]; //스택 본체용 배열
		}catch (OutOfMemoryError e){ //생성할 수 없다.
			max =0;
		}
	}

	/**
	 *  데이터를 stack에 넣기
	 * @param x
	 * @return
	 * @throws OverflowIntStackException
	 */
	public int push(int x) throws OverflowIntStackException{
		if(pointer == max)
			throw new OverflowIntStackException();
		return stack[pointer++] = x;
	}

	/**
	 * 데이터를 stack에서 빼기
	 * @return
	 * @throws EmptyIntStackException
	 */
	public int pop() throws EmptyIntStackException{
		if(pointer <= 0)
			throw new EmptyIntStackException();
		return stack[--pointer];
	}

	/**
	 *  가장 상위에 있는 값 엿보기 (pop처럼 빼지는 않는다.)
	 * @return
	 * @throws EmptyIntStackException
	 */
	public int peek() throws EmptyIntStackException{
		if(pointer <=0)
			throw new EmptyIntStackException();
		return stack[pointer-1];
	}

	/**
	 * 스택에서 x를 찾아서 인텍스를 반환. 없으면 -1 반환
	 * @param x
	 * @return
	 */
	public int indexOf(int x){
		for(int i= pointer-1; i >=0; i--){ // 위에서 부터 선형검색
			if(stack[i] == x)
				return i; //검색 성공
		}
		return -1; //검색실패
	}

	/**
	 * 용량을 확인
	 * @return
	 */
	public int capacity(){
		return max;
	}

	/**
	 * 스택비우기
	 */
	public void clear(){
		pointer = 0;
	}

	/**
	 * 실제 stack 크기 반환
	 * @return
	 */
	public int size(){
		return pointer;
	}

	/**
	 * 스택이 비었는가?
	 * @return
	 */
	public boolean isEmpty(){
		return pointer <= 0 ;
	}

	/**
	 * 스택이 가득 찼는가?
	 * @return
	 */
	public boolean isFull(){
		return pointer >= max;
	}

	/**
	 * 스택을 바닥부터 꼭대기까지 출력
	 */
	public void dump(){
		if(pointer <= 0)
			System.out.println("스택이 비었습니다.");
		else{
			for(int i=0; i < pointer; i++){
				System.out.println(stack[i] + "");
			}
		}
	}



	//실행시 예외, 스택이 비어있음.
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException(){}
	}

	//실행시 예외, 스택이 가득 차있음.
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException(){}
	}



	@Test
	public void checkResult() {
	}
}
