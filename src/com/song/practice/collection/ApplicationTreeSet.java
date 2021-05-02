package com.song.practice.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ApplicationTreeSet {

	public static void main(String[] args) {

		/*TreeSet 클래스*/
		/* TreeSet은 데이터가 정렬된 상태로  저장되는 이진 검색트리형태로 요소를 저장한다
		 * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본동작 시간이 매우빠르다.
		 * JDK1.2 부터 제공되고있다.
		 * Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태로 유지한다는 것이 다른점이다.
		 * 
		 * */

		TreeSet<String> test = new TreeSet<>();
		
		test.add("java");
		test.add("oracle");
		test.add("jdbc");
		test.add("css");
		test.add("html");
		
		System.out.println(test);
		
		Iterator<String> it = test.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Object[] arr  = test.toArray();
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println("arr["+ i +"] : " + arr[i]);
		
		
		}
		
	}
}
