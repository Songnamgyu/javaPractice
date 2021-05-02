package com.song.practice.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ApplicationSet {
	
	public static void main(String[] args) {
		
		/*HashSet 인스턴스 생성*/
		HashSet<String> hset = new HashSet<>();
		
		Set<String> hset2 = new HashSet<>();
		
		/*set에 값을 넣을때 add()라는 메소드를 넣는다*/
		hset2.add("아이유");
		hset2.add("현아 ");
		hset2.add("유나");
		hset2.add("수지");
	
		/*순서 유지 x*/
		System.out.println(hset2);
		
		/*중복 하지 않음 */
		hset2.add("아이유");
		System.out.println(hset2);
		
		/*저장 갯수 */
		System.out.println(hset2.size());
		/*요소 포함 */
		System.out.println(hset2.contains(new String("아이")));
		System.out.println(hset2.contains("아이"));
		
		/*저장된객체를 하나씩 꺼내는 기능이 없다 
		 * 방법 : 1. toArray()가 Set에 있는데 이걸 이용해서 배열로 바꾸고 for loop를 이용한다*/
		Object[] arr = hset2.toArray(); 
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println("arr의" + i + "번 째 요소 : " + arr[i]);
		}
		
		/*2. iterator() 목록 만들어 연속 처리*/
		Iterator<String> iter = hset2.iterator();
		List<String> setList = new ArrayList<>();
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
//			System.out.println(setList.add(iter.next()));
		}
		
		
		System.out.println("setList : " + setList);
		/*지우기 */
		hset2.clear();
		System.out.println(hset2.isEmpty());
	
	}
	

}
