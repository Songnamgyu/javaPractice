package com.song.practice.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ApplicationMap {
	
	
	public static void main(String[] args) {

		
		HashMap	hmap = new HashMap();
		
		hmap.put("1", 123);
		hmap.put("2", "오로롤로");
		hmap.put("3", "하이");
		hmap.put("4", "sdja");
		hmap.put("5", "dsda");
		
		System.out.println(hmap);
	
		/*키는 중복 저장되지 않는다(Set의 특징) 만약 키가 중복되면 가장 큰 키에 해당하는 값으로 덮어쓴다(Override)*/
		hmap.put("5", "banana");
		System.out.println(hmap);
		
		/*값은 중복이 가능하다 (list의 특징) */
		hmap.put("6", "하이");
		hmap.put("7", "오로롤로");
		System.out.println(hmap);
		
		/*값 객체를 가지고 올 떄*/
		System.out.println(hmap.get("7"));
		
		/*키 값으로 객체를 삭제 가능*/
		System.out.println("hmap.remov()이용 : "  + hmap.remove("7"));
		System.out.println(hmap);
	
		/*저장된 객체의 수 */
		System.out.println("hmap의 저장된 수 " + hmap.size());
		
		
		HashMap<String,String> hmap2 = new HashMap<>();
		
		hmap2.put("1", "java");
		hmap2.put("2", "oracle");
		hmap2.put("3", "JS");
		hmap2.put("4", "JQuery");
		hmap2.put("5", "HTML");
		 
		/*연속 처리하기 위한 방식으로는 HashMap에서는 독특한 방식으로 처리해줘야한다 .
		 * 1. keySet()을 이용해서 키만 따로 set으로 만들고 iterator()로 키에 대한 목록을 만듦*/
		
//		Set<String> keySet = hmap2.keySet();
//		Iterator<String> keyIter = keySet.iterator();
		
		Iterator<String> keyIter = hmap2.keySet().iterator();
		List<String> list = new ArrayList<>();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			list.add(key);
			String value = hmap2.get(key);
			
			
			System.out.println(key + "=" + value);
		}
	
	
	}

}
