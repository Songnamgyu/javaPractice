package com.song.practice.collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ApplicationSet2 {
	
	public static void main(String[] args) {
		
		/*LinkedHashSet 
		 * HashSet이 가지고 있는 기능을 다 가지고 있다.
		 * 추가적으로 저장 순서를 유지할 수 있음
		 * JDK1.4부터 제공 된 거*/
		
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		 
		lhset.add("아이유");
		lhset.add("수지");
		lhset.add("유나");
		lhset.add("오우야");
	
		System.out.println(lhset);
		
		Set<Integer> lotto = new LinkedHashSet<>();
		
		while(lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		
		/*TreeSet은 기본적으로 오름 차순 기능이 있다.*/
		System.out.println("lotto : " + lotto);
		
		lotto = new TreeSet<>(lotto);
		System.out.println("lotto 오름차순 될까요  ? :  " + lotto);
		
	}

}
