package com.song.practice.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {

	public static void main(String[] args) {
		
		/*Queue : 선형 메모리 공간에 데이터를 저장하는 선입선출(FIFO - FirstIn/First-out) 방식의 자료 구조이다.
		 *      : Queue 인터페이스  상속받는 하위 인터페이스들은 Deque, BlockingQueue, TransferQueue 등 다양하지만 
		 *      : 대부분 큐는 LinkedList를 이용한다.*/
		
		
		/*Queue 자체로는 인터페이스때문이기떄문에 인스턴스 생성이 불가능하다*/
//		Queue<String> que = new Queue<>();
		
		/*그래서 인스턴스를 생성할 떄는 LinkedList를 많이 사용한다*/
		Queue<String> que = new LinkedList<>();
		
		/*Queue에 대한 데이터를 넣을때는 offer()메소드를 이용한다*/
		que.offer("first");
		que.offer("second");
		que.offer("third");
		que.offer("fourth");
		que.offer("fifth");
		System.out.println("que : " + que);
		
		/*que에서 데이터를 꺼낼때는 peek(), poll()이 있다.
		 * peek() : 해당 큐에 가장맨 앞에 있는 요소를 반환 한다
		 * poll() : 해당 큐에 가장 맨 앞에 있는 요소를 반환 후 제거*/
		
		System.out.println(que.peek());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
	}
}
