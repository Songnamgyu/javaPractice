package com.song.practice.collection;

import java.util.Stack;

public class Application3 {
	
	public static void main(String[] args) {

		
		/*Stack : Stack은 리스트계열로  Vector클래스를 상속받아 구현된 것이다.
		        : 스텍 메모리 구조는  선형메모리 공간에 데이터를 저장하며 후입선출(LIFO - LastInFirstOut)의 방식의 자료구조라 불림
		        : Stack은 Vector 클래스를 상속받아 값을 넣을 때 add()도 가능하지만 push()하는게 바람직하다.*/
		
		Stack<String> stack = new Stack<>();
		stack.push("화이팅");
		stack.push("네카라쿠배");
		stack.push("면접준비");
		stack.push("지치지말자");
		
		System.out.println("stack : " + stack);
		
		/*search()라는 메소드를 이용하면 값을 찾을수 있다.*/
		stack.search(1);
		System.out.println(stack.search("화이팅"));
		
		/*스택에서 값을 꺼낼떄는 두개가있다 peek(), pop()
		 * peak(): 해당스택에 마지막(맨위) 값 반환
		 * pop(): 해당스텍에 마지막 (맨위) 값 반환 후 제거 */
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		
	
	}

}
